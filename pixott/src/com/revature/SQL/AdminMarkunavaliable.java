package com.revature.SQL;
import com.revature.Moviedao.*;
import com.revature.dao.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class AdminMarkunavaliable {
public List<Movielist> delete(int id){
	List<Movielist> modify = new ArrayList<>();
	String sql = "delete from movie where id=?;";
	try(Connection connection = Util.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			){
		stmt.setInt(1,id);
		stmt.executeUpdate();
	}catch(SQLException e) {
		Util.displayMessage(e);
	}
	return modify;
}
}
