package com.revature.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.Moviedao.Top5;
import com.revature.dao.Util;

public class UserTop5 {
public List<Top5> sh(){
	String sql="select * from top_5_movies join movie on top_5_movies=movie.id;";
	List<Top5> show = new ArrayList<>();
	try(
			Connection connection = Util.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			){
		ResultSet rs= stmt.executeQuery();
		while(rs.next()) {
			Top5 top = new Top5();
			top.setTop_5_movies(rs.getInt("top_5_movies"));
			top.setMovie_name(rs.getString("movie_name"));
			show.add(top);
		}
}catch(SQLException e) {
	Util.displayMessage(e);
}
	return show;
}
}
