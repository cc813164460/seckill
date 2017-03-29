package com.demo.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.dao.UserDao;


//用来声明在Spring环境下进行测试
@RunWith(SpringJUnit4ClassRunner.class)
//用来声明配置文件，把项目中所有的关于ssh的配置文件声明到
@ContextConfiguration(locations={"classpath:context.xml"})
public class Test {
	@Resource
	private UserDao user;
	@org.junit.Test
	public void getAllUser(){
		try {
			List list = user.getAllUsers();
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
