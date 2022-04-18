package com.revature.Usermenu;

import java.util.List;

import com.revature.Moviedao.Movielist;
import com.revature.SQL.LoginDetails;
import com.revature.SQL.ViewHistory;
import com.revature.UI.Login;
import com.revature.app.App;

public class UserViewHIstory {
public static void display() {
	int uni =Login.userid;
	System.out.println("Your History");
	System.out.println("~~~~~~~~~~~~~");
	ViewHistory history =new ViewHistory();
	List<Movielist> his = history.show(uni);
	his.forEach(System.out::println);
	userMenu.display();
}
}
