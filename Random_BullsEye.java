public static void main(String []args){
		
		Scanner scan = new Scanner(System.in);
		//generate number between 1000 and 9999
		Random rand = new Random();
		int low = 1000;
		int high = 9999;
		int randomNumber = rand.nextInt(high-low) + low;
		//input number
		int guessedNumber;
		//count the results
		int countBullseye=0;
		int countHit=0;
		//count the number of tryies
		int NumberOfTryies =10;
		
		//to see what computer has generated
		System.out.println(randomNumber+" this is the secret number shhhhhhh");
		System.out.println();
		System.out.println("#####################################");
		System.out.println();
		
		//game loop
		for(int z=1; z <= NumberOfTryies;z++) {
			
			//input numbers loop 4 digits
			for(int i=1; i<=4;i++) {
				//input number
				System.out.println("Input the "+i+" number: "  );
				guessedNumber = scan.nextInt();
				//check input is valid
				if(guessedNumber>=0 && guessedNumber<=9) {
					//reassign the value
					int tempRandom=randomNumber;
					//loop over the random digits
					for (int j=4; tempRandom> 0; j--) {
						//check if guessed number equals one of the digit from random
						if(guessedNumber==tempRandom % 10) {
							//check if the input digit and temp random are in same place
							if(i==j) {
								countBullseye++;
							}else {
								countHit++;
							}
						}
						//divide to get next number
						tempRandom = tempRandom / 10;
					}
					
				}else {
					//if input incorrect
					System.out.println("Please re-enter the number");
					//deacrease
					i--;
				}
		
			}
			//print results
			System.out.println("Youre guess had");
			System.out.println("---------------------------------------");
			System.out.println("Number of BullsEyes = " + countBullseye);
			System.out.println("Number of Hits = " + countHit);
			System.out.println("---------------------------------------");
			//check the number of guesses
			if(countBullseye==4) {
				System.out.println("Congrats you have guessed the whole number correctly = "+ randomNumber);
				break;
			}else if(countBullseye<=4 && countBullseye>=1) {
				System.out.println("Congrats you have guessed "+countBullseye+" number correctly from the random number= "+ randomNumber);
				System.out.println("Keep Gueesing you still have "+(NumberOfTryies-z) );
				System.out.println();
			}else {
				System.out.println("Sorry you didnot guessed the number better luck next time");
				System.out.println("Keep Gueesing you still have "+(NumberOfTryies-z) );
				System.out.println();
			}
			//re init
			countBullseye=0;
			countHit=0;
		}
	
		//end program
		System.out.println();
		System.out.println("#####################################");
		System.out.println("Program ended");
		
		
	}


		
/*
 * 
8916 this is the secret number shhhhhhh

#####################################

Input the 1 number: 
8
Input the 2 number: 
4
Input the 3 number: 
5
Input the 4 number: 
1
Youre guess had
---------------------------------------
Number of BullsEyes = 1
Number of Hits = 1
---------------------------------------
Congrats you have guessed 1 number correctly from the random number= 8916
Keep Gueesing you still have 9

Input the 1 number: 
8
Input the 2 number: 
9
Input the 3 number: 
1
Input the 4 number: 
5
Youre guess had
---------------------------------------
Number of BullsEyes = 3
Number of Hits = 0
---------------------------------------
Congrats you have guessed 3 number correctly from the random number= 8916
Keep Gueesing you still have 8

Input the 1 number: 
89
Please re-enter the number
Input the 1 number: 
8
Input the 2 number: 
9
Input the 3 number: 
1
Input the 4 number: 
6
Youre guess had
---------------------------------------
Number of BullsEyes = 4
Number of Hits = 0
---------------------------------------
Congrats you have guessed the whole number correctly = 8916

#####################################
Program ended

*/
