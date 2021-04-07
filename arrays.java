1 .כתבו תוכנית השומרת במערך של שלמים את כל המספרים מ-25 עד 35 לפי הסדר. יש לכתוב
פעולה שמקבלת את המערך ומדפיסה את כל איברי המערך מההתחלה לסוף ומהסוף להתחלה.
  
  package samples;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class Q01 {

	 
	 //insert number from 25 to 35
		public static int [] newArray (){
			
			int[] array = new int[11];
			
			int count = 25;
			for (int i=0 ; i<11;i++ ){
				
				array[i]= count;
				count++;
			}
			return array ;
		}
		
		//print in ascending order
		public static void printArrayASC(int[] array){
			

			for (int i=0 ; i<array.length;i++ ){
				
				System.out.println(array[i]);
			}
			
		}
		
		//print in descending order
		public static void printArrayDEC(int[] array){
			

			for (int i=array.length-1; i>=0 ;i-- ){
				
				System.out.println(array[i]);
			}
			
		}
		
		
  public static void main(String[] args) {
  
	  //init array
	  
	  
	  //insert number from 25 to 35
	  int [] array=newArray();
	  
	  //print in ascending order
	  printArrayASC(array);

	  System.out.println();
	  
	//print in descending order
	  printArrayDEC(array);
	

	  
	  
  }

}

/*
25
26
27
28
29
30
31
32
33
34
35

35
34
33
32
31
30
29
28
27
26
25
*/


2 .כתוב תכנית, הקולטת למערך בן 10 תאים, מספרים שלמים בלבד. התכנית תדפיס את כל המספרים,
שנמצאים במקומות הזוגיים שהם אי-זוגיים.
  
  package samples;

import java.util.Scanner;

public class Q02{
	
	static Scanner input=new Scanner (System.in);
	
	public static int []scan(){
		System.out.println("Please enter ten integers to array");
		//init array
		int [] arr = new int [10];
		//insert numbers to array
		for (int i=0 ; i<arr.length ;i++ ){
			
			arr[i]= input.nextInt();
		}
		return arr ;
	}
	
	
	public static void printArr (int[] arr){

		System.out.println("The array contains on even index uneven numbers");
		for (int i=0 ; i<arr.length ;i++ ){
			//search for even indexes
			if(i % 2 == 0 && i !=0 ) {
				//search for uneven numbers
				if(arr[i] % 2 !=0) {
					System.out.println(arr[i]);
				}
					
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		//test array
		//int[] arr= {1,2,3,4,5,5,7,7,9,10};
		
		//init array
		int [] arr = scan();
		
		System.out.println();
		
		//print array
		printArr(arr);
		
	}

	

}
		




/*
 * 
 * Please enter ten integers to array
1
2
3
4
5
5
7
7
9
10

3
5
7
9

*
*/



3 .יש לכתוב תוכנית שקולטת את מספר תלמידי הכתה ויוצרת מערך ובו ציוני התלמידים.
יש לכתוב את הפעולות הבאות:
א. פעולה שמקבלת את המערך ומחזירה את ממוצע הציונים.
ב. פעולה שמקבלת את המערך ואת ממוצע הציונים ומחזירה כמה תלמידים קיבלו ב 10 נקודות יותר
מהממוצע.
ג. פעולה שמקבלת את המערך ומחזירה את הציון המקסימלי שהתקבל.
ד. פעולה שמקבלת את המערך ואת הציון המקסימלי ומדפיסה את כל מספרי התלמידים שקיבלו ציון זה.
) מספרו של התלמיד הראשון הוא 1.)
ה. פעולה שתקבל את המערך ותחזיר את הציון השני בגודלו. )יש להעזר בפעולה שבסעיף ג'(.
  
  
  package samples;

import java.util.Random;
import java.util.Scanner;

public class Q03 {
	
	
	static Scanner input=new Scanner (System.in);
	
