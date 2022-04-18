package com.revature.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.Moviedao.Gener;
import com.revature.dao.Util;

public class SelectBasedonGener {
public List<Gener> gener(int id){
	List<Gener> gen = new ArrayList<>();
	String sql = String.format("select * from movie join gener on gener_id=%d where gener.id=%d;",id,id);
	try(Connection con = Util.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			){
		ResultSet rs= stmt.executeQuery();
		while(rs.next()) {
			Gener mov = new Gener();
			mov.setId(rs.getInt("id"));
			mov.setMovie_name(rs.getString("movie_name"));
			gen.add(mov);
		}
		}catch(SQLException e) {
			Util.displayMessage(e);
	}
	return gen;
}
}
