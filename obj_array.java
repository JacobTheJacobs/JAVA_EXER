בתרגיל הבא יש להשתמש במחלקה Date שבניתם במעבדה מספר 1.
הוסיפו מחלקה חיצונית בשם : TestDate ולה הוסיפו את הפעולות הבאות:
א. פעולה המקבלת מערך של תאריכים Date מחפשת ומחזירה איזה חודש היה השכיח.
ב. פעולה שמקבלת מערך של תאריכים Date ומחזירה באיזו שנה היו הכי הרבה
תאריכים )הניחו שהשנים בין 1900 עד ל- 2020.)
ג. פעולה שמקבלת מערך של תאריכים Date ותאריך נוסף dOther.הפעולה מדפיסה
את כל התאריכים הבאים אחרי התאריך dOther .
ד. פעולה שמקבלת מערך של תאריכים Date ומחזירה מחרוזת המתארת את כל
התאריכים הנמצאים במערך.
ה. הוסיפו, פעולה ראשית, הגדירו בה מערך של 5 תאריכים ובדקו כל אחת מהפעולות

public class Date {
	
	// Instance Variables
    int day;
    int month;
    int year;
  
 
    // Constructor Declaration of Class
    public Date(int day, int month,int year)
    {
       this.day=day;
       this.month=month;
       this.year=year;
     
    }

	public int getDay() {
		return day;
	}

	//day between 1 and 31
	public void setDay(int day) {
		if(day > 0 && day < 32) {
			this.day = day;
		}else {
			this.day = 0;
		}
	}


	public int getMonth() {
		return month;
	}

	//month between 1 and 12
	public void setMonth(int month) {
		if(month > 0 && month < 13) {
			this.month = month;
		}else {
			this.month = 0;
		}
	}


	public int getYear() {
		return year;
	}

	//year has 4 digits
	public void setYear(int year) {
		
		if(year > 999 && year < 10000) {
			this.year = year;
		}else {
			this.year = 0;
		}
		
	}

	//compare to method
	public int compareTo(Date other) {
		
		if(other.getDay() == this.day && other.getMonth() == this.month && other.getYear() == this.year) {
			return 0;
		}else {
			return -1;
		}
	
	}
	//to string
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}

import java.util.Random;

public class TestDate {
	
	 
			//----1
	        public static int maxMonth(Date[] d) {
	            int count=0;
	            int max=0;
	            
	        	for(int i=0; i<d.length-1; i++) {
	        		
	        		for(int j=i+1; j<d.length; j++) {
		        		
		        		if(d[i].getMonth()==d[j].getMonth()) {
		        			count++;
		        		}
		            }
	        		if(count>max) {
	        			max=d[i].getMonth();
	        		}
	        		count=0;
	            }
				return max;
	        }
	      //----2
	        public static int maxYear(Date[] d) {
	            int count=0;
	            int max=d[0].getYear();
	            
	        	for(int i=0; i<d.length-1; i++) {
	        		
	        		for(int j=1; j<d.length; j++) {
		        		
		        		if(d[i].getYear()==d[j].getYear()) {
		        			count++;
		        		}
		            }
	        		if(count>max) {
	        			max=d[i].getYear();
	        		}
	        		count=0;
	            }
				return max;
	        }
	        
	        //----3
	        public static void printAfter(Date[] d,Date dOther) {
	      
	        	for(int i=0; i<d.length; i++) {
	        		
	        		if(d[i].getYear()>dOther.getYear()) {
	        			
	        			System.out.println(d[i].toString());
	        		}
	        		
	        		if(d[i].getYear()==dOther.getYear()) {
	        			
	        			if(d[i].getMonth()>dOther.getMonth()) {
	        				
	        				System.out.println(d[i].toString());	
	        			}
	        			
	        			if(d[i].getMonth()==dOther.getMonth()) {
	        				
	        				if(d[i].getDay()>dOther.getDay()) {
		        				
		        				System.out.println(d[i].toString());	
		        			}	
	        			}

	        		}
	        		
	            }
				
	        }
	        
	        //----4
	        public static String toStringArray(Date[] d) {
	          
	        	String s= "";
	        	for(int i=0; i<d.length; i++) {
	        		s+=d[i].toString();
	        		s+="\n";
	            }
	        	return s;
				
	        }
	        
	     
	        
	        public static void main(String[] args){
	     
	        	//init dates array
	        	Date[] dates = new Date[5];
	        	for(int i =0; i<dates.length; i++) {
	        		Random r = new Random();
	        		dates[i] = new Date(r.nextInt(31)+1,r.nextInt(12)+1,r.nextInt(2021-1900)+1900);
	        	}
	        	
	        	
	        	
	        	System.out.println("most appeard month");
	        	System.out.println(maxMonth(dates));
	        	System.out.println();
	        	
	        	System.out.println("most appeard year");
	        	System.out.println(maxYear(dates));
	        	System.out.println();
	        	
	        	System.out.println("print after this date");   	
	        	printAfter(dates, new Date(1,2,1990));
	        	System.out.println();
	        	
	        	System.out.println("All the dates");
	        	System.out.println(toStringArray(dates));
	        	
	      }
	    
}


