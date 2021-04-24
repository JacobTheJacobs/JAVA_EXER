כתוב תכנית, שקולטת מספרים שלמים למערך חד - ממדי בגודל 15=N . לאחר מכן, התכנית
תסרוק את איברי המערך ותחפש איברים זהים, כאשר מספיקה שלשה של איברים זהים כדי להודיע
"מצאתי" ולסיים את התכנית. במידה ואין, יש להודיע "איברים שונים".
  
package samples

import java.util.Random;
import java.util.Scanner;

public class Q03 {
	
	static Scanner scan = new Scanner(System.in);
	
	//input arr
	public static int[] kelet(){
		int[] t = new int[15];
		for (int i =0 ; i< t.length ; i++){
			System.out.println("enter num");
			t[i]=scan.nextInt();
		}
		return t;
	}
	
	
	//find duplicates
	public static void duplicates(int[] a){
		int currentVal=0;
		int counter=0;
		boolean found=false;

		//loop over the array
		while(currentVal<a.length) {
			//loop from the second number
			for (int i = currentVal+1 ; i< a.length ; i++){
				//if the number appears in the array
				if(a[i]==a[currentVal]) {
					//raise counter
					counter++;
					//check if 3 numbers were found
					if(counter==3) {
						System.out.println();
						System.out.println("Found 3 same numbers");
						found=true;
						break;
					}
				}
			}
			//check the second number
			currentVal++;
		}
		//check if nothing was found
		if(!found) {
			System.out.println();
			System.out.println("Nothing was found");
		}	
	}

	
	
	
	
	public static void main(String []args){
		
		System.out.println("enter 15 numbers");
		
		//init array
		int[] a = kelet();
		
		//find 3 same numbers
		duplicates(a);
		

	}

}
		
/*
 
enter 15 numbers
enter num
1
enter num
2
enter num
3
enter num
4
enter num
5
enter num
6
enter num
7
enter num
7
enter num
8
enter num
9
enter num
10
enter num
12
enter num
7
enter num
13
enter num
14

Found 3 same numbers

 * */




-------------------------------------------------------------------------------------------------------
  
  
  כתוב תכנית שמגרילה 20 מספרים בינאריים )0-1.)
חשב כמה סדרות רצופות של אחדים הוגרלו בכל אורך  
  דוגמא: הוגרלו המספרים 11010111010101111011 , כלומר נקלטו 3 סדרות של אחד בודד, 2
סדרות של שני אחדים, 1 סדרה של 3 אחדים ו- 1 סדרה של 4 אחדים


import java.util.Random;
import java.util.Scanner;

public class Q04{
	
	
	static Random rnd= new Random() ;
	static Scanner scan = new Scanner(System.in);

	
	//init random array size of 20
	public static int [] build_random_arr(){
		int [] t = new int [20] ;
		//set numbers 1 or 0
		for (int i=0 ; i<t.length; i++){	
			t[i]= rnd.nextInt(1-0+1);
			System.out.print(t[i]);
		}
		return t ;
	}
	


	public static void count_groups(int[] arr){
		//count
		int count=0;
		//index for t array
		int Tcount=0;
		//to store the apperences
		int [] t = new int [10];
		
		for (int i=0 ; i<arr.length; i++){	
			
			//loop until last digit
			while(arr[i]==1 && i<arr.length-1) {
				//increment
				count++;
				//increment i
				i++;
				
			}
			//check for the last digit if 1
			if(i==arr.length-1) {
				if(arr[i]==1) {
					count++;
				}
			}
			//if found 1 put it in array
			if(count>0) {
				t[Tcount]=count;
				Tcount++;
			}

			//reset count
			if(arr[i]==0) {
				count=0;
			}
		}
		//print the array
		print_arr(t);
		
	}
	
	
	//print the arr
	public static void print_arr(int [] t){
		//order the elements asc
		for (int i = 0; i < t.length; i++) {
		    for (int j = 0; j < t.length; j++) {
		        if (t[i] < t[j]) {
		            int temp = t[i];
		            t[i] = t[j];
		            t[j] = temp;
		        }
		    }
		}
		
		int count=0;
		

		//get the duplicates
		for ( int currentNum = 0 ; currentNum < t.length-1; currentNum++) {

		    for (int i = currentNum+1; currentNum < t.length; i++) {

		    	//get input witout zeros
		    	if(t[currentNum]>0) {
		    		//count the sequnce
		    		count++;
		    		//if numbers are diffrent print the squel
		    		if(t[currentNum]!=t[i]) {
		    			System.out.println("Group of : "+t[currentNum]+" was found "+count+" times");
		    			count=0;
		    		}
		    		//check if the last int is diffrent
		    		if(i+1==t.length) {
		    			count++;
		    			System.out.println("Group of : "+t[i]+" was found "+count+" times");	
		    		}
		    	}
		    	//stop the second loop
		    	break;
		    }
			
		
		}
	}
	
	
	public static void main(String[] args) {
		
		//create random array
		int[] arr=build_random_arr();
		
		System.out.println();
		System.out.println();
		//count all the groups in the array
		count_groups(arr);
		
	}

	

}
		

