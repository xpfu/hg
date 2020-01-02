package com.fxp.hg.common.exception;

import com.alibaba.fastjson.JSONObject;
import com.fxp.hg.common.api.ResultCode;
import com.fxp.hg.common.utils.CommonUtil;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2020-01-02 16:51
 * @description:
 *  * 本系统使用的自定义错误类
 *  * 比如在校验参数时,如果不符合要求,可以抛出此错误类
 *  * 拦截器可以统一拦截此错误,将其中json返回给前端
 **/
public class CommonJsonException extends RuntimeException{
    private JSONObject resultJson;

    /**
     * 调用时可以在任何代码处直接throws这个Exception,
     * 都会统一被拦截,并封装好json返回给前台
     *
     * @param resultCode 以错误的ErrorEnum做参数
     */
    public CommonJsonException(ResultCode resultCode) {
        this.resultJson = CommonUtil.errorJson(resultCode);
    }

    public CommonJsonException(JSONObject resultJson) {
        this.resultJson = resultJson;
    }

    public JSONObject getResultJson() {
        return resultJson;
    }
}