/*
 * 
 * most appeard month
1

most appeard year
1936

print after this date
Date [day=16, month=1, year=2009]

All the dates
Date [day=18, month=1, year=1936]
Date [day=20, month=2, year=1956]
Date [day=8, month=9, year=1959]
Date [day=16, month=1, year=2009]
Date [day=29, month=8, year=1961]

*/
בנו מחלקה עיפרון Pencil.
העיפרון מאופיין ע"י צבע)מחרוזת( , מחודד או לא )בוליאני(, מחיר )ממשי(.
במחלקה יש להגדיר :

 פעולה בונה , המקבלת את כל הפרמטרים לאתחול התכונות.
 פעולה בונה מעתיקה.
 פעולות set/get לכל אחת מהתכונות.
 פעולה לתיאור העצם .
 פעולה המקבלת כפרמטר עיפרון נוסף ומחזירה true אם הצבעים של
שני העפרונות זהים ו- false אחרת.

ב. הוסיפו מחלקה חדשה בשם TestPencil והגדירו בה את הפעולות הבאות :
 פעולה שמקבלת מערך של עפרונות ומחזירה מערך חדש של עפרונות מחודדים .
 פעולה שמקבלת מערך של עפרונות , ומחזירה את ממוצע המחירים של העפרונות
האדומים .

בית הספר הארצי להנדסאים
THE NATIONAL SCHOOL FOR HANDASSAIM

2

 פעולה שמקבלת מערך של עפרונות ומחזירה true אם כל העפרונות הם באותו צבע ו-
