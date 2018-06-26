package com.guoguo.service;

import com.google.common.collect.Lists;
import com.guoguo.common.utils.Response;
import com.guoguo.common.utils.StringTools;
import com.guoguo.domain.jooq.tables.pojos.TPermissionObj;
import com.guoguo.domain.jooq.tables.pojos.TUserObj;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static com.guoguo.domain.jooq.Tables.*;


/**
 * @author: 刘达
 * @createDate: 2018/6/26 0:15
 * @description:
 */
@Service
public class UserServiceImpl extends ServiceBase implements UserService{

    /**
     * 添加用户信息
     * @return
     */
    @Override
    public Response addUserInfo() {
        return null;
    }


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
}
