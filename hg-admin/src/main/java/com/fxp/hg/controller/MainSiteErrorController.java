package com.fxp.hg.controller;

import com.alibaba.fastjson.JSONObject;
import com.fxp.hg.common.api.ResultCode;
import com.fxp.hg.common.utils.CommonUtil;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2020-01-02 17:09
 * @description: 系统错误拦截，主要是针对404错误
 **/
@Controller
public class MainSiteErrorController implements ErrorController {
    private static final String ERROR_PATH = "/error";

    /***
     * @creed: Talk is cheap,show me the code
     * @Date: 2020/1/2 0002 17:11
     * @Description:
     *  主要是登陆后的各种错误路径  404页面改为返回此json
     *  未登录的情况下,大部分接口都已经被shiro拦截,返回让用户登录了
     * @Return:
     **/
    @RequestMapping(value = ERROR_PATH)
    @ResponseBody
    public JSONObject handleError() {
        return CommonUtil.errorJson(ResultCode.E_501);
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
