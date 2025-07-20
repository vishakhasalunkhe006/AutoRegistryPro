package com.model;

public class Vehicle 
{
public int Id,price;
public String own,modnm,color,area;
public long adhar,mob;
public Vehicle(int Id, String modnm, String color, String area, String own,
long mob, long adhar, int price) {
this.Id=Id;
this.modnm=modnm;
this.color=color;
this.area=area;
this.own=own;
this.adhar=adhar;
this.price=price;
this.mob=mob;
}
}