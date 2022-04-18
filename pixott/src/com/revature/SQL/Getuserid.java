package com.revature.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.dao.Util;

public class Getuserid {
public static int id(int mobile, String password) {
	int userid=0;
	String sql =String.format("select id from user_details where login_id=%d && password='%s';",mobile,password);
	try(Connection connection = Util.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			){
		ResultSet rs= stmt.executeQuery();
		while(rs.next()) {
		userid=rs.getInt("id");
		}
	
}catch (SQLException e) {
	Util.displayMessage(e);
}
	return userid;
}
}
