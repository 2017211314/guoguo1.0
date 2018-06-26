package com.guoguo.service;

import com.guoguo.common.utils.Response;
import com.guoguo.domain.jooq.tables.pojos.TUserObj;

import java.util.List;
import java.util.Set;

/**
 * @Author: liuda
 * @CreateDate: 2018/6/25$ 19:08$
 * @Description:
 */
public interface UserService {

    /**
     * 添加用户信息
     * @return
     */
    Response addUserInfo();

    /**
     * 通过用户名获取角色
     * @param username
     * @return
     */
    Set<String> getRoles(String username);

    /**
     * 通过用户名获取权限
     * @param username
     * @return
     */
    Set<String> getPermissions(String username);

    /**
     * 根据用户名获取用户信息
     * @param username
     * @return
     */
    List<TUserObj> getUserInfoByUserName(String username);
}
