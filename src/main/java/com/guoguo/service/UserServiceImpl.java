package com.guoguo.service;

import com.google.common.collect.Lists;
import com.guoguo.common.utils.Response;
import com.guoguo.common.utils.StringTools;
import com.guoguo.common.utils.UUIDUtil;
import com.guoguo.domain.jooq.tables.pojos.TPermissionObj;
import com.guoguo.domain.jooq.tables.pojos.TUserObj;
import com.guoguo.domain.jooq.tables.records.TUserRecord;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

import static com.guoguo.domain.jooq.Tables.*;


/**
 * @author: 刘达
 * @createDate: 2018/6/26 0:15
 * @description:
 */
@Service
public class UserServiceImpl extends ServiceBase implements UserService{

    /**
     * 通过用户名获取角色
     *
     * @param username
     * @return
     */
    @Override
    public Set<String> getRoles(String username) {
        Set<String> roleSet = new HashSet<String>();
        String roleName = create.select(T_ROLE.ROLE_NAME).from(T_USER)
                .innerJoin(T_ROLE)
                .on(T_USER.ROLE_ID.eq(T_ROLE.ID))
                .where(T_USER.USERNAME.eq(username),T_USER.STATUS.eq(1),T_ROLE.AVAILABLE.eq("1"))
                .fetchOne(T_ROLE.ROLE_NAME);
        if(!StringTools.isEmpty(roleName)){
            roleSet.add(roleName);
        }

        return roleSet;
    }

    /**
     * 通过用户名获取权限
     *
     * @param username
     * @return
     */
    @Override
    public Set<String> getPermissions(String username) {
        Set<String> permissionSet = new HashSet<String>();
        List<TPermissionObj> tPermissionObjsList = Lists.newArrayList();
        tPermissionObjsList = create.select(T_PERMISSION.PERMISSION).from(T_USER)
                .join(T_ROLE)
                .on(T_USER.ROLE_ID.eq(T_ROLE.ID))
                .join(T_ROLE_PERMISSION)
                .on(T_ROLE_PERMISSION.ROLE_ID.eq(T_USER.ROLE_ID))
                .join(T_PERMISSION)
                .on(T_ROLE_PERMISSION.PERMISSION_ID.eq(T_PERMISSION.ID))
                .where(T_USER.USERNAME.eq(username),T_USER.STATUS.eq(1),T_ROLE.AVAILABLE.eq("1")).fetchInto(TPermissionObj.class);
       tPermissionObjsList.stream().forEach(x ->{
           String permission = x.getPermission();
           permissionSet.add(permission);

       });
        return permissionSet;
    }

    /**
     * 根据用户名获取用户信息
     *
     * @param username
     * @return
     */
    @Override
    public List<TUserObj> getUserInfoByUserName(String username) {
        return create.select().from(T_USER).where(T_USER.USERNAME.eq(username),T_USER.STATUS.eq(1)).fetchInto(TUserObj.class);
    }


    /**
     * 注册功能
     *
     * @param username 用户名
     * @param password 密码
     * @param phone
     * @return
     */
    @Override
    public boolean registerUserInfo(String username, String password, String phone) {

        // 将用户名作为盐值
        ByteSource salt = ByteSource.Util.bytes(username);
        /*
        * MD5加密：
        * 使用SimpleHash类对原始密码进行加密。
        * 第一个参数代表使用MD5方式加密
        * 第二个参数为原始密码
        * 第三个参数为盐值，即用户名
        * 第四个参数为加密次数
        * 最后用toHex()方法将加密后的密码转成String
        * */
        String newPassword = new SimpleHash("MD5", password, salt, 1024).toHex();
        // 看数据库中是否存在该账户
        List<TUserObj> userInfoList = getUserInfoByUserName(username);
        if(userInfoList == null || userInfoList.size()<1) {
            TUserRecord tUserRecord = new TUserRecord();
            tUserRecord.setUsername(username);
            tUserRecord.setPassword(newPassword);
            tUserRecord.setPhone(phone);
            tUserRecord.setCreateTime(Timestamp.valueOf(LocalDateTime.now()));
            tUserRecord.setCreateUser(username);
            int i = create.insertInto(T_USER).set(tUserRecord).execute();
            if(i ==1){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
