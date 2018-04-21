package com.mmall.dao;

import com.mmall.pojo.Shipping;
import org.springframework.web.bind.annotation.RequestParam;

public interface ShippingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shipping record);

    int insertSelective(Shipping record);

    Shipping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shipping record);

    int updateByPrimaryKey(Shipping record);

    int deleteByShippingIdUserId(@RequestParam("userId") Integer userId, @RequestParam("shippingId") Integer shippingId);

    int updateByShipping(Shipping recond);

    Shipping selectByShippingIdUserId(@RequestParam("userId") Integer userId,@RequestParam("shippingId") Integer shippingId);
}