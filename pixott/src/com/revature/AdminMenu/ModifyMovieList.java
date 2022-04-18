package com.revature.AdminMenu;

import java.util.List;

import com.revature.Admin.AdminMenu;
import com.revature.Moviedao.Movielist;
import com.revature.SQL.AdminModify;
import com.revature.SQL.search;
import com.revature.app.App;

public class ModifyMovieList {
public static void display() {
	System.out.println("enter the movie name to modify");
	String name = App.scanner.next();
	search movie = new search();
	List<Movielist> find = movie.search(name);
	System.out.println("search result");
	find.forEach(System.out::println);
	System.out.println("select a movie (enter the id)");
	int id = App.scanner.nextInt();
	System.out.println("enter the movie name that needs to be modified");
	String updated = App.scanner.next();
	AdminModify mod = new AdminModify();
	List<Movielist> m= mod.modify(updated,id);
	AdminMenu.display();
}
}
