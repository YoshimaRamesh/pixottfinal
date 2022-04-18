package com.revature.Usermenu;
import java.util.List;

import com.revature.Moviedao.Gener;
import com.revature.Moviedao.Movielist;
import com.revature.SQL.AddHistory;
import com.revature.SQL.Insertintowishlist;
import com.revature.SQL.SelectBasedonGener;
import com.revature.UI.Login;
import com.revature.app.App;

public class userGener {
public static void display() {
	System.out.println("Select The Gener");
	System.out.println("1] Action");
	System.out.println("2] Animation");
	System.out.println("3] Comedy");
	System.out.println("4] Drama");
	System.out.println("5] Fantasy");
	System.out.println("6] Romance");
	System.out.println("Enter The Gener number");
	int id = App.scanner.nextInt();
	SelectBasedonGener se = new SelectBasedonGener();
	List<Gener> gen = se.gener(id);
	System.out.println(String.format("%s %s %-40s", "Id","|","Movie"));
	System.out.println("~~~~~~~~~~~~~~~~~~~~~");
	gen.forEach(System.out::println);
	System.out.println("Enter The Movie Id");
	int movid = App.scanner.nextInt();
	System.out.println("1] Add movie to Wish List");
	System.out.println("2] Play movie");
	System.out.println("Select an option:");
	int option = App.scanner.nextInt();
	int unique= Login.userid;
	if(option==1) {
		Insertintowishlist ins = new Insertintowishlist();
		List<Movielist> inse = ins.wishlist(movid,unique);
		userMenu.display();
	}
	else if(option ==2) {
		AddHistory his = new AddHistory();
		List<Movielist> h= his.history(movid,unique);
		System.out.println("Put your phone in silent and grab a popcorn");
		System.out.println("Thanks for Watching......");
		userMenu.display();
	}
	
}
}