	static Random random = new Random();
	
	
	public static int[] scan(){
		int low = 10;
		int high = 100;
		
		System.out.println("Please enter the number of students in class");
		int n = input.nextInt();
		int [] arr = new int [n];

		//insert numbers to array
		for (int i=0 ; i<arr.length ;i++ ){
			int result = random.nextInt(high-low) + low;
			arr[i]= result;
			System.out.println(result);
		}
		return arr ;
	}
	
	
	public static int getAvg(int [] arr){
		int avg =0;
		for( int i=0 ; i<arr.length ;i++ ) {
			avg+=arr[i];
		}
			avg=avg/arr.length;
			return avg;
	}
	
	
	public static int numOfStudentAboveAvg(int [] arr,int avg){
		int count =0;
		for( int i=0 ; i<arr.length ;i++ ) {
			if(arr[i]>=avg+10) {
				count++;
			}
		}
			return count;
	}
	
	
	public static int maxGrade(int [] arr){
		int max =0;
		for( int i=0 ; i<arr.length ;i++ ) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
			
			return max;
	}
	
	public static void maxGradeCountStudents(int [] arr,int max){
		int studentIndex = 0;
		for( int i=0 ; i<arr.length ;i++ ) {
			if(max==arr[i]) {
				System.out.println(i+1);
			}
		}
			
		
	}
	
	public static int secondMax(int [] arr){
		int max = maxGrade(arr);
		int secondMax =0;
		for( int i=0 ; i<arr.length ;i++ ) {
		
			if(arr[i]>=secondMax && arr[i]<max) {
				secondMax=arr[i];
			}
		}
			
			return secondMax;
	}

	public static void main(String []args){
		
		int [] arr = scan();
		System.out.println();
		
		System.out.println("The average score is");
		System.out.println(getAvg(arr));
		int avg =getAvg(arr);
		System.out.println();
		
		System.out.println("The Number of student above avg");
		System.out.println(numOfStudentAboveAvg(arr,avg));
		System.out.println();
		
		System.out.println("The max grade of class");
		System.out.println(maxGrade(arr));
		int max =maxGrade(arr);
		System.out.println();
		
		System.out.println("The index of Students that got above average ");
		maxGradeCountStudents(arr,max);
		System.out.println();
		
		System.out.println("The second max grade of class");
		System.out.println(secondMax(arr));

	}

}
		
/*
 * Please enter the number of students in class
3
42
20
57

The average score is
39

The Number of student above avg
1

The max grade of class
57

The number of Student that got above avg 
3

The second max grade of class
42

 * */




4 .יש לכתוב תוכנית אשר יוצרת מערך של שלמים ריק בגודל 12.
א. יש לכתוב פעולה אשר מקבלת מערך ריק. על הפעולה לקלוט מספר שלם כלשהו ולאחסנו
במקום הראשון במערך. לשאר איברי המערך יש להכניס מספרים לפי הכלל הבא: כל מספר
במערך יהיה גדול פי 2 מהמספר שקדם לו.
ב. יש לכתוב פעולה שמקבלת את המערך ומדפיסה את איברי המערך.
  
  
  package samples;

import java.util.Scanner;

public class Q04{
	
	static Scanner input=new Scanner (System.in);
	
	public static int [] scan(int [] arr){
		System.out.println("Please enter an first integer the other will be multiplyed by two");
		
		//insert numbers to array
		arr[0]= input.nextInt();
		int num =0;
		
		for (int i=1 ; i<arr.length ;i++ ){
			
			arr[i]=arr[num]*2;
			
			num++;
		}
		return arr ;
	}
	
	
	public static void printArr (int[] arr){

		for (int i=0 ; i<arr.length ;i++ ){
			//print numbers
			System.out.println(arr[i]);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		//init array
		int[] arr = new int [12];
		
		//init array
		scan(arr);
		
		System.out.println();
		
		//print array
		printArr(arr);
		
	}

	

}
		




/*
 * 
 *Please enter an first integer
2

2
4
8
16
32
64
128
256
512
1024
2048
4096

 
 * */
 
