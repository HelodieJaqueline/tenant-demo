package com.zhangrui.tenant.service;

import com.zhangrui.tenant.entity.Profile;
public interface ProfileService{


    int deleteByPrimaryKey(Integer id);

    int insert(Profile record);

    int insertSelective(Profile record);

    Profile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Profile record);

    int updateByPrimaryKey(Profile record);

}
