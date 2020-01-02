package com.fxp.hg.mall.service.impl;

import com.fxp.hg.mall.dao.HomeDao;
import com.fxp.hg.mall.domain.HomeContentResult;
import com.fxp.hg.mall.service.HomeService;
import com.fxp.hg.mapper.PmsProductMapper;
import com.fxp.hg.model.PmsProduct;
import com.fxp.hg.model.PmsProductExample;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2019-12-27 13:53
 * @description: 首页内容管理Service实现类
 **/
@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private HomeDao homeDao;

    @Autowired
    private PmsProductMapper productMapper;

    /**
     * 获取首页内容
     */
    @Override
    public HomeContentResult content() {

        HomeContentResult result = new HomeContentResult();

        //获取新品推荐
        result.setNewProductList(homeDao.getNewProductList(0,4));
        //获取人气推荐
        result.setHotProductList(homeDao.getHotProductList(0,4));

        return result;
    }

    /**
     * 首页商品推荐
     * @param pageSize
     * @param pageNum
     * @return
     */
    @Override
    public List<PmsProduct> recommendProductList(Integer pageSize, Integer pageNum) {
        // 暂时默认推荐所有商品
        PageHelper.startPage(pageNum,pageSize);
        PmsProductExample example = new PmsProductExample();
        example.createCriteria()
                .andDeleteStatusEqualTo(0)
                .andPublishStatusEqualTo(1);
        return productMapper.selectByExample(example);
    }
}
