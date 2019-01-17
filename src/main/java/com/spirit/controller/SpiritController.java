package com.spirit.controller;


import com.spirit.entity.PageResult;
import com.spirit.entity.QueryEntity;
import com.spirit.entity.Result;
import com.spirit.mapper.RLiquordescMapper;
import com.spirit.oss.AliyunOSSUtil;
import com.spirit.pojo.RLiquor;
import com.spirit.pojo.RLiquorCustom;
import com.spirit.pojo.RLiquordesc;
import com.spirit.pojo.vo.LQueryVo;
import com.spirit.service.SpiritService;
import com.spirit.util.EntityChange;
import com.spirit.util.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/spirit")
public class SpiritController {

    @Autowired
    private SpiritService spiritService;

    @Autowired
    private RLiquordescMapper rLiquordescMapper;


    /**
     * 加载所有酒简要信息
     * @param page 页码
     * @param rows 每页数
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.POST)
    public PageResult findAllSpirit(int page, int rows, @RequestBody QueryEntity queryEntity){

        LQueryVo lQueryVo = new LQueryVo();
        lQueryVo.setQueryEntity(queryEntity);

        return spiritService.findall(page,rows,lQueryVo);
    }

    /**
     * 通过id查询酒详细
     * @param lId
     * @return
     */
    @RequestMapping(value = "/findone",method = RequestMethod.GET)
    public Result findOne(String lId){
        return new Result(true,"操作成功",spiritService.findOne(lId));
    }

    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public Result del(@RequestBody RLiquor rLiquor){
        return spiritService.del(rLiquor);
    }

    /**
     * 酒入库
     * @param request   request Object
     * @param rLiquor   包装对象类
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result addSpirit(HttpServletRequest request, RLiquor rLiquor){

        //1.必要参数校验
        if(rLiquor.getlName() == null || rLiquor.getoId() == null || rLiquor.getlDegrees() == 0 || rLiquor.getlNum() == null){
            return new Result(false,"请填写必要信息完整");
        }

        try{
            //2.pre文件校验，空则填无
            MultipartFile preFile = ((MultipartHttpServletRequest) request).getFile("preFile");
            if(preFile.getOriginalFilename().equals("") || preFile.getOriginalFilename() == null){
                rLiquor.setLdBefore("无");
            }else {
                String preUrl = AliyunOSSUtil.MultipartFileUpload(preFile);
                if(preUrl.equals("false")){
                    return new Result(false,"请上传jpg、png格式图片");
                }
                rLiquor.setLdBefore(preUrl);
            }
            //3.back文件校验，空则填无
            MultipartFile midFile = ((MultipartHttpServletRequest) request).getFile("midFile");
            if(midFile.getOriginalFilename().equals("") || midFile.getOriginalFilename() == null){
                rLiquor.setLdBack("无");
            }else {
                String midUrl = AliyunOSSUtil.MultipartFileUpload(midFile);
                if(midUrl.equals("false")){
                    return new Result(false,"请上传jpg、png格式图片");
                }
                rLiquor.setLdBack(midUrl);
            }
            //4.top文件校验，空则填无
            MultipartFile reaFile = ((MultipartHttpServletRequest) request).getFile("reaFile");
            if (reaFile.getOriginalFilename().equals("") || reaFile.getOriginalFilename() == null){
                rLiquor.setLdTop("无");
            }else {
                String reaUrl = AliyunOSSUtil.MultipartFileUpload(reaFile);
                if(reaUrl.equals("false")){
                    return new Result(false,"请上传jpg、png格式图片");
                }
                rLiquor.setLdTop(reaUrl);
            }

        }catch (Exception e){
            return new Result(false,"图片上传异常，请与网站管理员联系");
        }

        String lId = IDUtils.getSpiritId();

        //5.组装RLiquor对象
        RLiquor liquor = EntityChange.toRLiquor(rLiquor,lId);
        //6.组装RLiquordesc对象
        RLiquordesc rLiquordesc = EntityChange.toRLiquordesc(rLiquor,lId);

        spiritService.addSpirit(liquor);

        spiritService.addSpiritdesc(rLiquordesc);

        //7.入库结束。

        return new Result(true,"入库成功");
    }

    /**
     * 修改详细中的前标、后标、瓶盖图片
     * @param request
     * @param lId
     * @return
     */
    @RequestMapping(value = "/modify/img",method = RequestMethod.POST)
    public Result modifyImg(HttpServletRequest request,String lId){

        RLiquordesc rLiquordesc = rLiquordescMapper.selectByPrimaryKey(lId);

        if(lId == null){
            return new Result(false,"未知错误！");
        }

        try{

            //1.pre文件修改
            MultipartFile preFile = ((MultipartHttpServletRequest) request).getFile("preFile");
            if(preFile.getOriginalFilename() != null && !preFile.getOriginalFilename().trim().equals("")){
                String preUrl = AliyunOSSUtil.MultipartFileUpload(preFile);
                if (!preUrl.equals("false")){
                    rLiquordesc.setLdBefore(preUrl);
                }else {
                    return new Result(false,"请上传jpg、png格式图片");
                }
            }


            //2.mid文件修改
            MultipartFile midFile = ((MultipartHttpServletRequest) request).getFile("midFile");
            if(midFile.getOriginalFilename() != null && !midFile.getOriginalFilename().trim().equals("")){
                String midUrl = AliyunOSSUtil.MultipartFileUpload(midFile);
                if (!midUrl.equals("false")){
                    rLiquordesc.setLdBack(midUrl);
                }else {
                    return new Result(false,"请上传jpg、png格式图片");
                }
            }


            //3.top文件修改
            MultipartFile topFile = ((MultipartHttpServletRequest) request).getFile("topFile");
            if(topFile.getOriginalFilename() != null && !topFile.getOriginalFilename().trim().equals("")){
                String topUrl = AliyunOSSUtil.MultipartFileUpload(topFile);
                if (!topUrl.equals("false")){
                    rLiquordesc.setLdTop(topUrl);
                }else {
                    return new Result(false,"请上传jpg、png格式图片");
                }
            }

            rLiquordescMapper.updateByPrimaryKey(rLiquordesc);

        } catch (Exception e){
            return new Result(false,"图片上传异常，请与网站管理员联系");
        }

        return new Result(true,"修改成功");

    }


    /**
     * 通过lId查找酒的详细信息（修改）
     * @param lId
     * @return
     */
    @RequestMapping(value = "/finddesc",method = RequestMethod.GET)
    public Result findOneDesc(String lId){

        RLiquorCustom one = spiritService.findOne(lId);

        return new Result(true,"查找成功",one);
    }

    /**
     * 修改酒基本信息（文本信息）
     * @param rLiquor
     * @return
     */
    @RequestMapping(value = "/modify/base",method = RequestMethod.POST)
    public Result modifyBase(@RequestBody RLiquor rLiquor){

        return spiritService.update(rLiquor);
    }

}
