package com.demo.dao;

import java.util.List;

import com.demo.entity.UserEntity;

/**
 * 用户操作dao
 * @ClassName:UserDao
 * @author Cc
 * @date 2017年3月28日 下午9:03:33
 */
public interface UserDao {
	/**
	 * 获取所有用户信息
	 * @author : Cc
	 * @return
	 */
	List<UserEntity> getAllUsers();
}
 