package com.mmc.common_api.user;

public class UserAddress implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String userAddress;
	private String userId;
	private String consignee;
	private String phoneNum;
	private String isDefault;
	public UserAddress(int id, String userAddress, String userId,
			String consignee, String phoneNum, String isDefault) {
		super();
		this.id = id;
		this.userAddress = userAddress;
		this.userId = userId;
		this.consignee = consignee;
		this.phoneNum = phoneNum;
		this.isDefault = isDefault;
	}
	
	public UserAddress() {}

	@Override
	public String toString() {
		return "UserAddress [id=" + id + ", userAddress=" + userAddress
				+ ", userId=" + userId + ", consignee=" + consignee
				+ ", phoneNum=" + phoneNum + ", isDefault=" + isDefault + "]";
	}
	
	
	
}
