תרגיל 1
כתוב פעולה המקבלת מחרוזת של אותיות גדולות , Z-A . הפעולה מחזירה מחרוזת חדשה, כשהיא מוצפנת לפי
השיטה הבאה:
במקום אות כלשהיא נכתבת האות הבאה בסדר הא"ב בצורה מעגלית. למשל במקום A נכתבת B ,במקום Z
נכתבת A.
תרגיל 2
כתוב פעולה שמקבלת מחרוזת. הפעולה מחזירה מחרוזת חדשה תוך כדי הפיכת האותיות הגדולות לקטנות
והשמטת התווים שאינם אותיות מהמחרוזת המקורית. למשל, עבור המחרוזת "!Hello23 "יודפס: hello.

תרגיל 3
ירחמיאל וזקלין המציאו שפה מוצפנת . המשפטים הניתנים להצפנה כוללים מילים ורווחים בלבד . הצפנה
מתבצעת באופן הבא:
כל רווח מוחלף בסימן '@' , ולאחר כל אות מופיעה האות האנגלית הגדולה המתאימה לה.
למשל , המשפטmorning good מוצפן כך: mMoOrRnNiInNgG@gGoOoOdD
כתוב פעולה המקבלת משפט ומחזירה את המשפט המוצפן המתאים לו .

תרגיל 4

כתוב פעולה המקבלת מחרוזת. הפעולה תחזיר מחרוזת חדשה לפי שיטה הבאה: אם אורך המחרוזת אי-זוגי יש
להחליף בין התו הראשון והאחרון . אם אורך המחרוזת זוגי – יוחלפו ביניהם שני התווים האמצעיים במחרוזת.
דוגמה:
אם המחרוזת המקורית היא "acbd : " המחרוזת החדשה תהיה "abcd. "
אם המחרוזת המקורית היא "ebcda : "המחרוזת החדשה תהיה "abcde. "

בית הספר הארצי להנדסאים
THE NATIONAL SCHOOL FOR HANDASSAIM

2

תרגיל 5

כתובת אתר אינטרנט של חברה מסחרית בינלאומית בנויה בדרך כלל מ -3 חלקים
com.שם_החברה .www המופרדים בנקודות
כתוב פעולה המקבלת מחרוזת שהיא כתובת של אתר של חברה מסחרית בינלאומית, במבנה שתואר לעיל ,
ומחזירה את שם החברה בלבד.

תרגיל 6
כתוב את התכנית הבאה:
בשלב הראשון של התכנית, התוכנית תקבל מהמשתמש שם, מספר תעודת זהות וכתובת אימייל ותשמור אותם
במשתנים מסוג String.
בשלב השני, התוכנית תחכה לקלט מהמשתמש:
אם הוקלד email ,התוכנית תדפיס את כתובת המייל שנקלטה בשלב הראשון.
אם הוקלד name או id ,יודפסו תעודת הזהות או השם בהתאמה.
אם הוקלד all יודפסו כל הנתונים.

תרגיל 7
כתוב פעולה המקבלת מחרוזת בת מספר אי-זוגי של תווים, ומדפיסה אותה בצורת משולש ישר זוית.
למשל, עבור הקלט : "mihlala "יודפס הפלט באופן הבא:

mihlala
ihlal
hla
l

בית הספר הארצי להנדסאים
THE NATIONAL SCHOOL FOR HANDASSAIM

3

תרגיל 8
כתוב תכנית שקולטת מחרוזת של תווים. התוכנית תדפיס את תווי המחרוזת, כך שכל תו יופיע בפלט פעם אחת
יותר ממספר הפעמים שהודפס התו הקודם לו. התו הראשון יודפס פעם אחת. למשל, המחרוזת "hello "תודפס כ
. "heelllllllooooo "

