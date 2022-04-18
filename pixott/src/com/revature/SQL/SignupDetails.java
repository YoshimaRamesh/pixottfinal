package com.revature.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.Moviedao.userLoginDao;
import com.revature.dao.Util;

public class SignupDetails {
public List<userLoginDao> signup(int login_id,String password, String name){
	String sql= "insert into user_details (login_id,password,name) values (?,?,?)";
	List<userLoginDao> signup = new ArrayList<>();
	try(
			Connection connection = Util.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			){
                 stmt.setInt(1,login_id);
                 stmt.setString(2, password);
                 stmt.setString(3, name);
                 stmt.executeUpdate();
}catch(SQLException e) {
	Util.displayMessage(e);
}
	return signup;
}
}
