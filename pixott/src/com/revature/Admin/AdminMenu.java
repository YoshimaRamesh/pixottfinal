package com.revature.Admin;

import com.revature.AdminMenu.Changetop5movies;
import com.revature.AdminMenu.Markunavaliable;
import com.revature.AdminMenu.ModifyMovieList;
import com.revature.UI.Mainmenu;
import com.revature.app.App;

public class AdminMenu {
public static void display() {
	System.out.println("Menu");
	System.out.println("===");
	System.out.println("1) Change Top 5 Movies");
	System.out.println("2) Mark movie unavailable");
	System.out.println("3) Modify movie details");
	System.out.println("4) back to MainMenu");
	System.out.println("Select an option:");
	int option = App.scanner.nextInt();
	if(option==1) {
		Changetop5movies.display();
	}
	else if(option==2) {
		Markunavaliable.display();
	}
	else if(option==3) {
		ModifyMovieList.display();
	}
	else if (option==4) {
		Mainmenu.display();
	}
}
}
