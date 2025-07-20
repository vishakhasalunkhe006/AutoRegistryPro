package com.service;
import java.util.Scanner;
import com.client.*;
import com.model.*;
public class RTO {
Scanner s=new Scanner(System.in);
public Vehicle regVehicle() {
System.out.println("Enter registration id :");
int Id=s.nextInt();
System.out.println("Enter model name :");
String modnm=s.next()+s.nextLine();
System.out.println("Enter colour :");
String color=s.next()+s.nextLine();
System.out.println("Enter area :");
String area=s.next()+s.nextLine();
System.out.println("Enter owner name :");
String own=s.next()+s.nextLine();
System.out.println("Enter mobile no :");
long mob=s.nextLong();
System.out.println("Enter adhar no :");
long adhar=s.nextLong();
System.out.println("Enter price :");
int price=s.nextInt();
Vehicle v1=new Vehicle(Id,modnm,color,area,own,mob,adhar,price);
return v1;
}
public void viewDetails(Vehicle v) {
System.out.println("=============================Your Details=============================");
System.out.println("Registration id :"+v.Id);
System.out.println("Model name :"+v.modnm);
System.out.println("Colour :"+v.color);
System.out.println("Owner name :"+v.own);
System.out.println("City area :"+v.area);
System.out.println("Mobile no :"+v.mob);
System.out.println("Adhar No :"+v.adhar);
System.out.println("Price :"+v.price);
}
}