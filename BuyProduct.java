package com.xworkz.controlstatements;

public class BuyProduct {

	public static void main(String[] args)
	{
		
		short yearOfManufactured=2017;
		short price=3000;
		
		if(yearOfManufactured>=2019 && price<=3000) 
		{
			System.out.println("Continue Shopping");
		}
		else 
		{
     		System.out.println("Shopping denied");
   	    }
    }
}