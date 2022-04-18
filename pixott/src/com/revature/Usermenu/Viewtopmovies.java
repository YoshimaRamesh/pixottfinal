package com.revature.Usermenu;

import java.util.List;

import com.revature.Moviedao.Movielist;
import com.revature.Moviedao.Top5;
import com.revature.SQL.Insertintowishlist;
import com.revature.SQL.LoginDetails;
import com.revature.SQL.UserTop5;
import com.revature.UI.Login;
import com.revature.SQL.AddHistory;
import com.revature.SQL.AdminTop5movies;
import com.revature.app.App;

public class Viewtopmovies {
public static void display() {
	System.out.println("Top 5 Trending Movies");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
	UserTop5 dao = new UserTop5();
	List<Top5> list = dao.sh();
	list.forEach(System.out::println);
	System.out.println("Select a movie (Enter Id):");
	int id = App.scanner.nextInt();
	System.out.println("1] Add movie to Wish List");
	System.out.println("2] Play movie");
	System.out.println("Select an option:");
	int option = App.scanner.nextInt();
	int unique =Login.userid;
	if(option==1) {
		Insertintowishlist ins = new Insertintowishlist();
		List<Movielist> s= ins.wishlist(id,unique);
		userMenu.display();
	}
	else if(option ==2) {
		AddHistory his = new AddHistory();
		List<Movielist> h= his.history(id,unique);
		System.out.println("Put your phone in silent and grab a popcorn");
		System.out.println("Thanks for Watching......");
		userMenu.display();
	}
	}
}
