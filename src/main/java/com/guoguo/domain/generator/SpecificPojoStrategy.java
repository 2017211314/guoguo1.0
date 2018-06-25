package com.guoguo.domain.generator;

/**
 * 创建者:刘达
 * 创建日期: 2018/4/11
 * 创建时间: 12:44
 */
import org.jooq.tools.StringUtils;
import org.jooq.util.DefaultGeneratorStrategy;
import org.jooq.util.Definition;

public class SpecificPojoStrategy extends DefaultGeneratorStrategy {

    public SpecificPojoStrategy() {
    }

    @Override
    public String getJavaClassName(Definition definition, Mode mode) {
        if (mode == Mode.POJO) {
            StringBuilder result = new StringBuilder();
            result.append(StringUtils.toCamelCase(definition.getOutputName().replace(' ', '_').replace('-', '_').replace('.', '_')));
            return result.append("Obj").toString();
        } else {
            return super.getJavaClassName(definition, mode);
        }
    }


}