false אחרת .
 פעולה שמקבלת מערך של עפרונות ומחזירה את העפרון בעל המחיר המקסימלי.
 פעולה שמקבלת מערך של עפרונות ומדפיסה את פרטי כל העפרונות המחודדים.
 פעולה ראשית , בתוכה בנו מערך של 5 עפרונות ובידקו כל אחת מהפעולות הקודמות .
  
  public class Pencil {
	
	private String color; 
	private boolean sharp; 
	private double price;
	
	
	
	public Pencil(String color, boolean sharp, double price) {
		this.color = color;
		this.sharp = sharp;
		this.price = price;
	}
	
	
	public Pencil(Pencil p) {
		this.color = p.color;
		this.sharp = p.sharp;
		this.price = p.price;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public boolean isSharp() {
		return sharp;
	}


	public void setSharp(boolean sharp) {
		this.sharp = sharp;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}



	public String toString() {
		return "Pencil [color=" + color + ", sharp=" + sharp + ", price=" + price + "]";
	}



	public boolean isSameColor(Pencil p) {
		boolean res = false;
		if(this.color==p.getColor()) {
			res= true;
		}
		return res;
	}

    
    public class TestPencil {
	

	        //----1
	        public static void sharpen(Pencil[] p) {
	          
	        	for(int i=0; i<p.length;i++) {
	        		p[i].setSharp(true);
	        	}
				
	        }
	        
	        //----2
	        public static int redAvg(Pencil[] p) {
	        	int avg =0;
	        	int c=0;
	        	for(int i=0; i<p.length;i++) {
	        		if(p[i].getColor().toLowerCase().contains("red")) {
	        			avg+=p[i].getPrice();
	        			c++;
	        		}
	        	}
	        	System.out.println(avg/c);
				return avg/c;
	        }
	        
	      //----3
	        public static boolean checkColor(Pencil[] p) {
	        	boolean res = true;
	        	for(int i=0; i<p.length-1;i++) {
	        		for(int j=0; j<p.length;j++) {
		        		if(p[i].isSameColor(p[j])) {
		        			
		        		}else {
		        			res=false;
		        		}
		        	}
	        	}
	        	return res;
	        }
	        
	        //----4
	        public static double maxPricePencil(Pencil[] p) {
	        	double max =p[0].getPrice();
	        
	        	for(int i=0; i<p.length;i++) {
	        		if(p[i].getPrice()>max) {
	        			max=p[i].getPrice();
	        		}
	        	}
	        	System.out.println(max);
				return max;
	        }
	        
	        //----5
	        public static void sharpenPencils(Pencil[] p) {
	        	
	        	for(int i=0; i<p.length;i++) {
	        		if(p[i].isSharp()) {
	        			System.out.println(p[i].toString());
	        		}
	        	}

	        }
	        
	     
	        
	        public static void main(String[] args){
	     
	        	//init dates array
	        	Pencil[] pencils = new Pencil[5];
	        	
	        	pencils[0] = new Pencil("Blue",false,5.00);
	        	pencils[1] = new Pencil("Red",false,8.00);
	        	pencils[2] = new Pencil("Orange",false,5.00);
	        	pencils[3] = new Pencil("Yellow",false,15.00);
	        	pencils[4] = new Pencil("Red",false,10.00);
	        	
	        	
	        	sharpen(pencils);
	        	
	        	redAvg(pencils);
	        	
	        	checkColor(pencils);
	        	
	        	maxPricePencil(pencils);
	        	
	        	sharpenPencils(pencils);
	        	
	        	
	      }
	    
}


/*
 * 9
15.0
Pencil [color=Blue, sharp=true, price=5.0]
Pencil [color=Red, sharp=true, price=8.0]
Pencil [color=Orange, sharp=true, price=5.0]
Pencil [color=Yellow, sharp=true, price=15.0]
Pencil [color=Red, sharp=true, price=10.0]
*/
    
    -------------------------------------------------------------------------------------------------------------------------------------------
      
      
      א. בנו מחלקה מטייל Travel.
המטייל מאופיין ע"י שם )מחרוזת( , גיל )שלם(, האם הוא חבר בחברה להגנת הטבע
)בוליאני(, מספר ימי הטיול בשנה )שלם(.
במחלקה יש להגדיר :

 פעולה בונה , המקבלת כפרמטרים ערכים לכל התכונות.
 פעולת get לכל אחת מהתכונות.
 פעולות set לכל התכונות פרט לשם המטייל.
 פעולה לתיאור העצם.

ב. הוסיפו מחלקה חדשה בשם TestTravel והגדירו בה את הפעולות הבאות :
 פעולה שמקבלת מערך של מטיילים ומחזירה את הגיל המטייל הכי צעיר .
 פעולה שמקבלת מערך של מטיילים ומחזירה את הגיל של המטייל הכי מבוגר .
 פעולה שמקבלת מערך של מטיילים ומחזירה את כמות הממוצעת של מספר ימי הטיול
בשנה של מטיילים שהם חברים בחברה להגנת הטבע.
 פעולה שמקבלת מערך של מטיילים ומדפיסה את שמות המטיילים בין הגילאים 25-15
שהם לא חברים בחברה להגנת הטבע.
 פעולה ראשית, בה תגדירו מערך של 3 מטיילים ותבדקו כל אחת מהפעולות הקודמות.
                                    
 public class Travel{
	

	private String name;
	private int age;
	private boolean memmber;
	private int dayVac;
	
	
	public Travel(String name, int age, boolean memmber, int dayVac) {
		this.name = name;
		this.age = age;
		this.memmber = memmber;
		this.dayVac = dayVac;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isMemmber() {
		return memmber;
	}


	public void setMemmber(boolean memmber) {
		this.memmber = memmber;
	}


	public int getDayVac() {
		return dayVac;
	}


	public void setDayVac(int dayVac) {
		this.dayVac = dayVac;
	}


	@Override
	public String toString() {
		return "Travel [name=" + name + ", age=" + age + ", memmber=" + memmber + ", dayVac=" + dayVac + "]";
	}

} 
  public class TestTravel {
	

	        //----1
	        public static int minAge(Travel[] t) {
	          int min = t[0].getAge();
	        	for(int i=0; i<t.length;i++) {
	        		if(t[i].getAge()<min) {
	        			min=t[i].getAge();
	        		}
	        	}
	        	System.out.println(min);
				return min;
	        }
	        
	        //----2
	        public static int maxAge(Travel[] t) {
	          int max = t[0].getAge();
	        	for(int i=0; i<t.length;i++) {
	        		if(t[i].getAge()>max) {
	        			max=t[i].getAge();
	        		}
	        	}
	        	System.out.println(max);
				return max;
	        }
	        
	      //----3
	        public static int memberAvg(Travel[] t) {
	          int avg = 0;
	          int c = 0;
	        	for(int i=0; i<t.length;i++) {
	        		if(t[i].isMemmber()) {
	        			avg=t[i].getDayVac();
	        			c++;
	        		}
	        	}
	        	System.out.println(avg/c);
				return avg/c;
	        }
	        
	        //----4
	        public static void notMembers(Travel[] t) {
	        	for(int i=0; i<t.length;i++) {
	        		if(!t[i].isMemmber()) {
	        			if(t[i].getAge()>=15 && t[i].getAge()<=25) {
	        				System.out.println(t[i].getName());
	        			}
	        		}
	        	}
			
	        }
	        
	        
	     
	       
	        public static void main(String[] args){
	     
	        	//init dates array
	        	Travel[] travelers = new Travel[3];
	        	
	        	travelers[0] =  new Travel("John", 28, true, 59);
	        	travelers[1] =  new Travel("Peter", 32, false, 76);
	        	travelers[2] =  new Travel("Sam", 22, false, 17);
	        	
	        	
	        	System.out.println("The min age");
	        	minAge(travelers);
	        	System.out.println();
	        	
	        	System.out.println("The max age");
	        	maxAge(travelers);
	        	System.out.println();
	        	
	        	System.out.println("The avg age of members");
	        	memberAvg(travelers);
	        	System.out.println();
	        	
	        	System.out.println("The not member between 15-25");
	        	notMembers(travelers);
	        	System.out.println();
	        	
	  
	
	      }
	    
}


/*
 * 
 * 
 * The min age
22

The max age
32

The avg age of members
59

The not member between 15-25
Sam

*/                                  
  
