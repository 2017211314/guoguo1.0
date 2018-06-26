/*
 * This file is generated by jOOQ.
*/
package com.guoguo.domain.jooq.tables.records;


import com.guoguo.domain.jooq.tables.TUser;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TUserRecord extends UpdatableRecordImpl<TUserRecord> implements Record21<Integer, String, String, String, Integer, String, String, String, String, String, Integer, String, String, String, String, Timestamp, Integer, Timestamp, String, Timestamp, String> {

    private static final long serialVersionUID = 503295231;

    /**
     * Setter for <code>guoguo.t_user.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>guoguo.t_user.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>guoguo.t_user.username</code>. 登录名
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>guoguo.t_user.username</code>. 登录名
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>guoguo.t_user.password</code>. 登录密码，加密存储
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>guoguo.t_user.password</code>. 登录密码，加密存储
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>guoguo.t_user.salt</code>. 密码盐
     */
    public void setSalt(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>guoguo.t_user.salt</code>. 密码盐
     */
    public String getSalt() {
        return (String) get(3);
    }

    /**
     * Setter for <code>guoguo.t_user.role_id</code>. 1-普通用户
     */
    public void setRoleId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>guoguo.t_user.role_id</code>. 1-普通用户
     */
    public Integer getRoleId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>guoguo.t_user.real_name</code>. 真实姓名
     */
    public void setRealName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>guoguo.t_user.real_name</code>. 真实姓名
     */
    public String getRealName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>guoguo.t_user.phone</code>. 手机号
     */
    public void setPhone(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>guoguo.t_user.phone</code>. 手机号
     */
    public String getPhone() {
        return (String) get(6);
    }

    /**
     * Setter for <code>guoguo.t_user.email</code>. 邮箱
     */
    public void setEmail(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>guoguo.t_user.email</code>. 邮箱
     */
    public String getEmail() {
        return (String) get(7);
    }

    /**
     * Setter for <code>guoguo.t_user.qq_num</code>. qq号
     */
    public void setQqNum(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>guoguo.t_user.qq_num</code>. qq号
     */
    public String getQqNum() {
        return (String) get(8);
    }

    /**
     * Setter for <code>guoguo.t_user.wechat_num</code>. 微信号
     */
    public void setWechatNum(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>guoguo.t_user.wechat_num</code>. 微信号
     */
    public String getWechatNum() {
        return (String) get(9);
    }

    /**
     * Setter for <code>guoguo.t_user.score</code>. 用户积分
     */
    public void setScore(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>guoguo.t_user.score</code>. 用户积分
     */
    public Integer getScore() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>guoguo.t_user.icon</code>. 头像
     */
    public void setIcon(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>guoguo.t_user.icon</code>. 头像
     */
    public String getIcon() {
        return (String) get(11);
    }

    /**
     * Setter for <code>guoguo.t_user.sex</code>. 性别：1-男，2-女，3-保密
     */
    public void setSex(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>guoguo.t_user.sex</code>. 性别：1-男，2-女，3-保密
     */
    public String getSex() {
        return (String) get(12);
    }

    /**
     * Setter for <code>guoguo.t_user.address</code>. 地址
     */
    public void setAddress(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>guoguo.t_user.address</code>. 地址
     */
    public String getAddress() {
        return (String) get(13);
    }

    /**
     * Setter for <code>guoguo.t_user.mcode</code>. 短信验证码
     */
    public void setMcode(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>guoguo.t_user.mcode</code>. 短信验证码
     */
    public String getMcode() {
        return (String) get(14);
    }

    /**
     * Setter for <code>guoguo.t_user.send_time</code>. 短信发送时间
     */
    public void setSendTime(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>guoguo.t_user.send_time</code>. 短信发送时间
     */
    public Timestamp getSendTime() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>guoguo.t_user.status</code>. 用户帐号状态：1-正常，2-锁定,3-删除
     */
    public void setStatus(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>guoguo.t_user.status</code>. 用户帐号状态：1-正常，2-锁定,3-删除
     */
    public Integer getStatus() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>guoguo.t_user.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>guoguo.t_user.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>guoguo.t_user.create_user</code>. 创建人
     */
    public void setCreateUser(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>guoguo.t_user.create_user</code>. 创建人
     */
    public String getCreateUser() {
        return (String) get(18);
    }

    /**
     * Setter for <code>guoguo.t_user.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(19, value);
    }

    /**
     * Getter for <code>guoguo.t_user.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>guoguo.t_user.update_user</code>. 更新人
     */
    public void setUpdateUser(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>guoguo.t_user.update_user</code>. 更新人
     */
    public String getUpdateUser() {
        return (String) get(20);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Integer, String, String, String, Integer, String, String, String, String, String, Integer, String, String, String, String, Timestamp, Integer, Timestamp, String, Timestamp, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Integer, String, String, String, Integer, String, String, String, String, String, Integer, String, String, String, String, Timestamp, Integer, Timestamp, String, Timestamp, String> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TUser.T_USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TUser.T_USER.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TUser.T_USER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TUser.T_USER.SALT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TUser.T_USER.ROLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TUser.T_USER.REAL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TUser.T_USER.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TUser.T_USER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TUser.T_USER.QQ_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TUser.T_USER.WECHAT_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return TUser.T_USER.SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return TUser.T_USER.ICON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return TUser.T_USER.SEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return TUser.T_USER.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return TUser.T_USER.MCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return TUser.T_USER.SEND_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field17() {
        return TUser.T_USER.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field18() {
        return TUser.T_USER.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return TUser.T_USER.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field20() {
        return TUser.T_USER.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field21() {
        return TUser.T_USER.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRealName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getQqNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getWechatNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getIcon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getSex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getMcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getSendTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component17() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component18() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component20() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component21() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRealName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getQqNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getWechatNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getIcon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getSex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getMcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getSendTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value17() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value18() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value20() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value21() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value2(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value3(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value4(String value) {
        setSalt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value5(Integer value) {
        setRoleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value6(String value) {
        setRealName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value7(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value8(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value9(String value) {
        setQqNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value10(String value) {
        setWechatNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value11(Integer value) {
        setScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value12(String value) {
        setIcon(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value13(String value) {
        setSex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value14(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value15(String value) {
        setMcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value16(Timestamp value) {
        setSendTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value17(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value18(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value19(String value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value20(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord value21(String value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserRecord values(Integer value1, String value2, String value3, String value4, Integer value5, String value6, String value7, String value8, String value9, String value10, Integer value11, String value12, String value13, String value14, String value15, Timestamp value16, Integer value17, Timestamp value18, String value19, Timestamp value20, String value21) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TUserRecord
     */
    public TUserRecord() {
        super(TUser.T_USER);
    }

    /**
     * Create a detached, initialised TUserRecord
     */
    public TUserRecord(Integer id, String username, String password, String salt, Integer roleId, String realName, String phone, String email, String qqNum, String wechatNum, Integer score, String icon, String sex, String address, String mcode, Timestamp sendTime, Integer status, Timestamp createTime, String createUser, Timestamp updateTime, String updateUser) {
        super(TUser.T_USER);

        set(0, id);
        set(1, username);
        set(2, password);
        set(3, salt);
        set(4, roleId);
        set(5, realName);
        set(6, phone);
        set(7, email);
        set(8, qqNum);
        set(9, wechatNum);
        set(10, score);
        set(11, icon);
        set(12, sex);
        set(13, address);
        set(14, mcode);
        set(15, sendTime);
        set(16, status);
        set(17, createTime);
        set(18, createUser);
        set(19, updateTime);
        set(20, updateUser);
    }
}
