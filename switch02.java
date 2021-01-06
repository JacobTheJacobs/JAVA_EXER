כתבו תוכנית שתדפיס את 20 המספרים הראשונים החל מ- 1 אשר מתחלקים ללא שארית ב- 2 או ב- 3.
public class Targil01 {
	public static void main (String[] args) {
		

		Scanner scan = new Scanner(System.in);
		int index = 1;
				
	    while (index <= 20) {
	    	
	    	if(index%2==0 || index%3==0 || index==1) {
	    		System.out.println(index);
	    	}
	    	//increment	
	    	++index;
	    	
	    }
 
	  }
	}

		
/*
 * Output
-----------------------------
 * 
 * 
1
2
3
4
6
8
9
10
12
14
15
16
18
20

*
*/

כתבו תוכנית שבודקת אם W מופיע בסדרה של 25 תווים שבקלט. אם W מופיע, יודפס המספר המציין
את מיקומו בסדרה. אם W לא מופיע בסדרה תודפס הודעה מתאימה.

public class Targil02 {
	public static void main(String []args){

		Scanner scan = new Scanner(System.in);
		
		int index=1,indexOfChar=0;

		while(index<=25) {
			char word = scan.next().charAt(0);
			//check if char at letter W
			if (word == 'W')
            {
				
				indexOfChar=index;
            }

			++index;
		}
		//check if position was updated
		if(indexOfChar==0) {
			System.out.println("Did not find W");
		}else {
			System.out.println("Found letter at position = "+indexOfChar);
		}
	  }

	}
		
/*
 * Output
-----------------------------
 * 
 * 
G
W
D
.
.
.
.
.

Found letter at position =2


*
*/

כתבו תכנית אשר קולטת מספר שלם n ומספר ממשי x ומוצאת את סכום n האיברים הראשונים בסדרה :

public class Targil03 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int index=0;
		System.out.println("Enter real number");
		double x=scan.nextDouble(),sum=0;
		System.out.println("Enter whole number");
		int n=scan.nextInt();
		boolean flag=true;
		while(flag) {

				if(index<n) {
					sum+=(index+1)*Math.pow(x, index);//1+2x+3x^2+...
					index++;//increment
					
				}else {
					//reached end
					flag=false;
		
				}	
			
		}
		System.out.println(sum);
	  }

	}
		
	

		
/*
 * Output
-----------------------------
 * 
 * 
Enter real number
3
Enter whole number
3
34.0


*
*/

כתבו תכנית הקולטת מספר שלם חיובי בעל מספר ספרות לא ידוע. התכנית תחשב את ההפרש בין
המספר שהתקבל, לבין המספר המתקבל מהיפוך הספרות של המספר המקורי. עבור הקלט 2468 ,יחושב
ההפרש בינו לבין 8642 .ההפרש הינו 6174.

public class Targil05 {

	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	
	System.out.println ("Enter a whole number");
	
	int num = input.nextInt();
	
	int oppositeNumber=0;
	//saving the original num to variable
	int tempNum=num;
	
	while (num != 0)
	{
		//getting wach digit individually
		 int leftNumber=num % 10;
		//multiply each digit by its place like 0 then 10 or 100
		 oppositeNumber = oppositeNumber * 10 + leftNumber;
		//divede each digit by its place like 0 then 10 or 100
         num /= 10;
         
	}
	
	System.out.println("The difference is = "+(oppositeNumber-tempNum)+ " the opposite number is = "+oppositeNumber);
	}


}

/*
 * Output
-----------------------------

Enter a whole number
2468
The difference is = 6174 the opposite number is = 8642

*


א. כתבו תכנית שקולטת תרגיל חיבור או חיסור של שני מספרים שלמים ומדפיסה את פתרון התרגיל.
המספרים יקלטו תו אחרי תו. בסוף התרגיל יופיע סימן =.
ב. הרחב את התכנית שכתבת בסעיף הקודם כדי שהיא תקלוט תרגיל ארוך שמכיל פעולות חיבור וחיסור
בלבד.


public class Targil06 {

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
