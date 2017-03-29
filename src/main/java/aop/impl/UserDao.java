package aop.impl;

import org.springframework.stereotype.Component;

import aop.inf.IUserDao;
import aop.pojo.Person;

@Component
public class UserDao implements IUserDao {

	public void save(Person person) {
		System.out.println("保存");
	}

}
