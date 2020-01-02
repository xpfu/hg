package com.fxp.hg.mall.service;

import com.fxp.hg.common.api.CommonResult;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2019-12-27 14:22
 * @description: 前台订单管理Service
 **/
public interface OmsPortalOrderService {

    /**
     * 支付成功后的回调
     */
    @Transactional
    CommonResult paySuccess(Long orderId);

    /**
     * 自动取消超时订单
     */
    @Transactional
    CommonResult cancelTimeOutOrder();

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);

    /**
     * 发送延迟消息取消订单
     */
    void sendDelayMessageCancelOrder(Long orderId);
}
