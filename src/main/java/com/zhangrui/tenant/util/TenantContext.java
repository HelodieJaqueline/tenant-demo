package com.zhangrui.tenant.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description:
 * @author: ZhangRui
 * @create: 2021-05-24 15:27
 **/

public class TenantContext {

    private static final Map<String, Object> contextMap = new ConcurrentHashMap<>();

    public void putTokenTenantIdPair(String token, Long tenantId) {
        contextMap.put(token, tenantId);
    }

    public Long getTenantIdWithToken(String token) {
        return (Long) contextMap.get(token);
    }
}

