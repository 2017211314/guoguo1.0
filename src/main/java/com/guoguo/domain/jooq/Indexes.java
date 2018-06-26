/*
 * This file is generated by jOOQ.
*/
package com.guoguo.domain.jooq;


import com.guoguo.domain.jooq.tables.TPermission;
import com.guoguo.domain.jooq.tables.TRole;
import com.guoguo.domain.jooq.tables.TRolePermission;
import com.guoguo.domain.jooq.tables.TUser;
import com.guoguo.domain.jooq.tables.TUserRole;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>guoguo</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index T_PERMISSION_PRIMARY = Indexes0.T_PERMISSION_PRIMARY;
    public static final Index T_ROLE_PRIMARY = Indexes0.T_ROLE_PRIMARY;
    public static final Index T_ROLE_PERMISSION_PERMISSIONID = Indexes0.T_ROLE_PERMISSION_PERMISSIONID;
    public static final Index T_ROLE_PERMISSION_PRIMARY = Indexes0.T_ROLE_PERMISSION_PRIMARY;
    public static final Index T_ROLE_PERMISSION_ROLEID = Indexes0.T_ROLE_PERMISSION_ROLEID;
    public static final Index T_USER_PHONE = Indexes0.T_USER_PHONE;
    public static final Index T_USER_PRIMARY = Indexes0.T_USER_PRIMARY;
    public static final Index T_USER_USERNAME = Indexes0.T_USER_USERNAME;
    public static final Index T_USER_ROLE_PRIMARY = Indexes0.T_USER_ROLE_PRIMARY;
    public static final Index T_USER_ROLE_ROLEID = Indexes0.T_USER_ROLE_ROLEID;
    public static final Index T_USER_ROLE_USERID = Indexes0.T_USER_ROLE_USERID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index T_PERMISSION_PRIMARY = Internal.createIndex("PRIMARY", TPermission.T_PERMISSION, new OrderField[] { TPermission.T_PERMISSION.ID }, true);
        public static Index T_ROLE_PRIMARY = Internal.createIndex("PRIMARY", TRole.T_ROLE, new OrderField[] { TRole.T_ROLE.ID }, true);
        public static Index T_ROLE_PERMISSION_PERMISSIONID = Internal.createIndex("permissionId", TRolePermission.T_ROLE_PERMISSION, new OrderField[] { TRolePermission.T_ROLE_PERMISSION.PERMISSION_ID }, false);
        public static Index T_ROLE_PERMISSION_PRIMARY = Internal.createIndex("PRIMARY", TRolePermission.T_ROLE_PERMISSION, new OrderField[] { TRolePermission.T_ROLE_PERMISSION.ID }, true);
        public static Index T_ROLE_PERMISSION_ROLEID = Internal.createIndex("roleId", TRolePermission.T_ROLE_PERMISSION, new OrderField[] { TRolePermission.T_ROLE_PERMISSION.ROLE_ID }, false);
        public static Index T_USER_PHONE = Internal.createIndex("phone", TUser.T_USER, new OrderField[] { TUser.T_USER.PHONE }, true);
        public static Index T_USER_PRIMARY = Internal.createIndex("PRIMARY", TUser.T_USER, new OrderField[] { TUser.T_USER.ID }, true);
        public static Index T_USER_USERNAME = Internal.createIndex("username", TUser.T_USER, new OrderField[] { TUser.T_USER.USERNAME }, true);
        public static Index T_USER_ROLE_PRIMARY = Internal.createIndex("PRIMARY", TUserRole.T_USER_ROLE, new OrderField[] { TUserRole.T_USER_ROLE.ID }, true);
        public static Index T_USER_ROLE_ROLEID = Internal.createIndex("roleid", TUserRole.T_USER_ROLE, new OrderField[] { TUserRole.T_USER_ROLE.ROLE_ID }, false);
        public static Index T_USER_ROLE_USERID = Internal.createIndex("userid", TUserRole.T_USER_ROLE, new OrderField[] { TUserRole.T_USER_ROLE.USER_ID }, false);
    }
}
