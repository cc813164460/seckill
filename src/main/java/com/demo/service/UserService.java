package com.demo.service;

import java.util.List;

import com.demo.entity.UserEntity;
/**
 * 用户操作service
 * @ClassName:UserService
 * @author Cc
 * @date 2017年3月28日 下午9:02:23
 */
public interface UserService {
	/**
	 * 获取所有用户
	 * @author : Cc
	 * @return
	 */
	List<UserEntity> getAllUsers();
}
 