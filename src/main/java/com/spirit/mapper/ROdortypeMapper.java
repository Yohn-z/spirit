package com.spirit.mapper;

import com.spirit.pojo.ROdortype;
import com.spirit.pojo.ROdortypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ROdortypeMapper {
    int countByExample(ROdortypeExample example);

    int deleteByExample(ROdortypeExample example);

    int deleteByPrimaryKey(Long oId);

    int insert(ROdortype record);

    int insertSelective(ROdortype record);

    List<ROdortype> selectByExample(ROdortypeExample example);

    ROdortype selectByPrimaryKey(Long oId);

    int updateByExampleSelective(@Param("record") ROdortype record, @Param("example") ROdortypeExample example);

    int updateByExample(@Param("record") ROdortype record, @Param("example") ROdortypeExample example);

    int updateByPrimaryKeySelective(ROdortype record);

    int updateByPrimaryKey(ROdortype record);
}