package com.revature.SQL;
import com.revature.Moviedao.*;
import com.revature.dao.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class AdminModify {
public List<Movielist> modify(String name, int id){
	List<Movielist> mod= new ArrayList<>();
	String sql = "update movie set movie_name=(?) where id=(?)";
	try(
			Connection connection = Util.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			){
                 stmt.setString(1,name);
                 stmt.setInt(2, id);
                 stmt.executeUpdate();
}catch(SQLException e) {
	Util.displayMessage(e);
}
	return mod;
}
}
