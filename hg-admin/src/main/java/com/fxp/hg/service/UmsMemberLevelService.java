package com.fxp.hg.service;

import com.fxp.hg.model.UmsMemberLevel;

import java.util.List;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2019-12-26 18:32
 * @description: 会员等级管理Service
 **/
public interface UmsMemberLevelService {

    /**
     * 获取所有会员登录
     * @param defaultStatus 是否为默认会员
     */
    List<UmsMemberLevel> list(Integer defaultStatus);
}
