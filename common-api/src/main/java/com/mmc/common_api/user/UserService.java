package com.mmc.common_api.user;

import java.util.List;

public interface UserService {
	List<UserAddress> getUserAddressList(String uerId);
}
