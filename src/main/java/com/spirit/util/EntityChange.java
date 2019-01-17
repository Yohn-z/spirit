package com.spirit.util;

import com.spirit.pojo.RLiquor;
import com.spirit.pojo.RLiquordesc;

import java.sql.Time;

/**
 * 对象封装转化
 */
public class EntityChange {


    /**
     * 转RLiquord
     * @param rLiquor
     * @return
     */
    public static RLiquor toRLiquor(RLiquor rLiquor,String id){

        RLiquor liquor = new RLiquor();

        liquor.setlId(id);

        liquor.setlName(rLiquor.getlName());

        liquor.setoId(rLiquor.getoId());

        liquor.setlDegrees(rLiquor.getlDegrees());

        liquor.setlCapacity(rLiquor.getlCapacity());

        liquor.setlWeight(rLiquor.getlWeight());

        liquor.setlNum(rLiquor.getlNum());

        if(rLiquor.getlWeight() != null){
            liquor.setlWeight(rLiquor.getlWeight());
        }

        if(rLiquor.getlProducedtime().equals("") || rLiquor.getlProducedtime() == null){
            liquor.setlProducedtime("无");
        }
        liquor.setlProducedtime(rLiquor.getlProducedtime());

        return liquor;

    }

    /**
     * 转RLiquorddesc
     * @param rLiquor
     * @return
     */
    public static RLiquordesc toRLiquordesc(RLiquor rLiquor,String id){

        RLiquordesc rLiquordesc = new RLiquordesc();

        rLiquordesc.setlId(id);

        if(rLiquor.getLdPrice()==null){
            rLiquordesc.setLdPrice(null);
        }
        rLiquordesc.setLdPrice(rLiquor.getLdPrice());

        if(rLiquor.getmId()==null){
            rLiquordesc.setmId(null);
        }
        rLiquordesc.setmId(rLiquor.getmId());

        if(rLiquor.getLdChannels()==null||rLiquor.getLdChannels().equals("")){
            rLiquordesc.setLdChannels("无");
        }
        rLiquordesc.setLdChannels(rLiquor.getLdChannels());

        if(rLiquor.getLdSeal()==null){
            rLiquordesc.setLdSeal(0);
        }
        rLiquordesc.setLdSeal(rLiquor.getLdSeal());

        if(rLiquor.getLdBefore()==null){
            rLiquordesc.setLdBefore("无");
        }
        rLiquordesc.setLdBefore(rLiquor.getLdBefore());

        if(rLiquor.getLdBack()==null){
            rLiquordesc.setLdBack("无");
        }
        rLiquordesc.setLdBack(rLiquor.getLdBack());

        if(rLiquor.getLdTop()==null){
            rLiquordesc.setLdTop("无");
        }
        rLiquordesc.setLdTop(rLiquor.getLdTop());

        if(rLiquor.getLdText()==null){
            rLiquordesc.setLdText("无");
        }
        rLiquordesc.setLdText(rLiquor.getLdText());

        rLiquordesc.setLdAddtime(TimeUtils.getTime());

        return rLiquordesc;
    }

}
