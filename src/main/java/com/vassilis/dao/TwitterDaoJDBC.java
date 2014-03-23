package com.vassilis.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.w3c.dom.CDATASection;

import com.vassilis.model.Twitter;

@Repository("TwitterDao")
public class TwitterDaoJDBC implements TwitterDao {
	
	@Autowired
	private DataSource dataSource;
	
	public List<Twitter> getTwitters() {
		String sql = "select * from employee";
		List<Twitter> twitters = new ArrayList<Twitter>();
		Connection con=null;
		Statement stm=null;
		
		try {
			con = dataSource.getConnection();
			
			stm = con.createStatement();
			
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				Twitter twitter = new Twitter();
				
				twitter.setUsername(rs.getString("name"));
				twitter.setPassword("***");
				
				twitters.add(twitter);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(stm!=null) {
				try {
					stm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return twitters;
	}

	public Twitter getTwitter(String userrname) {
		return null;
	}
}
