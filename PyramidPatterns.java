package tragil2;

import java.util.Scanner;

public class demo1 {
	
	
	//-------------------------------------   1
	public static void diamond(int n) {
		//draw triangle
		//draw number of rows go down each row
		for(int row =0; row <= n ; row++) {
			
			System.out.println();
			//draw number of spaces increase each row
			for(int space = n-row; space!=0; space--) {
				
				System.out.print(" ");
			}
			//draw number of stars increase each row
			for(int stars =0 ; stars <= row*2; stars++) {
				System.out.print("*");	
			}
		
		}
		////draw triangle upside down
		for(int row =n-1; row >= 0 ; row--) {
			System.out.println();
			//draw number of spaces deacrease each row
			for(int space = n-row; space!=0; space--) {
				
				System.out.print(" ");
			}
			//draw number of stars increase each row
			for(int stars =0 ; stars <= row*2; stars++) {
				System.out.print("*");	
			}
		}
		
	}
	
	//-------------------------------------   2
	public static void triangle(int n) {
		//draw triangle
		//draw number of rows go down each row
		for(int row =0; row <= n ; row++) {
			
			System.out.println();
			//draw number of spaces deacrease each row
			for(int space = n-row; space!=0; space--) {
				
				System.out.print(" ");
			}
			//draw number of stars increase each row
			for(int stars =0 ; stars <= row*2; stars++) {
				System.out.print("*");	
			}
		
		}

		
	}
	
	
	//-------------------------------------   3
	public static void stairs(int n) {
		//draw the rows each loop go one down
		for(int row =1; row <= n ; row++) {
			System.out.println();
			
			//draw the spaces each line decrease by one
			for(int space = n-row; space!=0; space--) {
				System.out.print("    ");
			}
			//draw the numbers each loop draw increasing in numbers
				for(int number =1; row>=number; number++) {
					System.out.print("   "+number*2);
				}
			}	
	}
	
	//-------------------------------------   4
	public static void upsideStairs(int n) {
		//draw the rows each loop go one down
		for(int row =1; row <= n ; row++) {
			System.out.println();
			
			//draw the spaces each line decrease by one
			for(int space = 1; space<row; space++) {
				System.out.print("  ");
			}
			//draw the numbers each loop draw increasing in numbers
				for(int number = 0; n-row>=number; number++) {
					System.out.print(" "+row);
				}
			}	
	}
	
	//-------------------------------------   5
	public static void oppositeDiamond(int n) {
		////draw triangle upside down
		//draw rows each row decrease by one
		for(int row =n-1; row >= 0 ; row--) {
			System.out.println();
			//draw space each row decrease by one
			for(int space = n-row; space!=0; space--) {
				System.out.print(" ");
				}
				//draw the number of stars
				for(int stars =0 ; stars <= row*2; stars++) {
					System.out.print("*");	
				}
			}
		/////draw triangle
		for(int row =1; row < n ; row++) {	
			System.out.println();
			//draw space each row increase by one
			for(int space = n-row; space!=0; space--) {	
				System.out.print(" ");
				}
				//draw the number of stars
				for(int stars =0 ; stars <= row*2; stars++) {
					System.out.print("*");	
				}
			}	
		}
	
	//-------------------------------------   6
	public static void triangleNumbers(int n) {
		//draw row each loop
		for(int row =1; row <= n ; row++) {
			System.out.println();
			//draw space decrease by 1 by row
			for(int space = n-row; space!=0; space--) {	
				System.out.print("  ");
			}
			for(int number =1 ; number < row*2; number++) {
				//check if we got the same numbers as number of row if yes decrease numbers
				if(number>row) {
					System.out.print(" "+row * (row - number + row) / row);
				}else {
					System.out.print(" "+number);
				}
			}
		}	
	}
	
	//-------------------------------------   7
	public static void stairsFibonacci(int n) {
		//draw the rows each loop go one down
		for(int row =1; row <= n ; row++) {
			System.out.println();
			
			//draw the spaces each line decrease by one
			for(int space = n-row; space!=0; space--) {
				System.out.print("    ");
			}
			//draw the numbers each loop draw increasing in numbers
				for(int number =1; row>=number; number++) {
					if(number==1) {
						System.out.print(number);
					}else {
						//if statement just for better looking output
						if(number*row-row+1>=10) {
							System.out.print("  "+(number*row-row+1)+"");	
						}else {
							System.out.print("   "+(number*row-row+1)+"");
						}
					
					}
					
				}
			}	
	}
	
	//-------------------------------------   8
	public static void upsideStairsNumbers(int n) {
		//draw the rows each loop go one down
		for(int row =1; row <= n ; row++) {
			System.out.println();
			
			//draw the spaces each line decrease by one
			for(int space = 1; space<row; space++) {
				System.out.print("  ");
			}
			//draw the numbers each loop draw increasing in numbers
				for(int number = 1; n+1-row>=number; number++) {
					System.out.print(" "+number);
				}
			}	
	}

	
	public static void main(String[]args) {
		//1.
		diamond(5);
		System.out.println();
		System.out.println();
		System.out.println();
		//2.
		triangle(5);
		System.out.println();
		System.out.println();
		System.out.println();
		//3.
		stairs(5);
		System.out.println();
		System.out.println();
		System.out.println();
		//4.
		upsideStairs(5);
		System.out.println();
		System.out.println();
		System.out.println();
		//5.
		oppositeDiamond(5);
		System.out.println();
		System.out.println();
		System.out.println();
		//6.
		triangleNumbers(5);
		System.out.println();
		System.out.println();
		System.out.println();
		//7.
		stairsFibonacci(5);
		System.out.println();
		System.out.println();
		System.out.println();
		//8.
		upsideStairsNumbers(5);
	}
	
}

//OUTPUT
//----------------------
/*
 * 
 * 
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *



     *
    ***
   *****
  *******
 *********
***********



                   2
               2   4
           2   4   6
       2   4   6   8
   2   4   6   8   10



 1 1 1 1 1
   2 2 2 2
     3 3 3
       4 4
         5



 *********
  *******
   *****
    ***
     *
    ***
   *****
  *******
 *********



         1
       1 2 1
     1 2 3 2 1
   1 2 3 4 3 2 1
 1 2 3 4 5 4 3 2 1



                1
            1   3
        1   4   7
    1   5   9  13
1   6  11  16  21



 1 2 3 4 5
   1 2 3 4
     1 2 3
       1 2
         1
 * */
