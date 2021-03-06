package com.chenyilei.service;

import com.chenyilei.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {
    //创建订单
    OrderDTO create(OrderDTO orderDTO);

    //查询单个订单
    OrderDTO findOne(String orderId);

    //查询订单列表
    Page<OrderDTO> findList(String buyerOpenId, Pageable pageable);

    //所有订单
    Page<OrderDTO> findList(Pageable pageable);

    //操作状态
    //取消
    OrderDTO cancel(OrderDTO orderDTO);

    //完结
    OrderDTO finish(OrderDTO orderDTO);

    //支付订单
    OrderDTO paid(OrderDTO orderDTO);
}
