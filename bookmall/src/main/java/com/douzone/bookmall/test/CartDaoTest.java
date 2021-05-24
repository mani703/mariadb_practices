package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.CartDao;
import com.douzone.bookmall.vo.CartVo;

public class CartDaoTest {

	public static void main(String[] args) {
//		insertTest();
		findAllTest();
	}
	
	private static void findAllTest() {
		List<CartVo> list = new CartDao().findAll();
		for(CartVo vo : list) {
			System.out.println(vo);
		}
	}
	
	private static void insertTest() {
		CartVo vo = null;
		
		vo = new CartVo();
		vo.setBookNo(1L);
		vo.setUserNo(1L);
		vo.setCount(1);
		new CartDao().insert(vo);
		
		vo = new CartVo();
		vo.setBookNo(2L);
		vo.setUserNo(2L);
		vo.setCount(2);
		new CartDao().insert(vo);

	}
}