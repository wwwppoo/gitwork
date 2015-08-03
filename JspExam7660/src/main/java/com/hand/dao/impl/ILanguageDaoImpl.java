package com.hand.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hand.dao.ILanguageDao;
import com.hand.vo.Customer;
import com.hand.vo.Language;

public class ILanguageDaoImpl implements ILanguageDao {

	public List<Language> selectAllLanguage() {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Language> list = new ArrayList<Language>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "123456");
			//stmt = conn.createStatement();
			String sql = "select * from language";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setString(1, username);
			//rs = stmt.executeQuery(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				int language_id = rs.getInt("language_id");
				String language = rs.getString("name");
				Language lan = new Language(language_id,language);
				list.add(lan);
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
