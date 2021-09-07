package com.xworkz.controlstatements;

public class IphoneMobPrice {

	public static void main(String[] args) {
	 String mobModel ="iphoneXR";
	 int price;
		
		switch(mobModel)
		{
		case "iphoneX" : price=91900;
		              System.out.println("Price of "+ mobModel+" is : "+price); break;
		
		case "iphoneXR" : price=42999;
		              System.out.println("Price of "+ mobModel+" is : "+price); break;
		
		case "iphone12Pro": price=111555;
		              System.out.println("Price of "+ mobModel+" is : "+price); break;
	
		default: System.out.println("Iphone with this model is unavailable ");}

}
}
