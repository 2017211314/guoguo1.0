/*
 * This file is generated by jOOQ.
*/
package com.guoguo.domain.jooq.tables.records;


import com.guoguo.domain.jooq.tables.TRolePermission;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 角色权限表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TRolePermissionRecord extends UpdatableRecordImpl<TRolePermissionRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = -1434702881;

    /**
     * Setter for <code>guoguo.t_role_permission.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>guoguo.t_role_permission.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>guoguo.t_role_permission.permission_id</code>.
     */
    public void setPermissionId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>guoguo.t_role_permission.permission_id</code>.
     */
    public Integer getPermissionId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>guoguo.t_role_permission.role_id</code>.
     */
    public void setRoleId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>guoguo.t_role_permission.role_id</code>.
     */
    public Integer getRoleId() {
        return (Integer) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TRolePermission.T_ROLE_PERMISSION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TRolePermission.T_ROLE_PERMISSION.PERMISSION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TRolePermission.T_ROLE_PERMISSION.ROLE_ID;
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
    public Integer component2() {
        return getPermissionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getRoleId();
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
    public Integer value2() {
        return getPermissionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRolePermissionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRolePermissionRecord value2(Integer value) {
        setPermissionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRolePermissionRecord value3(Integer value) {
        setRoleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRolePermissionRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TRolePermissionRecord
     */
    public TRolePermissionRecord() {
        super(TRolePermission.T_ROLE_PERMISSION);
    }

    /**
     * Create a detached, initialised TRolePermissionRecord
     */
    public TRolePermissionRecord(Integer id, Integer permissionId, Integer roleId) {
        super(TRolePermission.T_ROLE_PERMISSION);

        set(0, id);
        set(1, permissionId);
        set(2, roleId);
    }
}