/*
 * 
 1
0
1
1
1
1
1
1
0
0
1
0
0
0
0
0
0
0
0
1

Group of : 1 was found 3 times
Group of : 6 was found 1 times

 * */

 -----------------------------------------------------------------------------------------------------------------------------------
   בלהקת המחול 60 רקדנים שגילם בתחום 50-17 .
עליך לכתוב תוכנית שהקלט שלה הוא גילאי הרקדנים והפלט שלה:
א. הגיל בו יש הכי מעט רקדנים.
ב. גילו של הרקדן המבוגר ביותר
ג. מספר הרקדנים המבוגרים , כאשר רקדן מבוגר מוגדר כרקדן שגילו גבוה לפחות
ב - 3 שנים מהגיל הממוצע.
  
  package samples;

import java.util.Random;
import java.util.Scanner;

public class Q05{
	
	static Random rnd= new Random() ;
	static Scanner scan = new Scanner(System.in);

	
	//init new array of dancers random TESTING
	public static int [] build_random_dancers(){
		int [] t = new int [60] ;
		for (int i=0 ; i<t.length; i++){
			t[i]= rnd.nextInt(50-17+1)+17;
		}
		return t ;
	}
	
	//init new array of dancers
		public static int[] build_kelet_dancers(){
			int[] t = new int[60];
			for (int i =0 ; i< t.length ; i++){
				System.out.println("enter num");
				t[i]=scan.nextInt();
			}
			return t;
		}
		


	//get the least dancing age in the group
	public static int[] least_dancig_age(int [] dancers){

		//init new array
		int [] age = new int [dancers.length];  
		//set counted on value we been on
        int counted = -1;  
     
        for(int i = 0; i < dancers.length; i++){  
        	//init count
            int count = 1;  
            
            for(int j = i+1; j < dancers.length; j++){
            	//check if numbers are equal
                if(dancers[i] == dancers[j]){  
                    count++;  
                    // set number as counted 
                    age[j] = counted;  
                }  
            }  
            //check if already counted that number
            if(age[i] != counted)  
            	age[i] = count;  
        }  
        
        //print
        for(int i = 0; i < age.length; i++){  
        	//number of ages that appears once 
            if(age[i]<=1 && age[i]>-1) {
                //put in the array of age
                age[i]=dancers[i];
            }else {
            	//if not put -1 instead
            	age[i]=-1;
            }
        }
    
      return age;
	}
	
	//getting dancers beyoud avg age
	public static int get_oldests_dancers(int [] dancers){
		int avg =0;
		int count =0;
		//get avg
		for (int i=0 ; i<dancers.length; i++){
			avg+=dancers[i];
		}
		avg/=dancers.length;
		
		//get the dancer beyond avg
		for (int i=0 ; i<dancers.length; i++){
			if(dancers[i]>=avg+3) {
				count++;
			}
		}
		return count;
	}
	

	//finding the oldest dancer
	public static int get_oldest_dancer(int [] dancers){
		int age =0;
		for (int i=0 ; i<dancers.length; i++){
			//get the max number
			if(age<dancers[i]) {
				age=dancers[i];
			}
		}
		return age;
	}
	
	
	

	//helping method to print the ages of dancers that are less the other dancers
	public static void print(int [] dancers){

		for (int i=0 ; i<dancers.length; i++){
			 if(dancers[i]>-1) {
	                //put in the array of age
					System.out.println("The leasts dancer are age: "+dancers[i]);
	           }
		  }
	}
	

	
	public static void main(String[] args) {
		

		//int [] random_dancers = build_random_dancers();
		
		System.out.println("Please input dancers");
		int [] kelet_dancers = build_kelet_dancers();

		int[] least_age_dancers =least_dancig_age(kelet_dancers);
		
		print(least_age_dancers);
		
		System.out.println();
		
		System.out.println("The oldest dancer is age of: " + get_oldest_dancer(kelet_dancers));
		
		System.out.println();
		
		System.out.println("The number of oldest dancers beoynd avg age is: " + get_oldests_dancers(kelet_dancers));
	
	}

}
		

 /*
  * 
The leasts dancer are age: 44
The leasts dancer are age: 17
The leasts dancer are age: 34
The leasts dancer are age: 30
The leasts dancer are age: 49
The leasts dancer are age: 25
The leasts dancer are age: 39
The leasts dancer are age: 41
The leasts dancer are age: 19

The oldest dancer is age of: 50

The number of oldest dancers beoynd avg age is: 27

  * 
  * */
 
