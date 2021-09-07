package com.xworkz.controlstatements;

public class carInfo {

	public static void main(String[] args) {
        String carName="FORD";
        switch(carName) {
        case "KIA": System.out.println("Name of the model is: SONET HTK Plus 1.2 ");
        	        System.out.println("price of the car is : 1051000 ");
        	        System.out.println("engine : 1197 cc ");
        	        System.out.println("mileage is : 18.4 kmpl ");break;
        	        
        case "honda": System.out.println("Name of the model is: HONDA CITY ");
                      System.out.println("price of the car is : 1116000 ");
                      System.out.println("engine : 1498 cc ");
                      System.out.println("mileage is : 18.4  to 24.1 kmpl ");break;
        
        case "Maruti Suzuki": System.out.println("Name of the model is: SWIFT DZIRE ");
               		   System.out.println("price of the car is : 920000 ");
               		   System.out.println("engine : 1197 cc ");
               		   System.out.println("mileage is : 24.12 kmpl ");break;
        
        case "Skoda": System.out.println("Name of the model is: SKODA RAPID ");
        			  System.out.println("price of the car is : 1329000 ");
        			  System.out.println("engine : 999 cc ");
        			  System.out.println("mileage is : 16.24 kmpl ");break;
        
        default: System.out.println("Invalid car name or the details of the model is unavailable....!");
        }
	}

}