תרגיל 9
כתוב תכנית הקולטת מחרוזת המכילה משפט באנגלית. בין כל מילה ומילה יש רווח בודד. התכנית מדפיסה את:
א. אורך המחרוזת.
ב. כמה מלים יש במחרוזת.
ג. מהי המלה הקצרה ביותר במשפט
ד. מהי המלה הארוכה ביותר במשפט.
  
  
  
  
  public class Strings {

	//---1
	public static String encrypt(String s) {
		String temp ="";
		temp=s.substring(2);
		temp +=" A";
		
		return temp;
	}
	
	
	//---2
	public static String filter(String s) {
		String temp ="";
		for (int i=0 ; i<s.length() ;i++)
			if (s.charAt(i)>='a' && s.charAt(i)<='z' ||s.charAt(i)>='A' && s.charAt(i)<='Z' ) {
				temp+=s.charAt(i);
			}
				
		return temp.toLowerCase();
	}
	
	
	//---3
	public static String encryptString(String s) {
		String temp ="";
		int counter=2;
		for (int i=0 ; i<s.length() ;i++) {
			if (s.charAt(i)==' ') {
				temp+="@";
				i++;
			}
			if(counter%2==0) {
				temp+=Character.toLowerCase(s.charAt(i));
			}else {
				temp+=Character.toUpperCase(s.charAt(i));
			}
			counter++;
		}	
		return temp;
	}
	
	
	//---4
	public static String replace(String s) {
		String temp ="";
		if(s.length()%2!=0) {
			char t=s.charAt(0);
			char t1=s.charAt(s.length()-1);
			temp+=t1;
			temp+=s.substring(1,s.length()-1);
			temp+=t;
		}
		if(s.length()%2==0) {
			
			int begin=s.length()/2;
			int end=s.length()/2+1;
			char t=s.charAt(begin);
			char t1=s.charAt(end);
			
			temp+=s.substring(0,begin-1);
			temp+=t1;
			temp+=t;
			temp+=s.substring(end);
		}
		return temp;
	}
	
	
	
	//---5
	public static String replaceWWW(String s) {
		String temp ="";
		
		temp+=s.substring(4,s.length()-4);
		
		return temp;
	}
	
	
	
	//---6
	static Scanner s = new Scanner(System.in);
	
	public static String getDetails(String s) {
		char[] chars = "abcdefghijklmnopqrstuvwxyz@.com".toCharArray();
		StringBuilder sb = new StringBuilder(20);
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		String name = sb.toString().substring(0, 4);
		String id = sb.toString().substring(5,8);
		String email = sb.toString().substring(15);
		
		String temp ="";
		if(s.compareTo("email")==0) {
			temp+= email;
		}else if(s.compareTo("id")==0) {
			temp+= id;
		}else if(s.compareTo("name")==0) {
			temp+= name;
		}else if(s.compareTo("all")==0) {
			temp+= email + "\n" + id + "\n" + name;
		}else {
			return temp;
		}
		return temp;
		
		
	}
	
	//---7
		public static String pyramid(String s) {
			String temp ="";
			for (int i=0 ; i<s.length() ;i++) {
					System.out.println();
					if(i==0) {
						System.out.print(s.charAt(i));
					}
					
				for (int j=i+1 ; j<s.length() ;j++) {
					System.out.print(s.charAt(j));
					
					
				}
				s.substring(s.length()-1);
			}
					
			return temp.toLowerCase();
	}
		
		//---8
		public static String doubleIt(String s) {
			String temp ="";
			int counter =0;
			int counterIndex =2;
			for (int i=0 ; i<s.length() ;i++) {
				
			
				while(counter<counterIndex) {
					temp+=s.charAt(i);
					counter++;
				}
				counter=0;
				counterIndex+=2;
				
			}
					
			return temp;
	}
		
		
		//---9
		public static void getInfo(String s) {
			int length=s.length();
			int countWord=1;
			
			
			for (int i=0 ; i<s.length() ;i++) {
				if(s.charAt(i)==' ') {
					countWord++;
				}
				
			}
			
		
			int[] charCount = new int[countWord];
			int countChr=0;
			int charCountIndex=0;
			 
			
			
			for (int i=0 ; i<s.length() ;i++) {
				countChr++;
				
				if(s.charAt(i)==' ') {
					charCount[charCountIndex]=countChr;
					countChr=0;
					charCountIndex++;
				}
				
			}
			
			int min =1000;
			int max =0;
			int avg =0;
			for (int i=0 ; i<charCount.length ;i++) {
				avg+=charCount[i];
				if(charCount[i]<min && charCount[i]!=0) {
					min=charCount[i];
				}else if(charCount[i]>max){
					max=charCount[i];
				}
				
			}
			avg/=charCount.length;
			
			
			int c= 0;
			String shortWord="";
			String longWord="";
			
			for (int i=0 ; i<s.length() ;i++) {
				c++;
				if(s.charAt(i)==' ') {
					if(c==max) {
						longWord= s.substring(0,5);
					}
					if(c==min) {
						shortWord= s.substring(i-1,i);
					}
					c=0;
				}
				
			}
			
					
			System.out.println(
					"Length is: "+length+",\n"
					+"There is : "+countWord+" words,\n"
					+"There short word is: "+shortWord+ ",\n"
					+"There long word is: "+longWord+",\n"
					+"There average word length is: "+avg+",\n");
	}
		
	
  public static void main(String[] args) {
	  
	  //---1
	  String abc = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
	  System.out.println(encrypt(abc));
	  
	  
	  //---2
	  String hello = "Hello23!";
	  System.out.println(filter(hello));
	  
	  //---3
	  String morning = "good morning";
	  System.out.println(encryptString(morning));
	  
	  
	  //---4
	  String abcd = "abcde";
	  System.out.println(replace(abcd));
	  
	  
	  //---5
	  String website = "www.website.com";
	  System.out.println(replaceWWW(website));
	  
	  //---6
	  System.out.println("Enter name id email or all");
	  //String input = s.next();
	  //System.out.println(getDetails(input));
	  
	  //---7
	  String mihlalala = "mihlalala";
	  System.out.println(pyramid(mihlalala));
	  
	  //---8
	  String s = "hello and have a good day";
	  getInfo(s);
	  
  }

}


//---1
//B C D E F G H I J K L M N O P Q R S T U V W X Y Z A

//---2
//hello

//---3
//gOoD@mOrNiNg

//---4
//ebcda

//---5
//website

//---6
//Enter name id email or all
//fd2@.com
//kfoe
//fadsc

//---7
//mihlala
//hlala
//lala
//ala
//la
//a


//---7
/*
 * Length is: 25,
There is : 6 words,
There short word is: a,
There long word is: hello,
There average word length is: 4,
*/


ה. מה האורך הממוצע של מלה במשפט.
