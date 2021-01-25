package samples;

import java.util.Random;
import java.util.Scanner;

public class Patterns{
	
	
	//  1
	public static void doublePyramidPattern(int n) 
    {  
		int i, j, space = 1;
	
		space = n - 1;
		for (j = 1; j<= n; j++)
		{
		for (i = 1; i<= space; i++)
		{
		System.out.print(" ");
		}
		space--;
		for (i = 1; i <= 2 * j - 1; i++)
		{
		System.out.print("*");
		}
		System.out.println("");
		}
		space = 1;
		for (j = 1; j<= n - 1; j++)
		{
		for (i = 1; i<= space; i++)
		{
		System.out.print(" ");
		}
		space++;
		for (i = 1; i<= 2 * (n - j) - 1; i++)
		{
		System.out.print("*");
		}
		System.out.println("");
		}
    } 
	
	//  2
	public static void pyramidPattern(int n) 
    {  
        for (int i=0; i<n; i++) //outer loop for number of rows(n)
        { 
        	for (int j=n-i; j>1; j--) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
        		for (int j=0; j<=i; j++ ) //inner loop for number of columns
            { 
                System.out.print("* "); //print star
            } 
  
            System.out.println(); //ending line after each row
        } 
    } 
	
	
	
	//  3
	public static void halfPyramidNumbers(int n) 
    {  
		 for (int i= 0; i<= n; i++)
	        {
	            for (int j=1; j<=n-i; j++)
	            {
	                System.out.print(" ");
	            }
	            for (int k=0;k<=i;k++)
	            {
	                System.out.print(k*2);
	            } 
	                System.out.println("");
	        }
		        
	    
    } 
	//  4
	
	public static void halfPyramidNumbersDown(int n) 
    {  
	
		        
	    
    } 
	
	
	//  5
	public static void doublePyramidPatternDown(int n) 
    {  
		for (int i= 0; i<= n-1 ; i++)
        {
            for (int j=0; j <i; j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=n-1; k++) 
            {
            System.out.print("*" + " ");
            } 
            System.out.println("");
            } 
            for (int i= n-1; i>= 0; i--)
        {
            for (int j=0; j< i ;j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=n-1; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
	
	//  6
	public static void PyramidNumbers(int n) 
    {  
		for (int i = 0; i < n; i++) {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
  
    }
	//  7
	public static void HalfPyramidNumbers(int n) 
    {  
	
  
    }
	
	//8
	public static void halfPyramidNumbersDownOrder(int n) 
    {  
		for (int i= n; i>= 1; i--)
	    {
	    for (int j=n; j>i;j--)
	    {
	    System.out.print(" ");
	    }
	    for (int k=1;k<=i;k++)
	    {
	    System.out.print(k);
	    }
	    System.out.println("");
	    }
	  
    }

	public static void main(String []args){
		
		  int n = 5; 
		  
		  //doublePyramidPattern(n);   //--OK
		  
	      //pyramidPattern(n);   //--OK 
		  
		  //halfPyramidNumbers(n);  //--FAIL
		  
		  //halfPyramidNumbersDown(n); //--FAIL
		  
		  //doublePyramidPatternDown(n);   //--OK
		  
		  //PyramidNumbers(n); //--FAIL
		  
		  //HalfPyramidNumbers(n); //--FAIL
		  
		  //halfPyramidNumbersDownOrder(n);  //--OK
	      
		
	}

}
		




