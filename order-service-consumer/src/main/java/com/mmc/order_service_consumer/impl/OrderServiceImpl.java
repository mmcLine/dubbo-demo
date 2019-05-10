package com.mmc.order_service_consumer.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmc.common_api.order.OrderService;
import com.mmc.common_api.user.UserAddress;
import com.mmc.common_api.user.UserService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	UserService userService;
	
	@Override
	public void initOrder(String userId) {
		List<UserAddress> list = userService.getUserAddressList(userId);
		System.out.println(list);
	}

}
