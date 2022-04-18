package com.revature.AdminMenu;

import java.util.List;

import com.revature.Admin.AdminMenu;
import com.revature.Moviedao.Movielist;
import com.revature.SQL.AdminChangetop;
import com.revature.SQL.AdminTop5movies;
import com.revature.SQL.search;
import com.revature.app.App;

public class Changetop5movies {
public static void display() {
	System.out.println("Current top 5 movies");
	AdminTop5movies dao = new AdminTop5movies();
	List<Movielist> list = dao.show();
	list.forEach(System.out::println);
	System.out.println("Enter the movie id which needs to be removed from the list:");
	int id = App.scanner.nextInt();
	System.out.println("enter the movie that needs to be added in the top 5 movies list");
	String name = App.scanner.next();
	search movie = new search();
	List<Movielist> find = movie.search(name);
	System.out.printf("search result fot the movie '%s' \n",name);
	find.forEach(System.out::println);
	System.out.println("enter the movie id that needs to be added in the list");
	int include = App.scanner.nextInt();
	AdminChangetop change = new AdminChangetop();
	List<Movielist> add = change.delete(include,id);
	System.out.println("top 5 movies modified Successfully");
	System.out.println("updated top movies");
	AdminMenu.display();
}
}
