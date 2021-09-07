package com.xworkz.controlstatements;

public class GSTCalculator {

	public static void main(String[] args) {
		int price=3000;
		double taxAmount;
		String typeOfIndustry="manufacturer";
		
		if(typeOfIndustry=="Edu") {
		  taxAmount=price*0.5/100;
		  System.out.println("Tax amount is: "+taxAmount); } 
		
		else if(typeOfIndustry=="Sales") {
		  taxAmount=price*0.8/100;
		  System.out.println("Tax amount is: "+taxAmount); }
		
		else if(typeOfIndustry=="Health") {
		  taxAmount=price*0.12/100;
		  System.out.println("Tax amount is: "+taxAmount); }
		
		else if(typeOfIndustry=="manufacturer") {
		  taxAmount=price*0.15/100;
		  System.out.println("Tax amount is: "+taxAmount); }
		
	}

}
