package com.fxp.hg.mall.domain;

import com.fxp.hg.model.PmsProduct;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2019-12-27 13:55
 * @description: 首页内容返回信息封装
 **/
@Getter
@Setter
public class HomeContentResult {
    //新品推荐
    private List<PmsProduct> newProductList;
    //人气推荐
    private List<PmsProduct> hotProductList;
}
