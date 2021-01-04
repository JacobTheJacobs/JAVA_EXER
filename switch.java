public class Targil2 {
	public static void main(String []args){

		Scanner scan = new Scanner(System.in);
		
		//because one is not prime start with two
		int index = 2;
	    boolean flag = false;
	    
	    //scan next
	    int num = scan.nextInt();
	    
	    //special case for one is not prime
	    if(num==1)
	    	flag=true;
	    
	    //check every previous number
	    while (index < num  && flag == false) {
	    	
	      // check if not prime number
	      if (num % index == 0) {
	    	  
	    	//end loop
	        flag = true;

	      }
	      //increment
	      ++index;
	    }
	    
	    if (flag)
	    	System.out.println(num + " is not a prime number");
	    else
	    	System.out.println(num + " is a prime number");
	      
	  }
	}
		
/*
 * Output
-----------------------------
 * 
 * 
83
83 is a prime number

13
13 is a prime number

55
55 is not a prime number

1
1 is not a prime number


*
*/



public class Targil3 {
	public static void main (String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		int itemIndex = 1,productsBought=0,totalRevenue=0;
	    double price,avg=0,max=0,maxId=0,biggerThen100=0,between60and50=0;
	    boolean itemPurchased = false;
	    
	    while (itemIndex <= 20) {
	    	//input
	    	price = scan.nextDouble();
	    	
	    	//increment
	    	++itemIndex;
	    	
	    	//1.--- get true or false randomly
	    	itemPurchased= Math.random()<0.5;
	    	
	    	//count the purchased items
	    	 if(itemPurchased) {
	    		 productsBought++;
	    		 totalRevenue+=price;
	    	 } 
	    	 
	    	//2.--- average price of products
	    	avg+=price;
	    	
	    	//3.--- the most expensive item
	    	if(price>max) {
	    		max=price;
	    		maxId=itemIndex;
	    	}
	    	
	    	//4.--- product price higher then 100 $
	    	if(price>100) {
	    		biggerThen100++;
	    	}
	    	
	    	//5.--- product bought price between 50 $ to 60 $
	    	if(price>=50 && price <=60) {
	    		between60and50++;
	    	}
	    	
	    		
	    }
	    //1.---
	    System.out.println("The total of products purchased = "+ productsBought + " total revenue = "+ totalRevenue);
	    //2.---
	    System.out.println("The average price is = "+ (avg/20));
	    //3.---
	    System.out.println("The most expensive item is number= "+ (int)(maxId-1)+" price of = "+max);
	    //4.---
	    System.out.println("The items that cost more then 100 $  = "+ (int)biggerThen100);
	    //5.---
	    System.out.println("The products bought price between 50 $ to 60 $  = "+ (int)between60and50);
	  }
	}

		
/*
 * Output
-----------------------------
 * 
 * 
100
50
200
1200
65


The total of products purchased = 2 total revenue = 1400
The average price is = 80.75
The most expensive item is = 4 price of = 1200.0
The items that cost more then 100 $  = 2
The products bought price between 50 $ to 60 $  = 1


*
*/



public class Targil4 {
	public static void main (String[] args) {
		

		Scanner scan = new Scanner(System.in);
		int index = 1,difference=0,maxIndex=0,numOfPairs=0,maxDifference=0;
	    int a,b=0;
	    
	    while (index <= 20) {
	    	
	    	//temporary variable to hold difference
	    	int tempIndex=index;
	    	
	    	//get the input
	    	a = scan.nextInt();
	    	b = scan.nextInt();

	    	   //check if first input bigger the second
	    		if(a>b) {
		    		difference=(a-b);//get the difference
		    		System.out.println(a + " " + difference);
		    		maxIndex=index;//get the index	
		    		
		    	//check if input equals
		    	}else if(a==b) {
		    		numOfPairs++;
		    		
		    	//check if second input bigger the first	
		    	}else {
		    		difference=(b-a);//get the difference
		    		System.out.println(b + " " + difference);
		    		maxIndex=index;//get the index
		    		   		
		    	}
	    		//compare the difference
	    		if(maxDifference<difference) {
	    			maxDifference=difference;
	    		}

	    	
	    	//increment	
	    	++index;
	    	
	    }
	    
	   System.out.println("There is "+numOfPairs+" pairs");
	   System.out.println("The maximum diffrence is="+maxDifference+" index of = "+(maxIndex-1));
	  }
	}

		
/*
 * Output
-----------------------------
 * 
 * 
87
214
214 127
77
77
236
71
236 165
12
3
12 9
There is 1 pairs
The maximum diffrence is=165 index of = 3


*
*/
