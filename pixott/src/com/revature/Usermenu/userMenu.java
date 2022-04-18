package com.revature.Usermenu;

import com.revature.UI.Mainmenu;
import com.revature.app.App;

public class userMenu {
public static void display() {
	System.out.println("Menu");
	System.out.println("~~~~~~");
	System.out.println("1] View Top 5 Movies");
	System.out.println("2] Search Movies");
	System.out.println("3] Your Wish List");
	System.out.println("4] View History");
	System.out.println("5] View Movie Based On Gener");
	System.out.println("6] View Movie Based On Highest Gross");
	System.out.println("7] Logout");
	System.out.println("Select an option:");
	int option = App.scanner.nextInt();
	if(option==1) {
		Viewtopmovies.display();
	} 
	else if(option==2) {
		userSearch.display();
	}
	else if(option==3) {
			UserWishlist.display();
		}
	else if(option==4) {
		UserViewHIstory.display();
	}
	else if(option == 5) {
		userGener.display();
	}
	else if (option==6) {
		UserHighestGross.display();
	}
	else if(option==7) {
		System.out.println("Logged out Successfully");
		Mainmenu.display();
	}
}
}
