כתוב פונקציה המקבלת שתי מחרוזות.
הפונקציה תבדוק אם המחרוזת השניה מופיע בתוך המחרוזת הראשונה. אם לא, הפונקציה תחזיר 1.-
אם כן , הפונקציה תחזיר את המיקום המופע האחרון של המחרוזת השניה בתוך המחרוזת הראשונה.
מיקום המופע מוגדר כמקום הסידורי במחרוזת הראשונה של האות הראשונה במחרוזת השניה.
דוגמא: מחרוזת הראשונה AEYESOFYESBEWYESI מחרוזת השניה YES
המופע האחרון של המחרוזת השניה במחרוזת הראשונה הוא במקום ה- 14.
שאלה מס' 2

א. כתוב פונקציה המקבלת מחרוזת ומחזירה מחרוזת , כך שלא יופיעו שנים או יותר תווים זהים
בסמוך זה לזה. למשל, עבור המחרוזת "aaabbcdeeeea "תוחזר : המלל הבא abcdea
ב. כתוב תוכנית הקולטת 20 מחרוזות. על התוכנית להדפיס את המחרוזת ללא תווים זהים סמוכים
הארוכה ביותר.
שאלה מס' 3

נגדיר "סיבוב" מחרוזת כפעולה המעבירה את האיבר האחרון במחרוזת לראש המחרוזת:
דוגמא: המחרוזת המקורית abcde
המחרוזת חדשה לאחר "סיבוב" אחד eabcd
המחרוזת חדשה לאחר שני "סיבובים" deabc
א. כתוב פונקציה, המקבלת מחרוזת ומספר K . פונקציה מחזירה מחרוזת חדשה אחרי ביצוע
K" סיבובים", כאשר לאחר כל "סיבוב" המחרוזת המתקבלת תודפס בשורה נפרדת.
18.5.21 : הגשה מועד
 הגשה בזוגות !
 יש להגיש לקלסרום :
o את התוכניות )קבצי java )מתועדות ומוזחות כפי שמקובל.
o קובץ pdf יחיד, מסודר ומתועד הכולל את כל התרגילים .

2

ב. כתוב תוכנית הקולטת מחרוזת ומספר שלם k .אם המחרוזת אחרי k סיבובים זהה למחרוזת
המקורית, על התוכנית להדפיס מילה equal .אחרת על התוכנית להדפיס בכמה מהמקומות
במחרוזת התווים היו שונים .
שאלה מס' 4.

עבור שני מספרים טבעיים I ו- J נגדיר פעולת "הזזה" המבוצעת על מחרוזת באופן הבא:
לוקחים תת מחרוזת באורך J תווים, המתחילה במקום ה- I ,ומעבירים אותה לתחילת המחרוזת.
א. כתוב תכנית הקולטת מחרוזת בשלמותה ושני מספרים טבעיים I ו- J ,מבצעת פעולת "הזזה" על
המחרוזת שנקלטה ומדפיסה את המחרוזת החדשה שהתקבלה.
אורך המחרוזת אינו עולה על 100 תווים.
הערה: אין צורך לבדוק את תקינות הקלט.
שאלה מס' 5.

כתוב תכנית, הקולטת בשלמותה מחרוזת באורך של עד 70 תווים. המחרוזת בנויה מתת מחרוזות
המכילות אותיות. בסוף כל תת מחרוזת מופיע התו *. על התכנית להדפיס את התו האמצעי או את
התווים האמצעיים של כל תת מחרוזת, באופן הבא:
אם תת מחרוזת היא באורך אי - זוגי יודפס התו האמצעי שלה.
אם תת המחרוזת היא באורך זוגי יודפסו שני התווים האמצעיים.
DEFA*KBBG*X*ABC* הקלט מחרוזת: דוגמא
הפלט יהיה EF
BB
X
B

שאלה מס' 6.
בהנתן שתי מחרוזות A ו B נגדיר:
"ההפרש בין A ל-B " הוא המחרוזת הנוצרת מהוצאת כל המופעים של B מ- A . אם B אינו
מופיע ב-A כתת-מחרוזת , ההפרש הוא המחרוזת A.
כתוב תוכנית הקולטת שתי מחרוזות A ו B ומדפיסה את "ההפרש בין A ל-B. "
לדוגמא : אם - A היא "abcabbababdfaaaaab " ו B היא "ab "
  
  
  
  
  
  
  
  
  
  
  
  
  
 
public class T1 {
 
 public static int lastOcc(String str1, String str2) {
 // Takes 2 strings, returns the place of the last occurrence of str1 within str2
 // if there is no occurrence of str1 within str2 it returns -1
 
 if(str1.contains(str2))
 return str1.lastIndexOf(str2)+1;
 return -1;
 }
 
