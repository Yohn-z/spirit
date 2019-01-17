package com.spirit.mapper;

import com.spirit.entity.OdortTypePercent;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ROdortypeMapperCustom {

    @Select("SELECT\n" +
            "\tro.o_text name,\n" +
            "\tROUND(\n" +
            "\t\t(\n" +
            "\t\t\tROUND(\n" +
            "\t\t\t\t(COUNT(*)) / (SELECT COUNT(*) FROM r_liquor),\n" +
            "\t\t\t\t4\n" +
            "\t\t\t) * 100\n" +
            "\t\t),\n" +
            "\t\t2\n" +
            "\t) y\n" +
            "FROM\n" +
            "\tr_liquor rli,\n" +
            "\tr_odortype ro\n" +
            "WHERE\n" +
            "\tro.o_id = rli.o_id\n" +
            "GROUP BY\n" +
            "\trli.o_id")
    List<OdortTypePercent> getOdortTypePercents();
}