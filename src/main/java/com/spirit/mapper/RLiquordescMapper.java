package com.spirit.mapper;

import com.spirit.pojo.RLiquordesc;
import com.spirit.pojo.RLiquordescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RLiquordescMapper {
    int countByExample(RLiquordescExample example);

    int deleteByExample(RLiquordescExample example);

    int deleteByPrimaryKey(String lId);

    int insert(RLiquordesc record);

    int insertSelective(RLiquordesc record);

    List<RLiquordesc> selectByExample(RLiquordescExample example);

    RLiquordesc selectByPrimaryKey(String lId);

    int updateByExampleSelective(@Param("record") RLiquordesc record, @Param("example") RLiquordescExample example);

    int updateByExample(@Param("record") RLiquordesc record, @Param("example") RLiquordescExample example);

    int updateByPrimaryKeySelective(RLiquordesc record);

    int updateByPrimaryKey(RLiquordesc record);
}