 public static void main(String[] args) {
 
 String s1 = "the sky is blue, the sky is clear";
 
 System.out.println("1) " + lastOcc(s1, "abc"));
 System.out.println("2) " + lastOcc(s1, "sky"));
 System.out.println("3) " + lastOcc(s1, ""));
 System.out.println("4) " + lastOcc(s1, "the sky is"));
 System.out.println("5) " + lastOcc(s1, "the sky is blue"));
 }
}2
שאלה 2 :
import java.util.Scanner;
public class T2 {
 
 public static String noRepeats(String str) {
 // Takes a string and returns the string without a consecutive repeating character
 
 if(str.length()<2)
 return str;
 String newStr = "";
 newStr += str.charAt(0);
 for(char c:str.toCharArray())
 if(newStr.charAt(newStr.length()-1)!=c)
 newStr += c;
 return newStr;
 }
 
 
 public static void main(String[] args) {
 
 Scanner input = new Scanner(System.in);
 String max_str =""; // longest string with no similar repeating characters
 String current_str =""; // current input string
 System.out.println("enter 20 strings:");
 for(int i=1; i<21; i++) {
 System.out.print(i + ") ");
 current_str = input.nextLine();
 if(noRepeats(current_str).length()>noRepeats(max_str).length())
 max_str = current_str;
 }
 System.out.println("longest string with no repeats: " + max_str);
 input.close();
 }
}3
שאלה 3 :
import java.util.Scanner;
public class T3 {
 
 public static String rotateRight(String str, int k) {
 // Takes a string and a number (k), right rotates entered string k times
 // prints the string after every rotation, returns entered string after k rotations
 
 int x = str.length();
 for(int i=0; i<k; i++) {
 str = str.charAt(x-1) + str.substring(0,x-1);
 System.out.println(str);
 }
 return str;
 }
 
 public static int difCount(String str1, String str2) {
 // Takes 2 strings, returns the number of places where the 2 strings have different 
characters
 // the 2 strings must be of the same length
 
 int c=0; // character difference counter
 for(int i=0; i<str1.length(); i++)
 if(str1.charAt(i) != str2.charAt(i))
 c++;
 return c;
 }
 
 public static void main(String[] args) {
 
 String str = ""; // entered string
 String newStr =""; // new string after k rotations
 int k = 0; // number of rotations to perform
 
 Scanner input = new Scanner(System.in);
 System.out.println("enter string: ");
 str = input.nextLine();
 System.out.println("enter number of rotations(k): ");
 k = input.nextInt();
 
 newStr = rotateRight(str, k);
 System.out.println("\n" + (newStr.equals(str)? "equal":("number of different characters: 
" + difCount(str, newStr))) );
 input.close();
 }
}4
שאלה 4 :
import java.util.Scanner;
public class T4 {
 
 public static String replaceStr(int i, int j, String str) {
 // Takes 2 numbers (i=> replace start, j=> replace length) and a string
 // moves the substring starting at place i of length j to the start of entered string
 // returns the new string after displacement
 
 if(--i>0)
 str = str.substring(i,i+j) + str.substring(0, i) + str.substring(i+j, str.length());
 return str;
 }
 
 
 public static void main(String[] args) {
 
 String str ="";
 int i=0;
 int j=0;
 
 Scanner input = new Scanner(System.in);
 System.out.println("enter string: ");
 str = input.nextLine();
 System.out.println("enter i (start): ");
 i = input.nextInt();
 System.out.println("enter j (length): ");
 j = input.nextInt();
 
 System.out.println(replaceStr(i, j, str));
 input.close();
 }
}5
שאלה 5 :
public class T5 {
 
 public static void printMiddle(String str) {
 // Takes a string containing substrings, each that ends with '*'
 // prints middle character/s for each substring
 
 String[] s_arr = str.split("\\*");
 for(String s:s_arr) {
 int i, j, len = s.length()-1;
 i = len/2; // start for substring
 j = i+1+(len)%2; // end for substring
 System.out.println(s.substring(i,j));
 }
 }
 
 
 public static void main(String[] args) {
 
 String str = "gorilla*lion*lama*camel*bird*dog*tiger*python*cheetah*";
 System.out.println(str);
 printMiddle(str);
 
 str = "1234*12345*123456*1234567*12345678*12341234*";
 System.out.println("\n\n" + str);
 printMiddle(str);
 
 }
}6
שאלה 6 :
public class T6 {
 
 public static void difA_B(String a, String b) {
 // Takes 2 strings, removes all occurrences of string b from string a
 // prints string a
 
 if(a.contains(b)) {
 a = a.replace(b, "");
 System.out.println(a);
 }
 else
 System.out.println(a);
 }
 
 public static void main(String[] args) {
 
 String A,B;
 A = "abcdabcdabcdancc";
 B = "abcd";
 difA_B(A, B);
 
 B = "xyz";
 difA_B(A, B);
 
 }

אז ההפרש בין A ל-B הוא : " cbdfaaaa"
