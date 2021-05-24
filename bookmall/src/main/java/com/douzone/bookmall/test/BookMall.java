package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.BookDao;
import com.douzone.bookmall.dao.CartDao;
import com.douzone.bookmall.dao.CategoryDao;
import com.douzone.bookmall.dao.OrderBookDao;
import com.douzone.bookmall.dao.OrderDao;
import com.douzone.bookmall.dao.UserDao;
import com.douzone.bookmall.vo.BookVo;
import com.douzone.bookmall.vo.CartVo;
import com.douzone.bookmall.vo.CategoryVo;
import com.douzone.bookmall.vo.OrderBookVo;
import com.douzone.bookmall.vo.OrderVo;
import com.douzone.bookmall.vo.UserVo;

public class BookMall {

	public static void main(String[] args) {
		System.out.println("======================== User List ========================");
		List<UserVo> userList = new UserDao().findAll();
		for(UserVo vo : userList) {
			System.out.println(vo);
		}
		
		System.out.println("======================== Category List ========================");
		List<CategoryVo> categoryList = new CategoryDao().findAll();
		for(CategoryVo vo : categoryList) {
			System.out.println(vo);
		}
		
		System.out.println("======================== Book List ========================");
		List<BookVo> bookList = new BookDao().findAll();
		for(BookVo vo : bookList) {
			System.out.println(vo);
		}
		
		System.out.println("======================== Cart List ========================");
		List<CartVo> cartList = new CartDao().findAll();
		for(CartVo vo : cartList) {
			System.out.println(vo);
		}
		
		System.out.println("======================== Order List ========================");
		List<OrderVo> orderList = new OrderDao().findAll();
		for(OrderVo vo : orderList) {
			System.out.println(vo);
		}
		
		System.out.println("======================== Order Book List ========================");
		List<OrderBookVo> orderBookList = new OrderBookDao().findAll();
		for(OrderBookVo vo : orderBookList) {
			System.out.println(vo);
		}
	}

}
