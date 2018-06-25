package com.guoguo.service;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * 创建者:刘达
 * 创建日期: 2018/4/11
 * 创建时间: 13:13
 */
@Transactional
public class ServiceBase {
    @Autowired
    protected DSLContext create;
}
