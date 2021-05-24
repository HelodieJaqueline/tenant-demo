package com.zhangrui.tenant;

import com.zhangrui.tenant.util.TenantContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TenantDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TenantDemoApplication.class, args);
    }

    @Bean
    public TenantContext tenantContext() {
        return new TenantContext();
    }

}
