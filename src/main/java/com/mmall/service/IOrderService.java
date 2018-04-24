package com.mmall.service;

import com.mmall.common.ServerResponse;

public interface IOrderService {
    ServerResponse pay(Long orderNo, Integer userId, String path);
}
