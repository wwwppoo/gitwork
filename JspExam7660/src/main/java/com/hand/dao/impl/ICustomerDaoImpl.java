package com.hand.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hand.dao.ICustomerDao;
import com.hand.vo.Customer;

public class ICustomerDaoImpl implements ICustomerDao {

	public List<Customer> matchUsername(String username) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Customer> list = new ArrayList<Customer>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "123456");
			//stmt = conn.createStatement();
			String sql = "select * from customer where first_name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			//rs = stmt.executeQuery(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				String name = rs.getString("first_name");
				Customer customer = new Customer(name);
				list.add(customer);
			}	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(null != rs){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if(null != pstmt){
						try {
							pstmt.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} finally {
							if(null != conn){
								try {
									conn.close();
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					}
				}
			}
		}
		return list;
	}

	

}
