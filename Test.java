package com.client;
import java.util.Scanner;

import com.model.Vehicle;
import com.service.*;
public class Test {
public static void main(String args[]) {
 
	Scanner s = new Scanner(System.in);
	Vehicle v=null;
	RTO pune=new RTO();
	while(true) {
	System.out.println("Welcome to vehical registration system...");
	System.out.println("Options");
	System.out.println("1.vehicle\n2.view your vehicle\n3.Update your details\n4.Exit\n What is your choice?");
	int ch=s.nextInt();
	switch(ch) {
	case 1:
	v=pune.regVehicle();
	System.out.println("Registration Sucessfull.....");
	break;
	case 2:
	pune.viewDetails(v);
	System.out.println("\nDetails showed successfully...");
	break;
	case 3:
		//update vehicle
		int choice = 0;
	{	
	System.out.println("\nUpdate Details\n1.Update Registration id\n2.Update Model Name\n3.Update Price\n4.Updatecolour\n5.Area\n6.Owner\n7.Mobile no.\n8.Adhar no.\n\nEnter your choice : ");
	choice = s.nextInt();
	switch (choice) {
	case 1:
	System.out.println( "Enter Registration Id: ");
	v.Id= s.nextInt();
	System.out.println("\nUpdated successfully...");
	break;
	case 2:
	s.nextLine();
	System.out.println("Enter model name : ");
	v.modnm =s.nextLine();
	System.out.println("\nUpdated successfully...");
	break;
	case 3 :
	System.out.println("Enter new price : ");
	v.price =s.nextInt();
	System.out.println("\nUpdated successfully...");
	break;
	case 4 :
	s.nextLine();
	System.out.println( "Enter new Colour :");
	v.color=s.nextLine();
	System.out.println("\nUpdated successfully...");
	break;
	case 5 :
	s.nextLine();
	System.out.println( "Enter new Area : ");
	v.area= s.nextLine();
	System.out.println("\nUpdated successfully...");
	break;
	case 6 :
	s.nextLine();
	System.out.println( "Enter Owner Name :");
	v.own =s.nextLine();
	System.out.println("\nUpdated successfully...");
	break;
	case 7 :
	System.out.println("Enter new Mobile Number : ");
	v.mob=s.nextLong();
	System.out.println("\nUpdated successfully...");
	break;
	case 8 :
	System.out.println( "Aadhar new Card Number :");
	v.adhar=s.nextLong();
	System.out.println("\nUpdated successfully...");
	break;
	default:
		System.out.println("Wrong Choice");
		}
		}
		break;
	case 4:
		//exit
		System.out.println("logged out......!!!!");
		java.lang.System.exit(0);
	break;
	default:
		System.out.println("Wrong choice");
	}
	}
	}
}


	

