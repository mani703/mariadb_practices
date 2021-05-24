package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.OrderDao;
import com.douzone.bookmall.dao.UserDao;
import com.douzone.bookmall.vo.OrderVo;

public class OrderDaoTest {

	public static void main(String[] args) {
//		insertT
		findAllTest();
	}

	private static void findAllTest() {
		List<OrderVo> list = new OrderDao().findAll();
		for(OrderVo vo : list) {
			System.out.println(vo);
		}
	}
	
	private static void insertTest() {
		OrderVo vo = null;
		
		vo = new OrderVo();
		vo.setOrderNum(1);
		vo.setOrderPrice(15000);
		vo.setAddress("부산");
		vo.setUserNo(1L);
		new OrderDao().insert(vo);
		
		vo = new OrderVo();
		vo.setOrderNum(2);
		vo.setOrderPrice(16000);
		vo.setAddress("서울");
		vo.setUserNo(2L);
		new OrderDao().insert(vo);
		
		vo = new OrderVo();
		vo.setOrderNum(3);
		vo.setOrderPrice(17000);
		vo.setAddress("대전");
		vo.setUserNo(3L);
		new OrderDao().insert(vo);
	}
}
