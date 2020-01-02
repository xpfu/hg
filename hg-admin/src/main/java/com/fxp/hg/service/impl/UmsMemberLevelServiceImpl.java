package com.fxp.hg.service.impl;

import com.fxp.hg.mapper.UmsMemberLevelMapper;
import com.fxp.hg.model.UmsMemberLevel;
import com.fxp.hg.model.UmsMemberLevelExample;
import com.fxp.hg.service.UmsMemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2019-12-26 18:36
 * @description: 会员等级管理Service实现类
 **/
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {
    @Autowired
    private UmsMemberLevelMapper memberLevelMapper;
    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        example.createCriteria().andDefaultStatusEqualTo(defaultStatus);
        return memberLevelMapper.selectByExample(example);
    }
}
