package com.fxp.hg.mall.service;

import com.fxp.hg.mall.domain.HomeContentResult;
import com.fxp.hg.model.PmsProduct;

import java.util.List;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2019-12-27 13:51
 * @description: 首页内容管理Service
 **/
public interface HomeService {

    /**
     * 获取首页内容
     */
    HomeContentResult content();

    /**
     * 首页商品推荐
     */
    List<PmsProduct> recommendProductList(Integer pageSize, Integer pageNum);
}
