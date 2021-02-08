שאלה מס' 1.

א. כיתבו פונקציה (dig int, num int (digit המקבלת כפרמטרים מס' num וספרה
עשרונית )בין 0 ל- 9 )dig ומחזירה true אם הספרה dig מופיעה במספר num .אם לא,
הפונקציה מחזירה false.
ב. כיתבו פונקציה (num2 int,num1 int (number שמחזירה true אם כל הספרות של
מספר num1 מופיעות במספר num2 .אחרת, הפונקציה מחזירה false.

ג. כיתבו פונקציה ראשית אשר קולטת מספר שלם וחיובי במשתנה m ואחריו m זוגות של
מספרים שלמים. יש להדפיס כל זוג בשורה נפרדת ולבדוק האם מספרי הזוג בנויים
מאותן הספרות. אם כן , יש להדפיס ליד כל זוג YES ,ואחרת NO.

לדוגמא , עבור 5=m יש לקלוט 5 זוגות של מספרים שלמים:

32121 321 YES
32645 3562 NO
123 32112 YES
1003 3274 NO
1012


public class T1
    {
        
        
//      א)
        
        
        public static boolean digit(int num, int dig)
        {   //input: an integer number (int num), a digit (int dig)
            //output: returns true if dig is in num, otherwise returns false
            
            num = Math.abs(num);
            dig = Math.abs(dig);
            
            while(num > 0)
                {
                    if(num%10 == dig)
                        return true;
                    num /= 10;
                }
            return false;
        }
        
        
//      ב)
        
        
        public static boolean number(int num1, int num2)
        {   //input: 2 integer numbers (num1, num2)
            //output: returns true if all num1 digits are present in num2, otherwise returns false
            
            num1 = Math.abs(num1);
            num2 = Math.abs(num2);
            
            if(num1 == 0)
                if(!digit(num2, 0))
                    return false;
            
            while(num1 > 0)
                {
                    if(!digit(num2 , num1 % 10))
                        return false;
                    num1 /= 10;
                }
            return true;
        }
        
        
//      ג)
        
        public static void main(String[] args)
            {   //input: integer numbers (m, num1, num2)
                //output: prints num1 and num2 and "YES" if num1 and num2 consist of the same digits, 
                // otherwise prints num1 and num2 and "NO"
                
                int m;
                int num1, num2;
                
                Scanner input = new Scanner(System.in);
                System.out.println("enter number: ");
                m = input.nextInt();
                while(m <= 0)
                    {
                        System.out.println("please enter a positive integer");
                        m = input.nextInt();
                    }
                
                for(int i = 1; i <= m; i++)
                    {
                        System.out.println("pair " + i + " :");
                        System.out.println("1) ");
                        num1 = input.nextInt();
                        System.out.println("2) ");
                        num2 = input.nextInt();
                        
                        System.out.println(num1 + "      " + num2 + "      " + ( number(num1, num2) && number(num2, num1)? "YES" : "NO") + "\n\n");
                    }
                
                System.out.println("finished");
                
                input.close();
            }
    }





//32121    321    YES
//
//32645    3562    NO
//
//123    32112    YES
//
//1003    3274    NO
//
//1012    1042    NO




//enter number: 
//5
//pair 1 :
//1) 
//32121
//2) 
//321
//32121      321      YES
//
//
//pair 2 :
//1) 
//32645
//2) 
//3562
//32645      3562      NO
//
//
//pair 3 :
//1) 
//123
//2) 
//32112
//123      32112      YES
//
//
//pair 4 :
//1) 
//1003
//2) 
//3274
//1003      3274      NO
//
//
//pair 5 :
//1) 
//1012
//2) 
//1042
//1012      1042      NO
//
//
//finished






שאלה מס' 2.

א. כתבו פונקציה המקבלת מספר כלשהו ומחזירה true, אם המספר הוא ראשוני ו- false
אחרת.

ב. כיתבו תכנית הקולטת N זוגות מספרים. התכנית תדפיס "אוסף ראשוני" אם בכל זוג יש
לפחות איבר אחד ראשוני, אחרת , יודפס "אוסף פריק". על התכנית להשתמש בפונקציה
שכתבת בסעיף א'.



public class T2
    {
        
//      א)
        
        public static boolean isPrime(double num)
        {   //input: a double number (num)
            //output: returns true if num is prime, otherwise return false
            
            if(num < 2)
                return false;
            
            for(int i = 2; i <= Math.sqrt(num); i++)
                if(num % i == 0)
                    return false;
            return true;
        }
        
        
//      ב)
        
        public static void main(String[] args)
            {   //input: integer number (n) , double numbers (num1, num2)
                //output: prints "prime collection" if all numbers in n pairs are prime, otherwise prints "divisible collection"
                
                int n;
                double num1, num2;
                boolean prime_c = true;                  // prime collection or not
                
                Scanner input = new Scanner(System.in);
                System.out.println("enter number: ");
                n = input.nextInt();
                while(n < 1)
                    {
                        System.out.println("please enter a positive number.");
                        n = input.nextInt();
                    }
                
                for(int i = 1; i <= n; i++)
                    {
                        System.out.println("\n\npair " + i + " :");
                        System.out.print("1) ");
                        num1 = input.nextDouble();
                        System.out.print("2) ");
                        num2 = input.nextDouble();
                        
                        if( !isPrime(num1) && !isPrime(num2) )     // if none of the 2 numbers is prime
                            prime_c = false;
                    }
                
                System.out.println("\n\n" + (prime_c? "prime collection" : "divisible collection") );
                
                input.close();
            }

    }





//enter number: 
//3
//
//
//pair 1 :
//1) 3
//2) 5
//
//
//pair 2 :
//1) 7
//2) 11
//
//
//pair 3 :
//1) 13
//2) 17
//
//
//prime collection





//enter number: 
//3
//
//
//pair 1 :
//1) 3
//2) 24
//
//
//pair 2 :
//1) 16
//2) 5
//
//
//pair 3 :
//1) 21
//2) 19
//
//
//prime collection





//enter number: 
//3
//
//
//pair 1 :
//1) 132
//2) 13
//
//
//pair 2 :
//1) 7
//2) 22
//
//
//pair 3 :
//1) 34
//2) 12
//
//
//divisible collection






//enter number: 
//3
//
//
//pair 1 :
//1) 12
//2) 38
//
//
//pair 2 :
//1) 100
//2) 42
//
//
//pair 3 :
//1) 86
//2) 72
//
//
//divisible collection



שאלה מס' 3.
חיסור ציקלי של מספרים בשורה יוגדר כחיסור בערך מוחלט של כל איבר משכנו משמאל
לימין בצורה מעגלית כמספר האיברים בשורה.
לדוגמא:
.5 2 6 9 הוא 10 5 7 1 השורה איברי של ציקלי חיסור
אם נמשיך לבצע חיסור ציקלי על איברי השורה שנוצרה נקבל לאחר מספר צעדים שורת
אפסים.
לדוגמא:

5 2 6 9
3 4 3 4
1 1 1 1
0 0 0 0

בדוגמא הנוכחית ביצענו 4 צעדים עד אשר הגענו לשורת אפסים.
כיתבו תכנית אשר מוצאת 4 מספרים בתחום מ- 5 עד 10( כולל(, כך שמספר הצעדים עד
לשורת האפסים הוא הגדול ביותר.
הערה: השתמש בפונקציה אשר סופרת את מספר הצעדים עבור שורת מספרים.




public class T3
    {
        public static int stepCount(int a, int b, int c, int d)
        {   //input: four integers (a,b,c,d)
            //output: returns how many steps it takes to zero all 4 numbers using circular subtraction
            
            int count = 0 ;         // step counter
            int temp = a;           // to save the value of a temporarily
            
            while( !(a==0 && b==0 && c==0 && d==0))
                {
                    a = Math.abs(a-b);
                    b = Math.abs(b-c);
                    c = Math.abs(c-d);
                    d = Math.abs(d-temp);
                    temp = a;
                    count++;
                }
            return count;
        }
        
        
        public static int max_steps(int start, int end)
        {   //input: a range for the 4 numbers (start, end)
            //output: returns the maximum possible number of steps for 4 numbers 
            // between start and end to be zeroed using circular subtraction
            
            int steps = 0;
            int maxSteps = 0;
            
            for(int a = start; a <= end; a++)
                for(int b =start ; b <= end; b++)
                    for(int c = start; c <= end; c++)
                        for(int d = start; d <= end; d++)
                            {
                                steps = stepCount(a,b,c,d);
                                
                                if(steps > maxSteps)
                                    maxSteps = steps;
                            }
            return maxSteps;
        }
        
        
        public static void main(String[] args)
            {   //input: none
                //output: prints 4 numbers (5-10) that take the maximum number of steps for them to be zeroed in circular subtraction
                
                int steps = 0;                      // steps taken to zero all four numbers
                int a = 0, b = 0, c = 0, d =0;      // 4 random numbers between 5 - 10 (including)
                int maxSteps = max_steps(5,10);
                
                    while (steps < maxSteps)
                        {
                            a = (int) (Math.random() * 6) + 5;
                            b = (int) (Math.random() * 6) + 5;
                            c = (int) (Math.random() * 6) + 5;
                            d = (int) (Math.random() * 6) + 5;
                            
                            steps = stepCount(a, b, c, d);
                        }
                    System.out.println(String.format("max steps = %2d  , for  a=%2d    b=%2d    c=%2d    d=%2d",maxSteps,a,b,c,d));
            }
        
    }





//max steps =  7  , for  a= 6    b=10    c= 8    d= 7
//
//max steps =  7  , for  a= 7    b= 6    c= 5    d= 9
//
//max steps =  7  , for  a= 8    b=10    c= 6    d= 7
//
//max steps =  7  , for  a= 9    b= 5    c= 7    d= 8
//
//max steps =  7  , for  a= 8    b= 7    c= 6    d=10
//
//max steps =  7  , for  a= 5    b= 9    c= 7    d= 6
//
//max steps =  7  , for  a= 7    b= 8    c= 9    d= 5
//
//max steps =  7  , for  a= 7    b= 9    c= 5    d= 6
//
//max steps =  7  , for  a= 7    b= 8    c=10    d= 6
//
//max steps =  7  , for  a=10    b= 6    c= 8    d= 9
//
//max steps =  7  , for  a= 6    b= 5    c= 9    d= 7
//
//max steps =  7  , for  a= 6    b= 8    c= 9    d=10
//
//max steps =  7  , for  a= 6    b= 7    c= 9    d= 5
//
//max steps =  7  , for  a=10    b= 9    c= 8    d= 6
//
//max steps =  7  , for  a= 9    b= 8    c= 7    d= 5
//
//max steps =  7  , for  a= 7    b= 6    c=10    d= 8








//******************************************************************************************************************************

//  ******************     DRAFTS     *******************
//
//  example for  a= 6    b= 8    c= 9    d=10
//
//a= 2  b= 1  c= 1  d= 4  count= 1
//a= 1  b= 0  c= 3  d= 2  count= 2
//a= 1  b= 3  c= 1  d= 1  count= 3
//a= 2  b= 2  c= 0  d= 0  count= 4
//a= 0  b= 2  c= 0  d= 2  count= 5
//a= 2  b= 2  c= 2  d= 2  count= 6
//a= 0  b= 0  c= 0  d= 0  count= 7
//
//steps= 7





//int steps = 0;
//int maxSteps = 0;
//int x = 0, y = 0, z = 0, w = 0;
//
//for(int a = 5; a <= 10; a++)
//    for(int b = 5; b <= 10; b++)
//        for(int c = 5; c <= 10; c++)
//            for(int d = 5; d <= 10; d++)
//                {
//                    steps = stepCount(a,b,c,d);
//                    
//                    if(steps > maxSteps)
//                        {
//                            maxSteps = steps;
//                            x = a;
//                            y = b;
//                            z = c;
//                            w = d;
//                            
//                            System.out.println("current max: " + x + "  " + y + "  " + z + "  " + w + "   maxSteps = " + maxSteps);
//                        }
//                }


//current max: 5  5  5  5   maxSteps = 1
//current max: 5  5  5  6   maxSteps = 4
//current max: 5  5  6  8   maxSteps = 6
//current max: 5  6  7  9   maxSteps = 7



//******************************************************************************************************************************




//******************************************************************************************************************************
//
//
//int steps = 0;
//int a = 0, b = 0, c = 0, d =0;
//
//for(int i = 1; i <= 100; i++)
//    {
//        System.out.print( i + ")  ");
//        while(steps < 7)
//            {
//                a = (int)(Math.random() * 6) + 5;
//                b = (int)(Math.random() * 6) + 5;
//                c = (int)(Math.random() * 6) + 5;
//                d = (int)(Math.random() * 6) + 5;
//                
//                steps = stepCount(a,b,c,d);
//            }
//        System.out.println("max steps (7 steps) for  a=" + a + "\tb=" + b + "\tc=" + c + "\td=" + d);
//        steps = 0;
//    }



//1)  max steps (7 steps) for  a=8    b=7 c=5 d=9
//2)  max steps (7 steps) for  a=9    b=7 c=6 d=5
//3)  max steps (7 steps) for  a=5    b=6 c=7 d=9
//4)  max steps (7 steps) for  a=9    b=8 c=6 d=10
//5)  max steps (7 steps) for  a=9    b=8 c=6 d=10
//6)  max steps (7 steps) for  a=9    b=8 c=6 d=10
//7)  max steps (7 steps) for  a=5    b=6 c=7 d=9
//8)  max steps (7 steps) for  a=8    b=7 c=6 d=10
//9)  max steps (7 steps) for  a=8    b=7 c=6 d=10
//10)  max steps (7 steps) for  a=7   b=8 c=10    d=6
//11)  max steps (7 steps) for  a=5   b=9 c=7 d=6
//12)  max steps (7 steps) for  a=6   b=10    c=8 d=7
//13)  max steps (7 steps) for  a=9   b=8 c=7 d=5
//14)  max steps (7 steps) for  a=6   b=8 c=9 d=10
//15)  max steps (7 steps) for  a=7   b=5 c=9 d=8
//16)  max steps (7 steps) for  a=5   b=9 c=8 d=7
//17)  max steps (7 steps) for  a=8   b=7 c=5 d=9
//18)  max steps (7 steps) for  a=8   b=9 c=10    d=6
//19)  max steps (7 steps) for  a=7   b=6 c=10    d=8
//20)  max steps (7 steps) for  a=9   b=10    c=6 d=8
//21)  max steps (7 steps) for  a=6   b=10    c=8 d=7
//22)  max steps (7 steps) for  a=8   b=7 c=5 d=9
//23)  max steps (7 steps) for  a=8   b=10    c=6 d=7
//24)  max steps (7 steps) for  a=8   b=9 c=10    d=6
//25)  max steps (7 steps) for  a=7   b=6 c=5 d=9
//26)  max steps (7 steps) for  a=8   b=10    c=6 d=7
//27)  max steps (7 steps) for  a=7   b=8 c=10    d=6
//28)  max steps (7 steps) for  a=9   b=8 c=6 d=10
//29)  max steps (7 steps) for  a=6   b=7 c=9 d=5
//30)  max steps (7 steps) for  a=10  b=9 c=8 d=6
//31)  max steps (7 steps) for  a=8   b=7 c=6 d=10
//32)  max steps (7 steps) for  a=5   b=6 c=7 d=9
//33)  max steps (7 steps) for  a=10  b=8 c=7 d=6
//34)  max steps (7 steps) for  a=7   b=9 c=5 d=6
//35)  max steps (7 steps) for  a=6   b=10    c=9 d=8
//36)  max steps (7 steps) for  a=9   b=5 c=6 d=7
//37)  max steps (7 steps) for  a=7   b=8 c=10    d=6
//38)  max steps (7 steps) for  a=10  b=8 c=7 d=6
//39)  max steps (7 steps) for  a=8   b=9 c=10    d=6
//40)  max steps (7 steps) for  a=7   b=6 c=10    d=8
//41)  max steps (7 steps) for  a=6   b=7 c=9 d=5
//42)  max steps (7 steps) for  a=5   b=6 c=7 d=9
//43)  max steps (7 steps) for  a=10  b=6 c=8 d=9
//44)  max steps (7 steps) for  a=8   b=7 c=6 d=10
//45)  max steps (7 steps) for  a=7   b=6 c=5 d=9
//46)  max steps (7 steps) for  a=8   b=7 c=6 d=10
//47)  max steps (7 steps) for  a=7   b=8 c=9 d=5
//48)  max steps (7 steps) for  a=6   b=5 c=9 d=7
//49)  max steps (7 steps) for  a=6   b=10    c=8 d=7
//50)  max steps (7 steps) for  a=6   b=5 c=9 d=7
//51)  max steps (7 steps) for  a=5   b=7 c=8 d=9
//52)  max steps (7 steps) for  a=5   b=9 c=7 d=6
//53)  max steps (7 steps) for  a=7   b=8 c=9 d=5
//54)  max steps (7 steps) for  a=7   b=8 c=9 d=5
//55)  max steps (7 steps) for  a=10  b=6 c=7 d=8
//56)  max steps (7 steps) for  a=6   b=8 c=9 d=10
//57)  max steps (7 steps) for  a=8   b=9 c=5 d=7
//58)  max steps (7 steps) for  a=9   b=5 c=7 d=8
//59)  max steps (7 steps) for  a=8   b=6 c=10    d=9
//60)  max steps (7 steps) for  a=9   b=5 c=6 d=7
//61)  max steps (7 steps) for  a=5   b=7 c=8 d=9
//62)  max steps (7 steps) for  a=8   b=7 c=6 d=10
//63)  max steps (7 steps) for  a=6   b=7 c=8 d=10
//64)  max steps (7 steps) for  a=7   b=8 c=10    d=6
//65)  max steps (7 steps) for  a=8   b=10    c=6 d=7
//66)  max steps (7 steps) for  a=9   b=5 c=7 d=8
//67)  max steps (7 steps) for  a=6   b=7 c=9 d=5
//68)  max steps (7 steps) for  a=7   b=5 c=9 d=8
//69)  max steps (7 steps) for  a=9   b=10    c=6 d=8
//70)  max steps (7 steps) for  a=9   b=8 c=7 d=5
//71)  max steps (7 steps) for  a=9   b=5 c=7 d=8
//72)  max steps (7 steps) for  a=5   b=9 c=7 d=6
//73)  max steps (7 steps) for  a=6   b=7 c=8 d=10
//74)  max steps (7 steps) for  a=9   b=7 c=6 d=5
//75)  max steps (7 steps) for  a=9   b=5 c=6 d=7
//76)  max steps (7 steps) for  a=6   b=7 c=8 d=10
//77)  max steps (7 steps) for  a=10  b=8 c=7 d=6
//78)  max steps (7 steps) for  a=8   b=7 c=5 d=9
//79)  max steps (7 steps) for  a=6   b=7 c=8 d=10
//80)  max steps (7 steps) for  a=7   b=8 c=10    d=6
//81)  max steps (7 steps) for  a=10  b=6 c=8 d=9
//82)  max steps (7 steps) for  a=7   b=8 c=9 d=5
//83)  max steps (7 steps) for  a=9   b=5 c=6 d=7
//84)  max steps (7 steps) for  a=8   b=7 c=5 d=9
//85)  max steps (7 steps) for  a=7   b=6 c=10    d=8
//86)  max steps (7 steps) for  a=6   b=10    c=8 d=7
//87)  max steps (7 steps) for  a=5   b=9 c=8 d=7
//88)  max steps (7 steps) for  a=6   b=7 c=8 d=10
//89)  max steps (7 steps) for  a=5   b=9 c=7 d=6
//90)  max steps (7 steps) for  a=7   b=8 c=10    d=6
//91)  max steps (7 steps) for  a=6   b=7 c=8 d=10
//92)  max steps (7 steps) for  a=8   b=9 c=10    d=6
//93)  max steps (7 steps) for  a=6   b=8 c=9 d=10
//94)  max steps (7 steps) for  a=5   b=6 c=7 d=9
//95)  max steps (7 steps) for  a=9   b=5 c=7 d=8
//96)  max steps (7 steps) for  a=8   b=10    c=6 d=7
//97)  max steps (7 steps) for  a=6   b=5 c=9 d=7
//98)  max steps (7 steps) for  a=6   b=10    c=8 d=7
//99)  max steps (7 steps) for  a=8   b=9 c=10    d=6
//100)  max steps (7 steps) for  a=9  b=5 c=6 d=7



//******************************************************************************************************************************

