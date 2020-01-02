package com.fxp.hg.common.api;

/**
 * @program: hg-master
 * @author: xp.fu
 * @create: 2019-12-26 15:00
 * @description: 封装API的错误码
 **/
public interface IErrorCode {

    long getCode();

    String getMessage();
}
