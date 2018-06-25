/*
 * This file is generated by jOOQ.
*/
package com.guoguo.domain.jooq.tables.daos;


import com.guoguo.domain.jooq.tables.TUser;
import com.guoguo.domain.jooq.tables.pojos.TUserObj;
import com.guoguo.domain.jooq.tables.records.TUserRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * 用户表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class TUserDao extends DAOImpl<TUserRecord, TUserObj, Integer> {

    /**
     * Create a new TUserDao without any configuration
     */
    public TUserDao() {
        super(TUser.T_USER, TUserObj.class);
    }

    /**
     * Create a new TUserDao with an attached configuration
     */
    @Autowired
    public TUserDao(Configuration configuration) {
        super(TUser.T_USER, TUserObj.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(TUserObj object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<TUserObj> fetchById(Integer... values) {
        return fetch(TUser.T_USER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public TUserObj fetchOneById(Integer value) {
        return fetchOne(TUser.T_USER.ID, value);
    }

    /**
     * Fetch records that have <code>username IN (values)</code>
     */
    public List<TUserObj> fetchByUsername(String... values) {
        return fetch(TUser.T_USER.USERNAME, values);
    }

    /**
     * Fetch a unique record that has <code>username = value</code>
     */
    public TUserObj fetchOneByUsername(String value) {
        return fetchOne(TUser.T_USER.USERNAME, value);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<TUserObj> fetchByPassword(String... values) {
        return fetch(TUser.T_USER.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>real_name IN (values)</code>
     */
    public List<TUserObj> fetchByRealName(String... values) {
        return fetch(TUser.T_USER.REAL_NAME, values);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<TUserObj> fetchByPhone(String... values) {
        return fetch(TUser.T_USER.PHONE, values);
    }

    /**
     * Fetch a unique record that has <code>phone = value</code>
     */
    public TUserObj fetchOneByPhone(String value) {
        return fetchOne(TUser.T_USER.PHONE, value);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<TUserObj> fetchByEmail(String... values) {
        return fetch(TUser.T_USER.EMAIL, values);
    }

    /**
     * Fetch records that have <code>qq_num IN (values)</code>
     */
    public List<TUserObj> fetchByQqNum(String... values) {
        return fetch(TUser.T_USER.QQ_NUM, values);
    }

    /**
     * Fetch records that have <code>wechat_num IN (values)</code>
     */
    public List<TUserObj> fetchByWechatNum(String... values) {
        return fetch(TUser.T_USER.WECHAT_NUM, values);
    }

    /**
     * Fetch records that have <code>score IN (values)</code>
     */
    public List<TUserObj> fetchByScore(Integer... values) {
        return fetch(TUser.T_USER.SCORE, values);
    }

    /**
     * Fetch records that have <code>career_type IN (values)</code>
     */
    public List<TUserObj> fetchByCareerType(String... values) {
        return fetch(TUser.T_USER.CAREER_TYPE, values);
    }

    /**
     * Fetch records that have <code>work_time IN (values)</code>
     */
    public List<TUserObj> fetchByWorkTime(Integer... values) {
        return fetch(TUser.T_USER.WORK_TIME, values);
    }

    /**
     * Fetch records that have <code>specialty IN (values)</code>
     */
    public List<TUserObj> fetchBySpecialty(String... values) {
        return fetch(TUser.T_USER.SPECIALTY, values);
    }

    /**
     * Fetch records that have <code>intro IN (values)</code>
     */
    public List<TUserObj> fetchByIntro(String... values) {
        return fetch(TUser.T_USER.INTRO, values);
    }

    /**
     * Fetch records that have <code>user_url IN (values)</code>
     */
    public List<TUserObj> fetchByUserUrl(String... values) {
        return fetch(TUser.T_USER.USER_URL, values);
    }

    /**
     * Fetch records that have <code>icon IN (values)</code>
     */
    public List<TUserObj> fetchByIcon(String... values) {
        return fetch(TUser.T_USER.ICON, values);
    }

    /**
     * Fetch records that have <code>sex IN (values)</code>
     */
    public List<TUserObj> fetchBySex(String... values) {
        return fetch(TUser.T_USER.SEX, values);
    }

    /**
     * Fetch records that have <code>address IN (values)</code>
     */
    public List<TUserObj> fetchByAddress(String... values) {
        return fetch(TUser.T_USER.ADDRESS, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<TUserObj> fetchByStatus(Integer... values) {
        return fetch(TUser.T_USER.STATUS, values);
    }

    /**
     * Fetch records that have <code>mcode IN (values)</code>
     */
    public List<TUserObj> fetchByMcode(String... values) {
        return fetch(TUser.T_USER.MCODE, values);
    }

    /**
     * Fetch records that have <code>send_time IN (values)</code>
     */
    public List<TUserObj> fetchBySendTime(Timestamp... values) {
        return fetch(TUser.T_USER.SEND_TIME, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<TUserObj> fetchByCreateTime(String... values) {
        return fetch(TUser.T_USER.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user IN (values)</code>
     */
    public List<TUserObj> fetchByCreateUser(String... values) {
        return fetch(TUser.T_USER.CREATE_USER, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<TUserObj> fetchByUpdateTime(String... values) {
        return fetch(TUser.T_USER.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_user IN (values)</code>
     */
    public List<TUserObj> fetchByUpdateUser(String... values) {
        return fetch(TUser.T_USER.UPDATE_USER, values);
    }
}