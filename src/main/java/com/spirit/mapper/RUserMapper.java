package com.spirit.mapper;

import com.spirit.pojo.RUser;
import com.spirit.pojo.RUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RUserMapper {
    int countByExample(RUserExample example);

    int deleteByExample(RUserExample example);

    int deleteByPrimaryKey(Long uId);

    int insert(RUser record);

    int insertSelective(RUser record);

    List<RUser> selectByExample(RUserExample example);

    RUser selectByPrimaryKey(Long uId);

    int updateByExampleSelective(@Param("record") RUser record, @Param("example") RUserExample example);

    int updateByExample(@Param("record") RUser record, @Param("example") RUserExample example);

    int updateByPrimaryKeySelective(RUser record);

    int updateByPrimaryKey(RUser record);
}