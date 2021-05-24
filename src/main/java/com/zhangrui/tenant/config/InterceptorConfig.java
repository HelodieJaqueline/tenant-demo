package com.zhangrui.tenant.config;

import com.zhangrui.tenant.interceptor.TenantInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @description:
 * @author: ZhangRui
 * @create: 2021-05-24 15:43
 **/
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private TenantInterceptor tenantInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tenantInterceptor).addPathPatterns("/**").excludePathPatterns("/user/login/**");
        super.addInterceptors(registry);
    }
}
