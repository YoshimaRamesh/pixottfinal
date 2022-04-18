package com.revature.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.Moviedao.userLoginDao;
import com.revature.dao.Util;

public class LoginDetails {
public boolean  check(int mobile, String password){
	String sql= String.format("select * from user_details where login_id=%d && password='%s';", mobile,password);
	List<userLoginDao> name=new ArrayList<>();
	boolean user = false;
	try(
			Connection connection = Util.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			){
		ResultSet rs= stmt.executeQuery();
		while(rs.next()) {
			userLoginDao details = new userLoginDao();
			details.setId(rs.getInt("id"));
			details.setLogin_id(rs.getInt("login_id"));
			details.setPassword(rs.getString("password"));
			details.setName(rs.getString("name"));
			name.add(details);
			user=true;
		}
		name.forEach(System.out::println);
		System.out.println("~~~~~~~~~~~~~~~");
	}catch(SQLException e) {
		Util.displayMessage(e);
	}
	return user;
}
}
