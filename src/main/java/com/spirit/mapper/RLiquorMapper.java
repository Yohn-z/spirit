package com.spirit.mapper;

import com.spirit.pojo.RLiquor;
import com.spirit.pojo.RLiquorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RLiquorMapper {
    int countByExample(RLiquorExample example);

    int deleteByExample(RLiquorExample example);

    int deleteByPrimaryKey(String lId);

    int insert(RLiquor record);

    int insertSelective(RLiquor record);

    List<RLiquor> selectByExample(RLiquorExample example);

    RLiquor selectByPrimaryKey(String lId);

    int updateByExampleSelective(@Param("record") RLiquor record, @Param("example") RLiquorExample example);

    int updateByExample(@Param("record") RLiquor record, @Param("example") RLiquorExample example);

    int updateByPrimaryKeySelective(RLiquor record);

    int updateByPrimaryKey(RLiquor record);
}