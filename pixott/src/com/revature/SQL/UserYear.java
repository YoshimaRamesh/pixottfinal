package com.revature.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.Moviedao.*;
import com.revature.dao.Util;

public class UserYear {
public List<Year> year(int id) {
	String sql = String.format("select id,movie_name, max(worldwide_gross) from movie where year_id=%d;", id);
	List<Year> yr = new ArrayList<>();
	try (Connection con = Util.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);){
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			Year r = new Year();
			r.setId(rs.getInt("id"));
			r.setMovie_name(rs.getString("movie_name"));
			yr.add(r);
		}
	}catch(SQLException e) {
		Util.displayMessage(e);
	}
	return yr;
}
}
