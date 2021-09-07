package com.xworkz.controlstatements;

public class StateRoadTax {

	public static void main(String[] args) {
		String stateName="Goa";
				
		if(stateName=="Karnataka")
		{ 
		System.out.println("Road Tax in "+stateName+" is 3000");
		} else if(stateName=="Goa")
		{ 
		System.out.println("Road Tax in "+stateName+" is 5000");
		} else if(stateName=="Tamilnadu")
		{ 
		System.out.println("Road Tax in "+stateName+" is 4000");
		}
		else
		System.out.println("Invalid input or state name is not the list");
		
	}

}
