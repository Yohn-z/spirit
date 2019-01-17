package com.spirit.mapper;


import com.spirit.entity.YearsEntity;
import com.spirit.pojo.RLiquorCustom;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RLiquorMapperCustom {


    @Select("SELECT\n" +
            "\trl.l_id lId,\n" +
            "\trl.l_name lName,\n" +
            "\tro.o_text oText,\n" +
            "\trl.l_degrees lDegrees,\n" +
            "\trl.l_capacity lCapacity,\n" +
            "\trl.l_weight lWeight,\n" +
            "\trl.l_num lNum,\n" +
            "\trl.l_producedtime lProducedtime\n" +
            "FROM\n" +
            "\tr_liquor rl,\n" +
            "\tr_odortype ro,\n" +
            "\tr_liquordesc rli\n" +
            "WHERE\n" +
            "\trl.o_id = ro.o_id\n" +
            "AND\n" +
            "\trl.l_id = rli.l_id\n" +
            "ORDER BY\n" +
            "\trli.ld_addtime\n" +
            "desc ")
    List<RLiquorCustom> findall();

    @Select("SELECT\n" +
            "\t(\n" +
            "\t\tSELECT\n" +
            "\t\t\tsum(rli.l_num)\n" +
            "\t\tFROM\n" +
            "\t\t\tr_liquor rli\n" +
            "\t\tWHERE\n" +
            "\t\t\t${year} - DATE_FORMAT(rli.l_producedtime, '%Y') < 1\n" +
            "\t) inOne,\n" +
            "\t(\n" +
            "\t\tSELECT\n" +
            "\t\t\tsum(rli.l_num)\n" +
            "\t\tFROM\n" +
            "\t\t\tr_liquor rli\n" +
            "\t\tWHERE\n" +
            "\t\t\t${year} - DATE_FORMAT(rli.l_producedtime, '%Y') > 1\n" +
            "\t) elderOne,\n" +
            "\t(\n" +
            "\t\tSELECT\n" +
            "\t\t\tsum(rli.l_num)\n" +
            "\t\tFROM\n" +
            "\t\t\tr_liquor rli\n" +
            "\t\tWHERE\n" +
            "\t\t\t${year} - DATE_FORMAT(rli.l_producedtime, '%Y') > 2\n" +
            "\t) elderTwo,\n" +
            "\t(\n" +
            "\t\tSELECT\n" +
            "\t\t\tsum(rli.l_num)\n" +
            "\t\tFROM\n" +
            "\t\t\tr_liquor rli\n" +
            "\t\tWHERE\n" +
            "\t\t\t${year} - DATE_FORMAT(rli.l_producedtime, '%Y') > 5\n" +
            "\t) elderFive,\n" +
            "(\n" +
            "\t\tSELECT\n" +
            "\t\t\tsum(rli.l_num)\n" +
            "\t\tFROM\n" +
            "\t\t\tr_liquor rli\n" +
            "\t\tWHERE\n" +
            "\t\t\t${year} - DATE_FORMAT(rli.l_producedtime, '%Y') > 10\n" +
            "\t) elderTen,\n" +
            "(\n" +
            "\t\tSELECT\n" +
            "\t\t\tsum(rli.l_num)\n" +
            "\t\tFROM\n" +
            "\t\t\tr_liquor rli\n" +
            "\t\tWHERE\n" +
            "\t\t\t${year} - DATE_FORMAT(rli.l_producedtime, '%Y') > 20\n" +
            "\t) elderTwenty\n" +
            "FROM\n" +
            "\tr_liquor rli\n" +
            "GROUP BY\n" +
            "\tNULL")
    YearsEntity getYearData(@Param("year") int year);


}