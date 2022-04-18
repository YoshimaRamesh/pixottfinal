package com.revature.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import com.revature.Moviedao.Movielist;
import com.revature.Moviedao.userLoginDao;
import com.revature.UI.Login;
import com.revature.dao.Util;

public class ViewWishlist {
public List<Movielist> view(int id){
	String sql= String.format("select * from wishlist inner join movie on wishlist = movie.id inner join user_details on user_id=%d where user_details.id=%d;",id,id);
	//String sql="select * from wishlist inner join movie on wishlist = movie.id inner join user_details on user_id=1 = user_details.id;";
	//String sql="select * from wishlist join movie on wishlist = movie.id;";
	List<Movielist> show = new ArrayList<>();
	try(
			Connection connection = Util.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			){
		ResultSet rs= stmt.executeQuery();
		while(rs.next()) {
			Movielist sh=new Movielist();
			sh.setId(rs.getInt("id"));
			sh.setMovie_name(rs.getString("movie_name"));
			show.add(sh);
		}
}catch (SQLException e) {
	Util.displayMessage(e);
}
	return show;
}
}
