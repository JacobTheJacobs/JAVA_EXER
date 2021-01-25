א. כתבו תכנית שקולטת תרגיל חיבור או חיסור של שני מספרים שלמים ומדפיסה את פתרון התרגיל.
המספרים יקלטו תו אחרי תו. בסוף התרגיל יופיע סימן =.
ב. הרחב את התכנית שכתבת בסעיף הקודם כדי שהיא תקלוט תרגיל ארוך שמכיל פעולות חיבור וחיסור
בלבד.
	
public static void main(String[] args)
	{
		
		
	 System.out.println("enter whole number one by one enter enter + when done ");
     Scanner input = new Scanner(System.in); //just copy-and paste this line, you dont have to understand it yet.
 	int func=0,count=0,firstNum=0,secondNum=0,number;
 	boolean finneshed =true,plusSign=false;
 	char charNumber ;


         while(finneshed)
         {

        		charNumber = input.next().charAt(0);
        		
        		//check if correct input 
        		if(charNumber<='9' && charNumber>='0') {
        			//change it to int
            		number=charNumber - '0';
            		
            		if(number==0) {
            			//func+=Math.pow(10, count);//10
            		}else {
            			func+=number*Math.pow(10, count);//2
            		}
            		count++;
        		}

        		
        		//checks if plus char was insert
        		if(charNumber=='+') {
        			plusSign=true;
        		//reverse the input
        			while (func!=0)
        			{
        				//getting wach digit individually
        				 int leftNumber=func % 10;
        				//multiply each digit by its place like 0 then 10 or 100
        	
        				 firstNum = firstNum * 10 + leftNumber;
        				//divede each digit by its place like 0 then 10 or 100
        				 func /= 10;
        				 
        				 count=0;
        				 
        			}
        			
        
        			System.out.println("enter second whole number one by one enter enter = when done ");
        		}
        		
        		//checks if minus char was insert
        		if(charNumber=='-') {
        			plusSign=false;
        			//reverse the input
        			while (func!=0)
        			{
        				//getting wach digit individually
        				 int leftNumber=func % 10;
        				//multiply each digit by its place like 0 then 10 or 100
        				 firstNum = firstNum * 10 + leftNumber;
        				//divede each digit by its place like 0 then 10 or 100
        				 func /= 10;
        				 
        				 count=0;
        		         
        			}
        			
        
        			
        		}
        		//end the program with = sign and print result
        		if(charNumber=='=') {
            		
        			while (func!=0)
        			{
        				//getting wach digit individually
        				 int leftNumber=func % 10;
        				//multiply each digit by its place like 0 then 10 or 100
        	
        				 secondNum = secondNum * 10 + leftNumber;
        				//divede each digit by its place like 0 then 10 or 100
        				 func /= 10;
        		         
        			}
        			
        				//print based on the sign that was entered
        				if(plusSign) {
        					System.out.println(firstNum+" + "+secondNum + " = " +(firstNum+secondNum));
        				}else {
        					System.out.println(firstNum+" - "+secondNum + " = " +(firstNum-secondNum));
        				}
        				
        				finneshed=false;
        		}
            	
         }

	}
}


/*
 * Output
-----------------------------

enter whole number one by one enter enter + when done 
1
0
0
0
2
6
+
enter second whole number one by one enter enter = when done 
1
4
=
100026 + 14 = 100040

*
*/	

כתבו תכנית אשר קולטת מספר לא ידוע של סדרות של מספרים שלמים. כל סדרה מסתיימת באפס וגם
רצף הסדרות מסתיים באפס.
לדוגמא:

1 123 3 4 0 23 34 56 67 0 -1 34 0 0

התכנית תדפיס כמה סדרות נקלטו וכמה מספרים היו בסדרה הארוכה ביותר.
בדוגמא: נקלטו 3 סדרות ובסדרה הארוכה ביותר היו 5 איברים.


public static void main (String[] args) {
		

		Scanner scan = new Scanner(System.in);
		int number=0,countNumbers=0,countSeries=0,maxNumOfNumbers=0;
		boolean flag = true;
				
		//first loop
	    while (flag) {
	    	//second loop
	    	do {
	    		//scan number
	    		number = scan.nextInt();
	    		//count numbers in series
	    		countNumbers++;
	    		//check if series ended
		    	if(number==0) {
		    		//count numbers of series
		    		countSeries++;
		    		System.out.println(maxNumOfNumbers);
		    		//get the largest series
		    		if(maxNumOfNumbers<countNumbers) {
		    			maxNumOfNumbers=countNumbers;
		    		}
		    	}   
	    	}while(number!=0);
	    	//reset the count number
	    	countNumbers=0;
	    	//scan number
	    	number = scan.nextInt();
	    	//count numbers in series
	    	countNumbers++;
	    	//if series ended
	    	if(number==0) {
	    		//raise the flag
	    		flag=false;

	    	}
	    }
	    
	    System.out.println("The number of series was = " +countSeries);
	    System.out.println("The longest series was with  = " +maxNumOfNumbers + " numbers");
	  }
	}

		
/*
 * Output
-----------------------------
 * 
 * 
1
123
3
4
0
0
23
34
56
67
0
5
-1
34
0
5
0
5
The number of series was = 3
The longest series was with  = 5 numbers
*
*/



