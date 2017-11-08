package com.mike.lottery.mapper;

import com.mike.lottery.entity.Lottery;

import java.util.List;

public interface LotteryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Lottery record);

    int insertSelective(Lottery record);

    Lottery selectByPrimaryKey(Integer id);

    List<Lottery> selectSelective(Lottery record);

    int updateByPrimaryKeySelective(Lottery record);

    int updateByPrimaryKey(Lottery record);
}