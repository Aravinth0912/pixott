package com.revature.pixott.handler;

import com.revature.pixott.app.App;
import com.revature.pixott.dao.Customerdao;
import com.revature.pixott.model.Customer;

public class Login {
	public static void display() {
		System.out.println("login");
		System.out.println("********");
		System.out.print("mobilenumber;");
		String mobilenumber=App.scanner.next();
		System.out.print("password;");
		String pass=App.scanner.next();
		System.out.println("login successful");
		
		//UserMenu.display();
		
		Customerdao customer=new Customerdao();
		Customer customer1= new Customer();
		customer1.setMobilenumber(mobilenumber);
		customer1.setPassword(pass);
		customer.getCustomer(mobilenumber);
	}

}
