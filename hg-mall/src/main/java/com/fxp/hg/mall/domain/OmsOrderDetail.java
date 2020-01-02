package com.fxp.hg.mall.domain;

import com.fxp.hg.model.OmsOrder;
import com.fxp.hg.model.OmsOrderItem;

import java.util.List;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2019-12-27 14:30
 * @description: 包含订单商品信息的订单详情
 **/
public class OmsOrderDetail extends OmsOrder {
    private List<OmsOrderItem> orderItemList;

    public List<OmsOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OmsOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
