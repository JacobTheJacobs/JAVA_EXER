שאלה 1:
א. כתבו פונקציה perimeter המקבלת 3 צלעות של משולש כפרמטרים ומחזירה את היקפו.
ב. כתבו פונקציה area המקבלת 3 צלעות של משולש כפרמטרים ומחזירה את שטחו.
ג. כתבו פונקציה input_check המקבלת כפרמטר 3 מספרים ומחזירה true אם המספרים יכולים
להיות צלעות של משולש , ו- false אחרת.
ד. כתבו פונקציה ראשית אשר קוראת 3 מספרים מהמקלדת, בודקת אם המספרים יכולים להרכיב
משולש. אם כן, מדפיסה את שטחו ואת היקפו.
ה. הוסף לולאה לגוף של main כך שהמשימה תתבצע מספר פעמים עד קליטת השלישייה 0 0 0.



public class Targil01 {

	/*
	1.
	*/
	public static int perimeter(int sideA,int sideB,int sideC) {
		//sum the sides
		return sideA+sideB+sideC;
		
	}
	
	/*
	2.
	*/
	public static int area(int sideA,int sideB,int sideC) {
		//calculate the half perimeter
		int s=perimeter( sideA,sideB ,sideC)/2;
		//calculate the area
		double res = Math.sqrt((s*(s-sideA)*(s-sideB)*(s-sideC)));
		return (int)res;
		
	}
	
	/*
	3.
	*/
	public static boolean input_check(int sideA,int sideB,int sideC) {
		//check sides
		if(sideA <= 0 || sideB <= 0 || sideC <= 0) {
			return false;
		}
		//return true
		return true;
		
	}
	
	/*
	4.
	*/
	public static void runFunctions(int sideA,int sideB,int sideC) {
		//if check inpput is true
		if(input_check(sideA, sideB, sideC)) {
			System.out.println("The perimeter is = "+perimeter(sideA, sideB, sideC));
			System.out.println("The area is = "+area(sideA, sideB, sideC));
		}

		
	}

	public static void main(String []args){
		
		/*
		1.
		*/
		int sideA=3, sideB=6, sideC =5 ;
		System.out.println("The perimeter is = "+perimeter(sideA, sideB, sideC));
		
		/*
		2.
		*/
		System.out.println("The area is = "+area(sideA, sideB, sideC));
		
		/*
		3.
		*/
		System.out.println("The returned result is = "+input_check(sideA, sideB, sideC));
		
		/*
		4.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first side");
		sideA=scan.nextInt();
		System.out.println("enter second side");
		sideB=scan.nextInt();
		System.out.println("enter third side");
		sideC=scan.nextInt();
		runFunctions(sideA, sideB, sideC);
		
		/*
		5.
		*/
		for(int i=1; i<=3;i++) {
			System.out.println("enter the "+i+" number");
			int side = scan.nextInt();
			//if input incoorect deacrease
			if(side<=0) {
				System.out.println("wrong input");
				i--;
			}
			
			
		}


	}

}
		
/*
 * 
 * 
The perimeter is = 14
The area is = 7
The returned result is = true
enter first side
5
enter second side
3
enter third side
4
The perimeter is = 12
The area is = 6
enter the 1 number
8
enter the 2 number
8
enter the 3 number
8

*/
