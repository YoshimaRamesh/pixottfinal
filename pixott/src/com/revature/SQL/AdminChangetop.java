package com.revature.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.Moviedao.Movielist;
import com.revature.dao.Util;
public class AdminChangetop {
	public List<Movielist> delete(int add, int id){
		String sql= "update top_5_movies set top_5_movies =? where id=?";
		List<Movielist> movies = new ArrayList<>();
		try(
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
				){
	                 stmt.setInt(1,add);
	                 stmt.setInt(2, id);
	                 stmt.executeUpdate();
	}catch(SQLException e) {
		Util.displayMessage(e);
	}
		return movies;
	}
}
