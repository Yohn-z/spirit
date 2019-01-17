package com.spirit.mapper;

import com.spirit.pojo.RManufacturers;
import com.spirit.pojo.RManufacturersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RManufacturersMapper {
    int countByExample(RManufacturersExample example);

    int deleteByExample(RManufacturersExample example);

    int deleteByPrimaryKey(Long mId);

    int insert(RManufacturers record);

    int insertSelective(RManufacturers record);

    List<RManufacturers> selectByExample(RManufacturersExample example);

    RManufacturers selectByPrimaryKey(Long mId);

    int updateByExampleSelective(@Param("record") RManufacturers record, @Param("example") RManufacturersExample example);

    int updateByExample(@Param("record") RManufacturers record, @Param("example") RManufacturersExample example);

    int updateByPrimaryKeySelective(RManufacturers record);

    int updateByPrimaryKey(RManufacturers record);
}