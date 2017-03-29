package com.demo.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.UserEntity;
import com.demo.service.UserService;

/**
 * 用户操作action
 * @ClassName:UserAction
 * @author Cc
 * @date 2017年3月28日 下午9:05:06
 */
@Controller
@RequestMapping("/action")
public class UserAction extends BaseAction{
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("userAction!login.do")
	public String getAllUsers(){
		List<UserEntity> list = userService.getAllUsers();
		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("password"));
		System.out.println(list.size());
		return "成功";
	}
}
 