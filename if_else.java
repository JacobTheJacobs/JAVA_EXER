package samples;

import java.util.Scanner;

public class Targil03 {
	public static void main (String[] args)
    { 
		Scanner input = new Scanner(System.in);
		double extraAboradCost=7,finalPrice=0,packageWeight;
		char destinationLetter;

		System.out.println ("ENTER DESTINATION NUMBER : ");
		destinationLetter = input.next().charAt(0);
		
		//check the ascii if correct letter
		if (destinationLetter >= 65 && destinationLetter <= 90)
			//check if destination Israel
			if(destinationLetter==73)
				extraAboradCost=0;
			else
				finalPrice+=7;
		else
			//check the ascii if correct letter but small
			if(destinationLetter >= 97 && destinationLetter <= 122)
				System.out.println("please enter the letter in big numbers");
			else
				System.out.println("not correct value, please rerun the program");
		
		//second input
		System.out.println ("ENTER PACKAGE WEIGHT : ");
		packageWeight= input.nextDouble();
		
		//check if weight less then zero
		if(packageWeight<=0)
			System.out.println("please enter correct value for weight");
		
		
		//get the number after decimal
		double numberAfterPoint = packageWeight - Math.floor(packageWeight);

		
		//calculate the price for shipping
			switch((int)(packageWeight)) {
			  //small package
			  case 0:
			  case 1:
			  case 2:
					finalPrice+=5;
					break;
			//medium  package
			  case 3:
			  case 4:
			  case 5:
				  //check if the weight is bigger then 5 make it large package apply additional costs
				  if(packageWeight>5) {
					  finalPrice+=10;
					  if(numberAfterPoint>0)
						  finalPrice+=packageWeight*0.5;
				  }else
					  // else make it medium
					  finalPrice+=7;
				  break;
			//large  package
			  default:
				  //apply additional costs
					finalPrice+=packageWeight*0.5;
					//add large package cost
					finalPrice+=10;
		}

			System.out.println("The final delivary costs are :"+finalPrice);
     } 
}

/*
 * 
Output
-----------------------------
ENTER DESTINATION NUMBER : 
I
ENTER PACKAGE WEIGHT : 
4.9
The final delivary costs are :7.0

----------------------------------

ENTER DESTINATION NUMBER : 
I
ENTER PACKAGE WEIGHT : 
5
The final delivary costs are :7.0

---------------------------------

ENTER DESTINATION NUMBER : 
I
ENTER PACKAGE WEIGHT : 
5.1
The final delivary costs are :12.55


*/
