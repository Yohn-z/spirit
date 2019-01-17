package com.spirit.mapper;


import com.spirit.pojo.RLiquorCustom;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RLiquordescMapperCustom {

    @Select("SELECT\n" +
            "\trl.ld_price ldPrice,\n" +
            "\trm.m_name mName,\n" +
            "\trl.ld_channels ldChannels,\n" +
            "\trl.ld_seal ldSeal,\n" +
            "\trl.ld_before ldBefore,\n" +
            "\trl.ld_back ldBack,\n" +
            "\trl.ld_top ldTop,\n" +
            "\trl.ld_text ldText,\n" +
            "\trl.ld_addtime ldAddtime,\n" +
            "\trli.l_weight lWeight,\n" +
            "\trli.o_id oId,\n" +
            "\trl.m_id mId,\n" +
            "\trli.l_id lId,\n" +
            "\trli.l_name lName,\n" +
            "\trli.l_degrees lDegrees,\n" +
            "\trli.l_capacity lCapacity,\n" +
            "\trli.l_num lNum,\n" +
            "\trli.l_weight lWeight,\n" +
            "\trli.l_producedtime lProducedtime\n" +
            "FROM\n" +
            "\tr_liquordesc rl,\n" +
            "\tr_manufacturers rm,\n" +
            "\tr_liquor rli\n" +
            "WHERE\n" +
            "\trl.m_id = rm.m_id\n" +
            "AND rl.l_id = rli.l_id\n" +
            "AND rl.l_id = '${lId}'")
    RLiquorCustom findOneBylId(@Param("lId") String lId);



    @Select("SELECT\n" +
            "\trli.l_id lId,\n" +
            "\trli.l_name lName,\n" +
            "\tro.o_text oText,\n" +
            "\trli.l_degrees lDegrees,\n" +
            "\trli.l_capacity lCapacity,\n" +
            "\trli.l_num lNum,\n" +
            "\trli.l_producedtime lProducedtime,\n" +
            "\trl.ld_price ldPrice,\n" +
            "\trm.m_name mName,\n" +
            "\trl.ld_channels ldChannels,\n" +
            "\trl.ld_seal ldSeal,\n" +
            "\trl.ld_text ldText,\n" +
            "\trl.ld_addtime ldAddtime,\n" +
            "\trli.l_weight lWeight\n" +
            "FROM\n" +
            "\tr_liquordesc rl,\n" +
            "\tr_manufacturers rm,\n" +
            "\tr_liquor rli,\n" +
            "\tr_odortype ro\n" +
            "WHERE\n" +
            "\trl.m_id = rm.m_id\n" +
            "AND\n" +
            "\trl.l_id = rli.l_id\n" +
            "AND\n" +
            "\trli.o_id = ro.o_id\n" +
            "ORDER BY\n" +
            "\trl.ld_addtime\n" +
            "DESC")
    List<RLiquorCustom> getAllData();
}