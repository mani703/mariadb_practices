package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.BookDao;
import com.douzone.bookmall.vo.BookVo;

public class BookDaoTest {

	public static void main(String[] args) {
//		findAllTest();
//		insertTest();
//		updateTest();
		deleteTest();
	}
	
	private static void findAllTest() {
		List<BookVo> list = new BookDao().findAll();
		for(BookVo vo : list) {
			System.out.println(vo);
		}
	}
	
	private static void insertTest() {
		BookVo vo = null;
		
		vo = new BookVo();
		vo.setBookName("작은별");
		vo.setBookPrice(18000);
		vo.setCategoryNo(1L);
		new BookDao().insert(vo);
		
		vo = new BookVo();
		vo.setBookName("라이브러리");
		vo.setBookPrice(17000);
		vo.setCategoryNo(1L);
	}
	
	private static void updateTest() {
		BookVo vo = null;
		
		new BookDao().update(1L, 15000);
	}
	
	private static void deleteTest() {
		new BookDao().delete(22L);
	}

}
