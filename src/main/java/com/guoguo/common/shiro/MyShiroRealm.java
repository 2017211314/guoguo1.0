package com.guoguo.common.shiro;


import com.guoguo.domain.jooq.tables.pojos.TUserObj;
import com.guoguo.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * 创建者:刘达
 * 创建日期: 2018/4/20
 * 创建时间: 23:57
 */
@Service
public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    UserService userService;

    /**
     * 授权访问控制
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = (String) principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        // 根据用户名查询当前用户拥有的角色
        Set<String> roles = userService.getRoles(username);
        // 将角色名称提供给info
        authorizationInfo.setRoles(roles);
        // 根据用户名查询当前用户权限
        Set<String> permissions = userService.getPermissions(username);
        // 将权限名称提供给info
        authorizationInfo.setStringPermissions(permissions);
        return authorizationInfo;
    }

    /**
     * 验证用户身份
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal();
        List<TUserObj> userInfo = userService.getUserInfoByUserName(username);

        if (userInfo == null || userInfo.size()==0) {
            // 用户名不存在抛出异常
            throw new UnknownAccountException();
        }
        TUserObj tUserObj = userInfo.get(0);
        if (tUserObj.getStatus() == 2) {
            // 用户被管理员锁定抛出异常
            throw new LockedAccountException();
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(tUserObj.getUsername(),
                tUserObj.getPassword(), getName());
        return authenticationInfo;
    }
}
