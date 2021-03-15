א. כתבו תכנית הראשית המגדירה 6 דליים שונים ריקים בקיבולת שונה.
מלאו את הדלי הראשון כולו במים.
מלאו את הדלי השני במחצית תכולתו של הראשון.
מלאו את הדלי השלישי במחצית תכולתו של השני.
וכן הלאה.
הריצו את התוכנית.
ב. כתבו תכנית הראשית המייצרת 3 דליים שקיבולת כל אחד מהם 20 ליטר. כל
דלי ימולא בכמות המים אקראית בתחום בין 0 ל- 20 .התוכנית תמלא את כל
הדליים במים כך שבסוף בכולם תהיה כמות המים שהייתה בהתחלה בדלי
המלא ביותר.

ג. כתבו תכנית ראשית המייצרת 3 דליים שקיבולת כל אחד מהם מספר אקראי
בתחום מ- 1 עד 10 .כל דלי ימולא בכמות המים אקראית שלא תהייה גדולה
מקיבולת של הדלי. על התוכנית להדפיס את כמות המים בדליים ממוינים בסדר
עולה.
  
  //--------------------------------------------1

		Bucket bucket1 = new Bucket(10,"water");
		Bucket bucket2 = new Bucket(10,"water");
		Bucket bucket3 = new Bucket(10,"water");
		Bucket bucket4 = new Bucket(10,"water");
		Bucket bucket5 = new Bucket(10,"water");
		Bucket bucket6 = new Bucket(10,"water");
		
		bucket1.fill(10);
		bucket2.fill(bucket1.getCapacity()/2);
		bucket3.fill(bucket2.getCapacity()/2);
		bucket4.fill(bucket3.getCapacity()/2);
		bucket5.fill(bucket4.getCapacity()/2);
		bucket6.fill(bucket5.getCapacity()/2);
	
		//--------------------------------------------2
	
		Bucket bucket1 = new Bucket(20,"water");
		Bucket bucket2 = new Bucket(20,"water");
		Bucket bucket3 = new Bucket(20,"water");
		
		
		Random r = new Random();
		int low = 0;
		int high = 20;
	
		
		bucket1.fill(r.nextInt(high-low) + low);
		bucket2.fill(r.nextInt(high-low) + low);
		bucket3.fill(r.nextInt(high-low) + low);
		
		double max = Math.max(bucket1.getCurrentAmount(), Math.max(bucket2.getCurrentAmount(), bucket3.getCurrentAmount()));
		
		bucket1.empty();
		bucket2.empty();
		bucket3.empty();
		
		
		bucket1.fill(max);
		bucket2.fill(max);
		bucket3.fill(max);
		
		//--------------------------------------------3
	
		Random r = new Random();
		int low = 1;
		int high = 10;
		
		
		Bucket bucket1 = new Bucket(r.nextInt(high-low) + low,"water");
		Bucket bucket2 = new Bucket(r.nextInt(high-low) + low,"water");
		Bucket bucket3 = new Bucket(r.nextInt(high-low) + low,"water");
		
		bucket1.fill(r.nextInt(bucket1.getCapacity()-low) + low);
		bucket2.fill(r.nextInt(bucket2.getCapacity()-low) + low);
		bucket3.fill(r.nextInt(bucket3.getCapacity()-low) + low);
		
		
		double min = Math.min(bucket1.getCurrentAmount(), Math.min(bucket2.getCurrentAmount(),bucket3.getCurrentAmount()));
		double max = Math.max(bucket1.getCurrentAmount(), Math.max(bucket2.getCurrentAmount(), bucket3.getCurrentAmount()));
		double mid = bucket1.getCurrentAmount()+bucket2.getCurrentAmount()+bucket3.getCurrentAmount()-max-min;
	
		System.out.println("min = "+min+" mid = "+mid+" max = "+max);


i .התוכנית java.Hexagon תבנה משושה משוכלל על גבי תיבה לפי המידות המפורטות בציור
(במשושה משוכלל כל הזוויות וכל הצלעות שוות זו לזו .)
שימו לב כי בעת ציור המשושה, הצב מבצע סיבוב של ולכ במהל ציור משושה יסתובב °360.

ii .שימו לב שא תחזרו על שרטוט קו יותר מפע אחת – הוא יבלוט בעוביו ולכ עליכ להימנע
מכ. כל הקווי צריכי להיות שווי בעוביי


public class Hexagone {
	public static void main(String[] args)
	{
	Turtle t1 = new Turtle();
	t1.tailDown();//init turtle
	//draw square
	t1.turnRight(90);
	t1.moveForward(100);
	t1.turnRight(90);
	t1.moveForward(25);
	t1.turnRight(90);
	t1.moveForward(200);
	t1.turnRight(90);
	t1.moveForward(25);
	t1.turnRight(90);
	t1.moveForward(100);
	//init for hexagone
	t1.turnLeft(90);
	t1.turnRight(300);
	//draw hexagone
	for(int i=0; i<6;i++) {
		t1.moveForward(70);
		t1.turnLeft(300);
		}
	}
}



public class House {
	public static void main(String[] args)
	{
		//init
	Turtle t1 = new Turtle();
	t1.tailDown();//init turtle
	//draw square
	for(int i=0; i<4;i++) {
		t1.moveForward(100);
		t1.turnRight(90);
		}
	//draw X in square
	t1.turnRight(45);
	t1.moveForward(Math.sqrt(20000));//a^2+b^2=c^2 c= 10000+10000
	t1.turnRight(135);
	t1.moveForward(100);
	t1.turnRight(135);
	t1.moveForward(Math.sqrt(20000));//a^2+b^2=c^2 c= 10000+10000
	//draw roof
	for(int i=0; i<2;i++) {
		t1.turnRight(90);
		t1.moveForward(Math.sqrt(5000));//a^2+b^2=c^2 c= 2500+2500
		}
	}	
}
