package com.revature.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.revature.Moviedao.Movielist;
import com.revature.dao.Util;
public class search {
public List<Movielist> search(String Keyword){
	String symbol="%";
	String sql= String.format("select * from movie where movie_name like '%s%s%s'",symbol,Keyword,symbol);
	List<Movielist> movies = new ArrayList<>();
	try(
			Connection connection = Util.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			){
		ResultSet rs= stmt.executeQuery();
		while(rs.next()) {
			Movielist movie = new Movielist();
			movie.setId(rs.getInt("id"));
			movie.setMovie_name(rs.getString("movie_name"));
			movies.add(movie);
		}
	}catch(SQLException e) {
		Util.displayMessage(e);
	}
	return movies;
}
}
