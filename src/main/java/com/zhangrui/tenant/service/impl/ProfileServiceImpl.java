package com.zhangrui.tenant.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zhangrui.tenant.mapper.ProfileMapper;
import com.zhangrui.tenant.entity.Profile;
import com.zhangrui.tenant.service.ProfileService;
@Service
public class ProfileServiceImpl implements ProfileService{

    @Resource
    private ProfileMapper profileMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return profileMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Profile record) {
        return profileMapper.insert(record);
    }

    @Override
    public int insertSelective(Profile record) {
        return profileMapper.insertSelective(record);
    }

    @Override
    public Profile selectByPrimaryKey(Integer id) {
        return profileMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Profile record) {
        return profileMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Profile record) {
        return profileMapper.updateByPrimaryKey(record);
    }

}
