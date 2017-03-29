package com.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.dao.UserDao;
import com.demo.entity.UserEntity;
import com.demo.service.UserService;
/**
 * 用户操作service实现类
 * @ClassName:UserServiceImpl
 * @author Cc
 * @date 2017年3月28日 下午9:02:44
 */
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	/**
	 * 获取所有用户信息
	 * @author : Cc
	 * @return
	 */
	public List<UserEntity> getAllUsers() {
		
		return userDao.getAllUsers();
	}

}
 