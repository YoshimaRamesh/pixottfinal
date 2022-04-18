package com.revature.UI;
import com.revature.Admin.AdminMenu;
import com.revature.SQL.Getuserid;
import com.revature.SQL.LoginDetails;
import com.revature.Usermenu.userMenu;
import com.revature.app.App;
public class Login {
	public static int userid;
public static void display() {
	System.out.println("Login");
	System.out.println("~~~~~");
	System.out.println("Enter the Mobile Number:");
	int mobile = App.scanner.nextInt();
	System.out.println("Enter The Password:");
	String password= App.scanner.next();
	String admin="pass";
	LoginDetails login = new LoginDetails();
	boolean user = login.check(mobile, password);
	if(mobile==9&&password.equals(admin)) {
		System.out.println("Welcome Admin");
		System.out.println("~~~~~~~~~~~~~~");
		AdminMenu.display();
	}
	else if(user) {
		userid=Getuserid.id(mobile, password);
		userMenu.display();
	}
	else {
    System.out.println("Invalid please try again with correct details or Signup if you are a new User");
    Mainmenu.display();
	}
	}
}
