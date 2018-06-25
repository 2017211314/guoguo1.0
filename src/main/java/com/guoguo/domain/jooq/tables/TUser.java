/*
 * This file is generated by jOOQ.
*/
package com.guoguo.domain.jooq.tables;


import com.guoguo.domain.jooq.Guoguo;
import com.guoguo.domain.jooq.Indexes;
import com.guoguo.domain.jooq.Keys;
import com.guoguo.domain.jooq.tables.records.TUserRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class TUser extends TableImpl<TUserRecord> {

    private static final long serialVersionUID = -1704971441;

    /**
     * The reference instance of <code>guoguo.t_user</code>
     */
    public static final TUser T_USER = new TUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TUserRecord> getRecordType() {
        return TUserRecord.class;
    }

    /**
     * The column <code>guoguo.t_user.id</code>.
     */
    public final TableField<TUserRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>guoguo.t_user.username</code>. 登陆名
     */
    public final TableField<TUserRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "登陆名");

    /**
     * The column <code>guoguo.t_user.password</code>. 登陆密码，加密存储
     */
    public final TableField<TUserRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "登陆密码，加密存储");

    /**
     * The column <code>guoguo.t_user.real_name</code>. 真实姓名
     */
    public final TableField<TUserRecord, String> REAL_NAME = createField("real_name", org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "真实姓名");

    /**
     * The column <code>guoguo.t_user.phone</code>. 手机号
     */
    public final TableField<TUserRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "手机号");

    /**
     * The column <code>guoguo.t_user.email</code>. 邮箱
     */
    public final TableField<TUserRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "邮箱");

    /**
     * The column <code>guoguo.t_user.qq_num</code>. qq号
     */
    public final TableField<TUserRecord, String> QQ_NUM = createField("qq_num", org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "qq号");

    /**
     * The column <code>guoguo.t_user.wechat_num</code>. 微信号
     */
    public final TableField<TUserRecord, String> WECHAT_NUM = createField("wechat_num", org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "微信号");

    /**
     * The column <code>guoguo.t_user.score</code>. 用户积分
     */
    public final TableField<TUserRecord, Integer> SCORE = createField("score", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "用户积分");

    /**
     * The column <code>guoguo.t_user.career_type</code>. 职业类型
     */
    public final TableField<TUserRecord, String> CAREER_TYPE = createField("career_type", org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "职业类型");

    /**
     * The column <code>guoguo.t_user.work_time</code>. 工作年限
     */
    public final TableField<TUserRecord, Integer> WORK_TIME = createField("work_time", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "工作年限");

    /**
     * The column <code>guoguo.t_user.specialty</code>. 擅长
     */
    public final TableField<TUserRecord, String> SPECIALTY = createField("specialty", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "擅长");

    /**
     * The column <code>guoguo.t_user.intro</code>. 简介
     */
    public final TableField<TUserRecord, String> INTRO = createField("intro", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "简介");

    /**
     * The column <code>guoguo.t_user.user_url</code>. 个人网址
     */
    public final TableField<TUserRecord, String> USER_URL = createField("user_url", org.jooq.impl.SQLDataType.VARCHAR(200).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "个人网址");

    /**
     * The column <code>guoguo.t_user.icon</code>. 头像
     */
    public final TableField<TUserRecord, String> ICON = createField("icon", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "头像");

    /**
     * The column <code>guoguo.t_user.sex</code>. 性别：1-男，2-女，3-保密
     */
    public final TableField<TUserRecord, String> SEX = createField("sex", org.jooq.impl.SQLDataType.VARCHAR(2).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "性别：1-男，2-女，3-保密");

    /**
     * The column <code>guoguo.t_user.address</code>. 地址
     */
    public final TableField<TUserRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "地址");

    /**
     * The column <code>guoguo.t_user.status</code>. 用户帐号状态：1-正常，2-锁定,3-删除
     */
    public final TableField<TUserRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("2", org.jooq.impl.SQLDataType.INTEGER)), this, "用户帐号状态：1-正常，2-锁定,3-删除");

    /**
     * The column <code>guoguo.t_user.mcode</code>. 短信验证码
     */
    public final TableField<TUserRecord, String> MCODE = createField("mcode", org.jooq.impl.SQLDataType.VARCHAR(10).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "短信验证码");

    /**
     * The column <code>guoguo.t_user.send_time</code>. 短信发送时间
     */
    public final TableField<TUserRecord, Timestamp> SEND_TIME = createField("send_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "短信发送时间");

    /**
     * The column <code>guoguo.t_user.create_time</code>. 创建时间
     */
    public final TableField<TUserRecord, String> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.VARCHAR(18).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "创建时间");

    /**
     * The column <code>guoguo.t_user.create_user</code>. 创建人
     */
    public final TableField<TUserRecord, String> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "创建人");

    /**
     * The column <code>guoguo.t_user.update_time</code>. 更新时间
     */
    public final TableField<TUserRecord, String> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.VARCHAR(18).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "更新时间");

    /**
     * The column <code>guoguo.t_user.update_user</code>. 更新人
     */
    public final TableField<TUserRecord, String> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "更新人");

    /**
     * Create a <code>guoguo.t_user</code> table reference
     */
    public TUser() {
        this(DSL.name("t_user"), null);
    }

    /**
     * Create an aliased <code>guoguo.t_user</code> table reference
     */
    public TUser(String alias) {
        this(DSL.name(alias), T_USER);
    }

    /**
     * Create an aliased <code>guoguo.t_user</code> table reference
     */
    public TUser(Name alias) {
        this(alias, T_USER);
    }

    private TUser(Name alias, Table<TUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private TUser(Name alias, Table<TUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "用户表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Guoguo.GUOGUO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.T_USER_PHONE, Indexes.T_USER_PRIMARY, Indexes.T_USER_USERNAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TUserRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TUserRecord> getPrimaryKey() {
        return Keys.KEY_T_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TUserRecord>> getKeys() {
        return Arrays.<UniqueKey<TUserRecord>>asList(Keys.KEY_T_USER_PRIMARY, Keys.KEY_T_USER_USERNAME, Keys.KEY_T_USER_PHONE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUser as(String alias) {
        return new TUser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUser as(Name alias) {
        return new TUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TUser rename(String name) {
        return new TUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TUser rename(Name name) {
        return new TUser(name, null);
    }
}
