/*
 * This file is generated by jOOQ.
*/
package com.guoguo.domain.jooq;


import com.guoguo.domain.jooq.tables.TUser;
import com.guoguo.domain.jooq.tables.records.TUserRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>guoguo</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TUserRecord, Integer> IDENTITY_T_USER = Identities0.IDENTITY_T_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TUserRecord> KEY_T_USER_PRIMARY = UniqueKeys0.KEY_T_USER_PRIMARY;
    public static final UniqueKey<TUserRecord> KEY_T_USER_USERNAME = UniqueKeys0.KEY_T_USER_USERNAME;
    public static final UniqueKey<TUserRecord> KEY_T_USER_PHONE = UniqueKeys0.KEY_T_USER_PHONE;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<TUserRecord, Integer> IDENTITY_T_USER = Internal.createIdentity(TUser.T_USER, TUser.T_USER.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<TUserRecord> KEY_T_USER_PRIMARY = Internal.createUniqueKey(TUser.T_USER, "KEY_t_user_PRIMARY", TUser.T_USER.ID);
        public static final UniqueKey<TUserRecord> KEY_T_USER_USERNAME = Internal.createUniqueKey(TUser.T_USER, "KEY_t_user_username", TUser.T_USER.USERNAME);
        public static final UniqueKey<TUserRecord> KEY_T_USER_PHONE = Internal.createUniqueKey(TUser.T_USER, "KEY_t_user_phone", TUser.T_USER.PHONE);
    }
}