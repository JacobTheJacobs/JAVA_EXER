כתבו פונקציה אשר קולטת למערך דו - ממדי מספרים שלמים.
ב. כתבו פונקציה שתקבל מערך דו ממדי של מספרים שלמים. הפונקציה תספור
כמה איברים שליליים ישנם במערך הנתון ותחזיר את התוצאה שחישבה.
ג. כתבו תוכנית שקולטת למערך VEC בעל 4 שורות ו- 3 עמודות מספרים
שלמים. על התוכנית להדפיס את כמות המספרים השליליים בו.
עליכם להשתמש בפונקציות מסעיפים הקודמים.

.2
א. כתבו פונקציה אשר קולטת למערך דו - ממדי מספרים שלמים.
ב. כתבו פונקציה שתקבל מערך דו ממדי של מספרים שלמים. הפונקציה תחליף כל
מספר שלילי במערך באפס.
ג. כתבו תכנית הקולטת מספרים שלמים )חיוביים ושלילים( למערך דו-ממדי בגודל
7 שורות ו- 5 עמודות, מחליפה כל מספר שלילי במערך באפס ומדפיסה את
המערך לאחר שכל המספרים השליליים הוחלפו באפסים.
עליכם להשתמש בפונקציות מסעיפים הקודמים.

3 .המשרד לאיכות הסביבה מדד את רמות זיהום האוויר במשך שנה אחת ב- 50 ישובים
ברחבי המדינה. בכל ישוב נעשו 12 מדידות - מדידה אחת בכל חודש.
כתבו תכנית שתבצע את הפעולות הבאות )כל פעולה בפונקציה נפרדת(
א. תקלוט את הנתונים הנ"ל לתוך מערך דו - ממדי בשם POLL בגודל 12  50.
ב. תקלוט מספר חודש ותדפיס את המדידות שנעשו באותו חודש בכל 50 ישובים, עם
כותרת מתאימה.
ג. תקלוט מספר ישוב ותדפיס את 12 המדידות של אותו ישוב, עם כותרת המתאימה.

.4
כתבו תכנית שקולטת שלושה מערכים חד- ממדיים של תווים בגודל 10 כל אחד ובונה
מהם מערך דו - מימדי המכיל את כולם )לפי שורות(, ז"א שורה ראשונה תכיל מערך
ראשון, שורה שניה תכיל מערך שני וכו' . התוכנית תדפיס את המערכים לפני ואחרי
השינוי. עליך לחלק תוכנית לפונקציות )קלט, בניית מערך דו ממדי, פלט(.
                                                                 
                                                                 
                                                                 
                                                                 
                                                                 
                                                                 
                                                                 
 -----------------------
                                                                 
                                                                 
package samples;

import java.util.Random;
import java.util.Scanner;

public class Strings {

	//---1
	static Scanner scan = new Scanner(System.in);
	static Random ran = new Random();
	
	
	public static int[][] init(int[][] t,int question) {
		
		for(int i=0;i<t.length;i++) {
			for(int j=0;j<t[i].length;j++) {
				int r = 0;
				switch (question) {
				case 1:
					r = ran.nextInt(5+5+1)-5;
					break;
				case 2:
					r = ran.nextInt(10+5+1)-5;
					break;
				case 3:
					r = ran.nextInt(10);
					break;
					
				default:
					break;
				}
				
				t[i][j]=r;
			}
		}
		return t;
	}
	
	//---1
	public static int count_neg(int[][] arr) {
		int c = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]<0) {
					c++;
				}
			}
		}
		System.out.println("Counted: "+c +" negative items");
		return c;
	}
	
	
	//---2
	public static void remove_neg(int[][] arr) {
		
		System.out.println("Old Array:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+",");
				if(arr[i][j]<0) {
					arr[i][j]=0;
				}
			}
			
		}
		System.out.println();
		System.out.println();
		System.out.println("New Array:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+",");
			}
			
		}
	}
	
	
	//---3
	public static void get_measures(int[][] arr,int monthNumber) {
		
			String monthName="";
		
	      switch(monthNumber){
          case 1:
              monthName = "January";
              break;
          case 2:
              monthName = "February";
              break;
          case 3:
              monthName = "March";
              break;
          case 4:
              monthName = "April";
              break;
          case 5:
              monthName = "May";
              break;
          case 6:
              monthName = "June";
              break;
          case 7:
              monthName = "July";
              break;
          case 8:
              monthName = "August";
              break;
          case 9:
              monthName = "September";
              break;
          case 10:
              monthName = "October";
              break;
          case 11:
              monthName = "November";
              break;
          case 12:
              monthName = "December";
              break;
          default:
              monthName = "Invalid month";
              break;
      } 
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("City Number:" + (i+1));
			System.out.print("Measuarments in "+monthName+" were --->  ");
			for(int j=0;j<arr[i].length;j++) {
				if(monthNumber==j) {
					System.out.print(arr[i][j]+" ");
				}
			
			}
			System.out.println();
			System.out.println();
		}
	
	}
	
	
	//---3
	public static void get_measures_for_city(int[][] arr,int cityNumber) {
		

	
		System.out.println("City Number:" + cityNumber);
		System.out.print("Measuarments for city number"+ cityNumber+"each month was : ");
		System.out.println();
			for(int j=0;j<arr[cityNumber].length;j++) {
				System.out.print(arr[cityNumber][j]+" ");
			}
	
	}
	
	
	
	//---4
	
