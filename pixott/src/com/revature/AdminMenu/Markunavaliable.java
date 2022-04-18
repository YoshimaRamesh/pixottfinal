package com.revature.AdminMenu;

import java.util.List;

import com.revature.Admin.AdminMenu;
import com.revature.Moviedao.Movielist;
import com.revature.SQL.AdminMarkunavaliable;
import com.revature.SQL.search;
import com.revature.app.App;

public class Markunavaliable {
public static void display() {
	System.out.println("enter the movie keyword that needs to be removed");
	String name = App.scanner.next();
	search movie = new search();
	List<Movielist> find = movie.search(name);
	System.out.printf("search result for the moviename '%s' \n",name);
	find.forEach(System.out::println);
	System.out.println("enter the movie's ID that needs to be removed from the list");
	System.out.println("id");
	int id = App.scanner.nextInt();
	//System.out.println("name");
	//String name1 = App.scanner.nextLine();
	//name1+=App.scanner.nextLine();
	AdminMarkunavaliable del =new AdminMarkunavaliable();
	List<Movielist> modify = del.delete(id);
	System.out.println("Movie successfully removed from the list");
	AdminMenu.display();
}
}
