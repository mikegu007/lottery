package com.mike.lottery.mapper;

import com.mike.lottery.entity.SUserToken;

public interface SUserTokenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SUserToken record);

    int insertSelective(SUserToken record);

    SUserToken selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SUserToken record);

    int updateByPrimaryKey(SUserToken record);
}