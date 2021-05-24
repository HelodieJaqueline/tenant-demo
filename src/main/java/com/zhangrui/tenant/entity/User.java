package com.zhangrui.tenant.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    /**
    * 主键
    */
    private Long id;

    /**
    * 服务商ID
    */
    private Long tenantId;

    /**
    * 姓名
    */
    private String name;
}