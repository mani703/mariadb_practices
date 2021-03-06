package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.CategoryDao;
import com.douzone.bookmall.vo.CategoryVo;

public class CategoryDaoTest {

	public static void main(String[] args) {
//		insertTest();
		findAllTest();
	}
	
	private static void findAllTest() {
		List<CategoryVo> list = new CategoryDao().findAll();
		for(CategoryVo vo : list) {
			System.out.println(vo);
		}
	}
	
	private static void insertTest() {
		CategoryVo vo = null;
		
		vo = new CategoryVo();
		vo.setCategoryName("소설");
		new CategoryDao().insert(vo);
		
		vo = new CategoryVo();
		vo.setCategoryName("수필");
		new CategoryDao().insert(vo);
		
		vo = new CategoryVo();
		vo.setCategoryName("컴퓨터/IT");
		new CategoryDao().insert(vo);
		
		vo = new CategoryVo();
		vo.setCategoryName("인문");
		new CategoryDao().insert(vo);

		vo = new CategoryVo();
		vo.setCategoryName("경제");
		new CategoryDao().insert(vo);

		vo = new CategoryVo();
		vo.setCategoryName("예술");
		new CategoryDao().insert(vo);
	}

}
