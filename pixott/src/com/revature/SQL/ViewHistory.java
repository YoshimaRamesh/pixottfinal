package com.revature.SQL;
import com.revature.Moviedao.*;
import com.revature.dao.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
public class ViewHistory {
public List<Movielist> show(int unique){
	String sql = String.format("select * from history inner join movie on history = movie.id inner join user_details on user_id=%d where user_details.id=%d;",unique,unique);
	List<Movielist> sh= new ArrayList<>();
	try(Connection connection = Util.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			){
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			Movielist sho = new Movielist();
			sho.setId(rs.getInt("id"));
			sho.setMovie_name(rs.getString("movie_name"));
			sh.add(sho);
		}
	}catch(SQLException e) {
		Util.displayMessage(e);
	}
	return sh;
}
}
