package com.revature.SQL;
import com.revature.Moviedao.*;
import com.revature.dao.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class AddHistory {
public List<Movielist> history(int id,int unique){
	String sql="insert into history (history,user_id) values (?,?);";
	List<Movielist> his = new ArrayList<>();
	try(Connection connection = Util.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			){
		stmt.setInt(1,id);
		stmt.setInt(2, unique);
		stmt.executeUpdate();
	}catch(SQLException e) {
		Util.displayMessage(e);
	}
	return his;
}
}
