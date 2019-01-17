package com.spirit.mapper;

import com.spirit.pojo.RLiquorCustom;
import com.spirit.pojo.vo.LQueryVo;

import java.util.List;

public interface RLiquorQueryCustomMapper {
    List<RLiquorCustom> findLiquorList(LQueryVo lQueryVo);
}
