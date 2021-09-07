package com.xworkz.controlstatements;

public class TaxCalculator {

	public static void main(String[] args) {
		int AnnualIncome=400000;
		double taxAmount;
		
		if(AnnualIncome>=200000)
		{
		  taxAmount=AnnualIncome*0.8/100;
		  System.out.println("The tax amount for "+ AnnualIncome +" is "+taxAmount);
		}
		else
		{
			System.out.println("Not eligible for tax");
		}
	}

}
