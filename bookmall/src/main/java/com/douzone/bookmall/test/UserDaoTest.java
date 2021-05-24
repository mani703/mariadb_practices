package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.UserDao;
import com.douzone.bookmall.vo.UserVo;

public class UserDaoTest {

	public static void main(String[] args) {
		findAllTest();
//		insertTest();
	}

	private static void findAllTest() {
		List<UserVo> list = new UserDao().findAll();
		for(UserVo vo : list) {
			System.out.println(vo);
		}
	}
	
	private static void insertTest() {
		UserVo vo = null;
		
		vo = new UserVo();
		vo.setUserName("둘리");
		vo.setUserEMail("abc@gmail.com");
		vo.setPassword("1234");
		vo.setPhoneNumber("111-222-3333");
		new UserDao().insert(vo);
		
		vo = new UserVo();
		vo.setUserName("또치");
		vo.setUserEMail("ef@gmail.com");
		vo.setPassword("1234");
		vo.setPhoneNumber("222-333-4444");
		new UserDao().insert(vo);
		
		vo = new UserVo();
		vo.setUserName("도우너");
		vo.setUserEMail("hi@gmail.com");
		vo.setPassword("1234");
		vo.setPhoneNumber("333-444-5555");
		new UserDao().insert(vo);
		
		vo = new UserVo();
		vo.setUserName("마이콜");
		vo.setUserEMail("jk@gmail.com");
		vo.setPassword("1234");
		vo.setPhoneNumber("444-555-6666");
		new UserDao().insert(vo);
		
		vo = new UserVo();
		vo.setUserName("고길동");
		vo.setUserEMail("lm@gmail.com");
		vo.setPassword("1234");
		vo.setPhoneNumber("555-666-7777");
		new UserDao().insert(vo);
	}
}