כתבו תכנית, הקולטת סדרת מספרים שלמים חיוביים, המסתיימת במספר 1.-
על התכנית להדפיס את אורך רצף המספרים הזהים הגדול ביותר בסדרה.
לדוגמא: עבור הסדרה:

1 1 1 2 3 4 2 2 2 2 5 6 7 7 -1

הפלט יהיה 4.


public static void main(String []args){

		Scanner scan = new Scanner(System.in);
		//variables
		int number=0,previousNumber=0,siriesMaxNumbers=0;

		//loop
		for(int i=1; number!=-1; i++ ) {
			
			//scan number
    		number = scan.nextInt();

    		//getting the first number and set it as previous
        
        		//check if the current number same as previous
            	if(number==previousNumber) {
            		//check if number in series is the biggest one
            		if(siriesMaxNumbers<i) {
            			siriesMaxNumbers=i;
                	}
            	//if not current number same as previous
            	}else {
            	  	 //init the number count and 
            		previousNumber=number;
            		//reset previous number
            		i=1;
            		
            	}
        		
        	

		}
		System.out.println();
	    System.out.println("The longest repeating number in the series was = " +siriesMaxNumbers);
	  }
	}
		
/*
 * Output
-----------------------------
 * 
 * 
1
1
1
2
3
4
2
2
2
2
5
6
7
7
-1

The longest series was with  = 4 numbers

*
*/



א. כתבו תכנית שקולטת סדרת ציונים לתלמיד. הנתון הראשון שיופיע בקלט הינו מספר הציונים
שיופיע בהמשך. יש להדפיס:
 ממוצע של כל הציונים.
 כמה מהציונים גבוהים מ- 80.
 מספר הציונים השליליים )מתחת ל 55.)
ב. הרחיבו את התכנית שכתבתם בשאלה הקודמת כדי שהיא תוכל לטפל במספר תלמידים. כאשר
התוכנית תסיים לטפל ולעבד את ציוני התלמיד, תשאל את המשתמש אם ברצונו לקלוט ציונים
של תלמיד נוסף , אם כן תבצע את סידרת הפעולות שוב , אחרת תסיים .


public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	
	//1.
	int grade = 0;
	int avg = 0;
	int over80 = 0;
	int below55 = 0;
	//2.
	boolean NotDone=true;
	char confirmChar;
	
	
	//program loop
	while(NotDone) {
		
		System.out.println("Please enter the number of grades of the student");
		//input grade
		int num = input.nextInt();
		//grades loop
		for(int i=0; i<num;i++) {
			System.out.println("Please input a grade");
			grade = input.nextInt();
			//finnish the program
			avg+=grade;
			if(grade>80) 
				over80++;
			if(grade<55)
				below55++;

		}
		//print values
		System.out.println("The average score = " +avg/num);
		System.out.println("The scores over 80 = " + over80);
		System.out.println("The scores below 55 = " + below55);
		
		//ask if you like to input another student
		System.out.println("Would you like to iput aother student?  Y-Yes / N-No");
		//confirm Yes or no
		confirmChar=input.next().charAt(0);
		//if YES
		if(confirmChar == 'y' || confirmChar == 'Y') {
			//re init values
			 avg = 0;
			 over80 = 0;
			 below55 = 0;
		//if NO
		}else if(confirmChar == 'n' || confirmChar == 'N'){
			//finnish the program
			NotDone=false;
		//if wrong input rerun the failing meassge	
		}else {

			System.out.println("Wrong input hit enter to try again");
			boolean wrongInput=true;
			while(wrongInput) {
				//ask if you like to input another student
				System.out.println("Would you like to iput aother student?  Y-Yes / N-No");
				//confirm Yes or no
				confirmChar=input.next().charAt(0);
				
				if(confirmChar == 'y' || confirmChar == 'Y') {
					//re init values
					 avg = 0;
					 over80 = 0;
					 below55 = 0;
					 wrongInput=false;
				}else if(confirmChar == 'n' || confirmChar == 'N'){
					//finnish the program
					NotDone=false;
					wrongInput=false;
				}else {
					wrongInput=true;
				}
			}
		
		}
		
		
		}

	System.out.println("Program has ended");
	}
}

/*
 * Output
-----------------------------

Please enter the number of grades of the student
2
Please input a grade
100
Please input a grade
100
The average score = 100
The scores over 80 = 2
The scores below 55 = 0
Would you like to iput aother student?  Y-Yes / N-No
h
Wrong input hit enter to try again
Would you like to iput aother student?  Y-Yes / N-No
45
Would you like to iput aother student?  Y-Yes / N-No
T
Would you like to iput aother student?  Y-Yes / N-No
y
Please enter the number of grades of the student
1
Please input a grade
100
The average score = 100
The scores over 80 = 1
The scores below 55 = 0
Would you like to iput aother student?  Y-Yes / N-No
y
Please enter the number of grades of the student
2
Please input a grade
40
Please input a grade
100
The average score = 70
The scores over 80 = 1
The scores below 55 = 1
Would you like to iput aother student?  Y-Yes / N-No
n
Program has ended



*
*/
