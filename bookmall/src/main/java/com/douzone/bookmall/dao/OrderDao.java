package com.douzone.bookmall.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.douzone.bookmall.vo.OrderVo;

public class OrderDao {
	
	public List<OrderVo> findAll(){
		List<OrderVo> result = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			
			String sql = 
					"select a.order_num, concat(b.user_name,\"/\",b.user_email), a.order_price, a.address" +
					" from user_order a, user b" +
					" where a.user_no = b.user_no";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int orderNum = rs.getInt(1);
				String orderName = rs.getString(2);
				int orderPrice = rs.getInt(3);
				String address = rs.getString(4);
				
				OrderVo vo = new OrderVo();
				vo.setOrderNum(orderNum);
				vo.setOrderName(orderName);
				vo.setOrderPrice(orderPrice);
				vo.setAddress(address);
				
				result.add(vo);
			}
					
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public boolean insert(OrderVo vo) {
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			
			String sql = "insert into user_order values(null, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getOrderNum());
			pstmt.setInt(2, vo.getOrderPrice());
			pstmt.setString(3, vo.getAddress());
			pstmt.setLong(4, vo.getUserNo());
			
			int count = pstmt.executeUpdate();
			result = count == 1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return result;
	}
	
	private static Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mysql://192.168.80.117:3307/bookmall?characterEncoding=utf8"; 
			conn = DriverManager.getConnection(url, "bookmall", "bookmall");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
