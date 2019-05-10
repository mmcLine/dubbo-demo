package com.mmc.user_service_provider.impl;

import java.util.Arrays;
import java.util.List;

import com.mmc.common_api.user.UserAddress;
import com.mmc.common_api.user.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public List<UserAddress> getUserAddressList(String uerId) {
		UserAddress address1=new UserAddress(1, "南京","a", "", "123", "1");
		UserAddress address2=new UserAddress(2, "南京","b", "", "123", "1");
		return Arrays.asList(address1,address2);
	}

}
