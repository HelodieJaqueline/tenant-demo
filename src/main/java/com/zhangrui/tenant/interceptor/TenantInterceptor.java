package com.zhangrui.tenant.interceptor;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.tenant.TenantSqlParser;
import com.zhangrui.tenant.config.MyTenantHandler;
import com.zhangrui.tenant.util.TenantContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author: ZhangRui
 * @create: 2021-05-24 15:40
 **/
@Component
public class TenantInterceptor implements HandlerInterceptor {

    @Autowired
    private TenantContext tenantContext;

    @Autowired
    private PaginationInterceptor pi;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String path=httpServletRequest.getRequestURI();
        String token = path.substring(path.lastIndexOf("/") + 1);
        if (isTokenValid(token)) {
            prepareTenantContext(token);
            return true;
        }

        return false;
    }

    private void prepareTenantContext(String token) {
        TenantSqlParser tenantSqlParser = (TenantSqlParser) pi.getSqlParserList().get(0);
        MyTenantHandler myTenantHandler = (MyTenantHandler) tenantSqlParser.getTenantHandler();
        myTenantHandler.setTenantId(tenantContext.getTenantIdWithToken(token));
    }

    private boolean isTokenValid(String token) {
        return null != tenantContext.getTenantIdWithToken(token);
    }
}
