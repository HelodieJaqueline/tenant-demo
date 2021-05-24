package com.zhangrui.tenant.mapper;

import com.zhangrui.tenant.entity.Profile;

import java.util.List;

public interface ProfileMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Profile record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Profile record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Profile selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Profile record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Profile record);

    List<Profile> selectList(Profile o);
}