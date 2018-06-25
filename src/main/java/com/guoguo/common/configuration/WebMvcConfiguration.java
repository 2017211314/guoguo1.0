package com.guoguo.common.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 创建者:刘达
 * 创建日期: 2018/5/13
 * 创建时间: 18:36
 */
@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //和页面有关的静态目录都放在项目的static目录下
        //registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        //上传的图片在E盘下的uploadFiles目录下，访问路径如：http://localhost:8081/uploadFiles/d3cf0281-bb7f-40e0-ab77-406db95ccf2c.jpg
        //其中uploadFiles表示访问的前缀。"file:E:/uploadFiles/"是文件真实的存储路径
        registry.addResourceHandler("/uploadFiles/images/**").addResourceLocations("file:C:/uploadFiles/images/");
    }
}

