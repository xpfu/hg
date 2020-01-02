package com.fxp.hg.mall.domain;

import com.fxp.hg.model.PmsProduct;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2019-12-27 14:03
 * @description: 秒杀信息和商品对象封装
 **/
@Getter
@Setter
public class FlashPromotionProduct extends PmsProduct {
    private BigDecimal flashPromotionPrice;
    private Integer flashPromotionCount;
    private Integer flashPromotionLimit;
}