public static int[] init(int[] t) {
		for(int i=0;i<t.length;i++) {
	
			t[i] = ran.nextInt(10);
			
		}
		return t;
	}
	public static int[][] add_arrs(int[] arr1,int[] arr2,int[] arr3) {
		int[][] t = new int[3][10];
		
		for(int i=0;i<t.length;i++) {
			System.out.println("Array No : " + (i+1));
			System.out.println();
			for(int j=0;j<t[i].length;j++) {
				
				if(i==0) {
					t[i][j]=arr1[j];
					System.out.print(t[i][j]+", ");
				}else if(i==1) {
					t[i][j]=arr2[j];
					System.out.print(t[i][j]+", ");
				}else {
					t[i][j]=arr3[j];
					System.out.print(t[i][j]+", ");
				}
				
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
		return t;
	}

		
	
  public static void main(String[] args) {
	  
	  //---1
	  int[][] arr = new int[3][4];
	  int[][] ran_arr = init(arr,1);
	  
	  System.out.println();
	  count_neg(ran_arr);
	  
	  System.out.println();
	  System.out.println();
	  System.out.println();
	  System.out.println();
	  System.out.println();
	  //---2

	  int[][] arr2 = new int[7][5];
	  int[][] ran_arr2 = init(arr2,2);
	  
	  System.out.println();
	  remove_neg(ran_arr2);
 	
	  
	  System.out.println();
	  System.out.println();
	  System.out.println();
	  System.out.println();
	  System.out.println();
	  //---3
	  int[][] arr3 = new int[50][12];
	  int[][] ran_arr3 = init(arr3,3);
	  
	  System.out.println();
	  get_measures_for_city(ran_arr3,7);
	  
	  
	  System.out.println();
	  System.out.println();
	  System.out.println();
	  System.out.println();
	  System.out.println();
	  //---4
	  int[] arr41 = new int[10];
	  int[] arr42 = new int[10];
	  int[] arr43 = new int[10];
	  
	  int[] arr411 = init(arr41);
	  int[] arr421 = init(arr42);
	  int[] arr431 = init(arr43);
	  
	  System.out.println();
	  add_arrs(arr411,arr421,arr431);
	  
  }

}

                                                                 
                                                                 
                                                                 
                                                                 
                                                                 
                                                                 
----------------------------------------------------------------------------
                                                                 
                                                                 
 
Counted: 11 negative items






Old Array:
-3,-5,4,-3,10,2,10,-4,8,7,7,10,-1,4,9,4,10,-5,9,4,9,10,-4,3,7,7,2,1,8,5,-1,3,9,2,1,

New Array:
0,0,4,0,10,2,10,0,8,7,7,10,0,4,9,4,10,0,9,4,9,10,0,3,7,7,2,1,8,5,0,3,9,2,1,





City Number:7
Measuarments for city number7each month was : 
4 2 4 4 8 2 4 4 1 4 6 4 





Array No : 1

4, 2, 9, 6, 8, 4, 9, 4, 3, 1, 


Array No : 2

6, 8, 5, 1, 0, 0, 8, 1, 6, 5, 


Array No : 3

6, 7, 6, 4, 5, 1, 3, 9, 4, 7, 


                                                                
                                                                 
                                                                 
                                                                 
