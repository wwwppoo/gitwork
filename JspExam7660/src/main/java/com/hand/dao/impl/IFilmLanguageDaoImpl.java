package com.hand.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hand.dao.IFilmLanguageDao;
import com.hand.vo.Customer;
import com.hand.vo.FilmLanguage;

public class IFilmLanguageDaoImpl implements IFilmLanguageDao{

	public List<FilmLanguage> selectFilmLanguage() {
		
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<FilmLanguage> list = new ArrayList<FilmLanguage>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "123456");
			//stmt = conn.createStatement();
			String sql = "select * from film,language where film.language_id = language.language_id";
			pstmt = conn.prepareStatement(sql);
			//pstmt.setString(1, username);
			//rs = stmt.executeQuery(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				int film_id = rs.getInt("film_id");
				String title = rs.getString("title");
				String description = rs.getString("description");
				int language_id = rs.getInt("language.language_id");
				String language = rs.getString("name");
				FilmLanguage filmLanguage = new FilmLanguage(film_id,title,description,language_id,language);
				list.add(filmLanguage);
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
	
	public int deleteFilmLanguage(int fid) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int i = 0;
		//int j = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "123456");
			//stmt = conn.createStatement();
			
			/*String sql2 ="update from film set language_id =null where film_id" ;
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, fid);
			j = pstmt.executeUpdate();*/
			
			String sql = "delete from film where film_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, fid);
			//rs = stmt.executeQuery(sql);
			//rs = pstmt.executeQuery();
			i = pstmt.executeUpdate();
			
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
		return i;
	}
	
	public int insertFilmLanguage(FilmLanguage filmLanguage) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int i = 0;
		//int j = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "123456");
			//stmt = conn.createStatement();
			
			/*String sql2 ="update from film set language_id =null where film_id" ;
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, fid);
			j = pstmt.executeUpdate();*/
			
			String sql = "insert into film(title,description,language_id) values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, filmLanguage.getTitle());
			pstmt.setString(2, filmLanguage.getDescription());
			pstmt.setInt(3, filmLanguage.getLanguage_id());
			//rs = stmt.executeQuery(sql);
			//rs = pstmt.executeQuery();
			i = pstmt.executeUpdate();
			
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
		return i;
	}
	
	public FilmLanguage selectFilmId(int fid) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		FilmLanguage filmLanguage = new FilmLanguage();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "123456");
			//stmt = conn.createStatement();
			String sql = "select * from film where film_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, fid);
			//rs = stmt.executeQuery(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				String title = rs.getString("title");
				String description = rs.getString("description");
				int language_id = rs.getInt("film.language_id");
				filmLanguage = new FilmLanguage(title,description,language_id);
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
		return filmLanguage;
	}
	
	public int updateFilm(FilmLanguage filmLanguage) {
		
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int i = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "123456");
			//stmt = conn.createStatement();
			
			
			
			String sql = "update film set title=?,description=?,language_id=? where film_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, filmLanguage.getTitle());
			pstmt.setString(2, filmLanguage.getDescription());
			pstmt.setInt(3, filmLanguage.getLanguage_id());
			pstmt.setInt(4, filmLanguage.getFilm_id());
			//rs = stmt.executeQuery(sql);
			//rs = pstmt.executeQuery();
			i = pstmt.executeUpdate();
			
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
		return i;
	}

}
