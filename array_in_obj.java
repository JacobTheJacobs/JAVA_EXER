א. הגדירו מחלקה עוגה - Cake בעלת התכונות הבאות:
 שם העוגה name( מחרוזת (.
 מערך מרכיבי העוגה arr) כל מרכיב הוא מחרוזות(.
 מספר מרכיבי העוגה n( מספר שלם בין 0 לאורך המערך(.
 האם העוגה מתאימה לחולי צליאק tzliak( - משתנה בוליאני true אם היא מתאימה
כלומר אין רכיב מסוכן ו - false, אם אינה מתאימה ( קיים רכיב מסוכן)(.
 מחיר price( מספר ממשי(.

ב. הוסיפו למחלקה Cake את הפעולות הבאות:

 פעולה בונה המקבלת כפרמטר את שם העוגה ומחיר העוגה. הפעולה
מאתחלת את התכונות המתאימות, מגדירה מערך מרכיבים בגודל 20 שכרגע
ריק )0=n )ומאתחלת תכונה tzliak ל-true.
 פעולות get לכל תכונה.
 פעולות set עבור שם העוגה, מחיר העוגה.
 פעולה לתיאור העצם.
 פעולה המקבלת מחרוזת st המייצגת מרכיב בעוגה ומוסיפה אותו למערך
מרכיבי העוגה. אם המרכיב הוא " Flour " או " flour raising-Self "
הפעולה תשנה גם את ההתאמה לחולי צליאק ללא מתאים.
הניחו שיש מקום במערך להוסיף רכיב זה ועדכנו את מספר מרכיבי העוגה.
 פעולה המקבלת כפרמטר עוגה נוספת ומחזירה את שם העוגה היקרה יותר.

2

ג. כתבו תכנית ראשית המגדירה 2 עוגות בעלות פרטים לפי בחירתכם. על התוכנית
להוסיף להן מרכיבים. התכנית תבדוק כל הפעולות של מחלקה Cake.

ד. כתבו פעולה חיצונית במחלקה הראשית, המקבלת שתי עוגות מטיפוס Cake.
הפעולה מדפיסה את שמות העוגות )מבין שתי עוגות( המתאימות לחולי צליאק ומחירן עד
50 .₪אם אין עוגות כאלה, הפעולה תדפיס הודעה מתאימה.
                                             
                                             
                                             
 public class Cake {
	
	private String name; 
	private String[] arr;
	private int n; 
	private boolean tzliak;
	private double price;
	
	
	public Cake(String name, double price) {
		this.name = name;
		this.price = price;
		this.arr = new String[20] ;
		this.n = 0 ;
		this.tzliak =true;
	}

	//getters
	public String getName() {
		return name;
	}
	public String[] getArr() {
		String[] copy = new String[this.n];
		for ( int i=0 ; i<copy.length ; i++)
			copy[i]= this.arr[i] ;
		return copy ;
	}
	public int getN() {
		return this.n;
	}
	public boolean isTzliak() {
		return tzliak;
	}
	public double getPrice() {
		return price;
	}
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	//to string
	public String toString() {
		String s = "\n Name of Cake ===> "+ this.name
				+"   " 
				+ "\n Price of Cake ===> "+this.price 
				+ "  " 
				+ "\n Is good for tziliak ===> "+this.tzliak
				 ;
		s+=" \n The Ingredients Are  \n";
		for (int i=0 ; i<this.arr.length ; i++) {
			if(arr[i]!=null) {
				s+=this.arr[i] + ",   " ;
			}
		}
			
		return s ;
	}
	 //add ingredient
	public void addIngredient (String s){
		
		if(s.toLowerCase().contains("flour")) {
			this.tzliak=false;
		}
		this.arr[this.n] = s ;
		this.n++ ;
	}

	//check cake price
	public double isExpensive(Cake cake) {
		if(this.price>cake.getPrice()) {
			return this.price;
		}else {
			return cake.getPrice();
		}
	}
}
                                             
public class CakeTest {
	
	public static void check(Cake c1,Cake c2) {
		
		if(c1.isTzliak() || c2.isTzliak()) {
			
			if(c1.isTzliak() && c2.isTzliak()!=true) {
				
			System.out.println(c1.getName());	
			
			}else if(c2.isTzliak() && c1.isTzliak()!=true) {
				System.out.println(c1.getName());
				
			}else {
				if(c1.getPrice()>c2.getPrice()) {
					System.out.println(c1.getName());
				}else {
					System.out.println(c2.getName());
				}
			}
		}else {
			System.out.println("No Proper cakes were found");
		}
	}

	public static void main(String[]args) {

		Cake c1 = new Cake("Napoleon Cake",100.00);
		
		Cake c2 = new Cake("Oreo Cake",150.00);
	
		
		System.out.println(c1.toString());
		c1.addIngredient("Sugar");
		c1.addIngredient("Spice");
		c1.addIngredient("Evrything Nice");
		c1.addIngredient("Flour");
		System.out.println(c1.toString());
		
		
		System.out.println(c2.toString());
		c2.addIngredient("Salt");
		c2.addIngredient("Water");
		c2.addIngredient("Eggs");
		c2.addIngredient("Flours");
		System.out.println(c2.toString());
		
		
		
		System.out.println(c1.isExpensive(c2));
		
		
		check(c1, c2);
		
	}
}                                             
