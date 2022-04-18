package com.revature.UI;

import java.util.List;

import com.revature.Moviedao.userLoginDao;
import com.revature.SQL.SignupDetails;
import com.revature.app.App;

public class Signup {
public static void display() {
	System.out.printf("%50s \n","Thanks for choosing pix OTT Signup with the following details");
	System.out.println("====================================================================");
	System.out.println("Enter your Name:");
	String name= App.scanner.next();
	System.out.println("Enter your Mobile:");
	int mobile = App.scanner.nextInt();
	System.out.println("Enter your Password:");
	String password = App.scanner.next();
	SignupDetails signup = new SignupDetails();
	List<userLoginDao> details = signup.signup(mobile, password, name);
	System.out.println("====================================================================");
	System.out.printf("%50s \n","Signup successfull. Login and enjoy your day");
	Mainmenu.display();
}
}
