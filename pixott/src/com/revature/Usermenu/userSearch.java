package com.revature.Usermenu;
import java.util.List;

import com.revature.Moviedao.Movielist;
import com.revature.SQL.AddHistory;
import com.revature.SQL.Insertintowishlist;
import com.revature.SQL.search;
import com.revature.UI.Login;
import com.revature.app.App;

public class userSearch {
public static void display() {
	System.out.println("Find Movie ");
	System.out.println("~~~~~~~~~~~~~");
	System.out.println("enter the movie name to watch");
	String name = App.scanner.next();
	search movie = new search();
	List<Movielist> find = movie.search(name);
	System.out.println("search result");
	find.forEach(System.out::println);
	System.out.println("select a movie to watch (enter the id)");
	int id = App.scanner.nextInt();
	System.out.println("1] Add movie to Wish List");
	System.out.println("2] Play movie");
	System.out.println("Select an option:");
	int option = App.scanner.nextInt();
	int unique= Login.userid;
	if(option==1) {
		Insertintowishlist ins = new Insertintowishlist();
		List<Movielist> inse = ins.wishlist(id,unique);
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
