package test;

public class test01 {
	
	public static void rec3(int n1,int n2,int n3) {
		if(n3==0) {
			System.out.println("stop0");
		}else {
			System.out.println("n1="+n1);
			rec3(n1+n2,n2,n3-1);
			System.out.println("n1="+n1);
		}
	}// 4 3 2 1 stop 1 2 3 4
	
	public static void rec31(int n1,int n2,int n3) {
		int count =n3;
		while(count!=0) {
			System.out.println(n1);
			n1=n1+n2;
			count-=1;
		}
		System.out.println("stop");
	}
	
	
	public static int rec (int n) {  
		System.out.println(n);
		if (n==0)
			return -2;//n == 1 
		if (n==1) //n == 1 
			return 1;
		return rec(n-1)+rec(n-2);
		//x=1	// rec(1) 
		//x=2	// rec(1)   +   rec(x-2); === 2
		//x=3	// rec(2) + rec(x-2); === 3
	}//3
	
	
	public static int rec1 (int k,int n) {  //6 8
		if (n==k)
			return k; // 2
			if (n>k)
				return rec1 (k, n-k);// 6 2
			return rec1 (k-n, n); //4 2  2 2    
		}//2
	
	
	public static int rec2 (int k,int n) {  
		if (n==0)
			return 1;//
		return k* rec1 (k, n-1);  //3 * 3 3  9 * 3 2  27 3 1  81 3 0  
	}//81
	
	
	public static void rec4 (int n){//8
	if (n>9)// 10 10
		System.out.println ( n);//10 11
	else{
		System.out.println ( n);//8 9
	rec4(n+2);// 10 11
		System.out.println ( n); // 8 9
	rec4(n+1);// 9 10 9
		System.out.println ( n); //10 9 8
	}
}//8 10 8 9 11 9 10 9 8
	
	
public static int f (int n){
	if (n<=0)//0 -1
		return 2;//
	return f (n-1) * f (n-2);//2 1 0 
//f(1)	// 2 *  (1 - 2) return 2
//f(1)	// 2 *  2  == 4
//	//-----
//f(2)	// 4 * (2 - 2) return 2
//f(2)	// 4 * 2 == 8
//	//-----
//f(3)	// 8 * (3 - 2) == 8 goes again in f(1) return 4
//f(3)	// 8  * 4 == 32 
}//32

//multiplyer x and y
public static int mul(int a , int b) {
	if(b==0) return 0;
	return a+mul(a,b-1);
}

//sum from 1 to n
public static int sum(int a) {//3
	if(a==1) return 1;
	return sum(a-1)+a;// 3 5 6
}


//sum from 1 to n
public static void charBetween(char a,char b) {//a c
		if((int) a < 64 && (int)a >91 || 
			(int) a < 96 && (int)a > 123 ||
			(int) b < 64 && (int)b > 91 || 
			(int) b < 96 && (int)b > 123) {
			return;
		}
		if(a+1==b || b+1==a) {
			return;
		}
		if(a<b) {
			System.out.println((char)(a+1));
			charBetween((char)(a+1), b);
		}else {
			System.out.println((char)(b+1));
			charBetween(a, (char)(b+1));
		}
}//b

//sum digits
public static int sum_dig(int a) {
	if(a==0) return 0;
	if(a<10)
		return a;
	return a%10 + sum_dig(a/10);
}

//count digits
public static int count_dig(int a) {

	if(a<10)
		return 1;
	return 1 + count_dig(a/10);
}

//count even digits
public static int count_dig_even(int a) {
	if(a<10){
		if(a%2==0) {
			return 1;
		}
		return 0;
	}
	else if(a%2==0)
		return 1 + count_dig_even(a/10);
	return count_dig_even(a/10);
}


//check if digits asc order
public static boolean asc_dig(int a) {
	if(a<10) {
		return true;
	}
	if(a%10 <= (a/10)%10) {
		return false;
	}
		return asc_dig(a/10);
	
}

//check even digits
public static boolean check_dig_even(int a) {
	if(a==0){
		return true;
	}
	if(a%2!=0) {
		return false;
	}
		return  check_dig_even(a/10);
}

//check if one even digit
public static boolean check_dig1_even(int a) {
	if(a==0){
		return false;
	}
	if(a%2==0) {
		return true;
	}
		return  check_dig1_even(a/10);
}


//print array
private static void print1(int[] a, int i) {
	if(i==a.length)
		return;
	System.out.println(a[i]+ " , ");
	print1(a,i+1);
}

//print array reverse
private static void print1b(int[] a, int i) {
	if(i==a.length)
		return;
	print1(a,i+1);
	System.out.println(a[i]+ " , ");

}

//print array
private static void print2(int[] a, int length) {
	if(length==0)
		return;
	System.out.println(a[length-1]+ " , ");
	print2(a,length-1);
}
//print array reverse 
private static void print1bb(int[] a, int i) {
	if(i==0)
		return;
	System.out.println(a[i-1]+ " , ");
	print1(a,i-1);
}

//sum array 
private static int sum_array(int[] a, int length) {
	if(length==0)
		return 0;
	return a[length-1]+sum_array(a,length-1);
}

//div 10  array 
private static int div10_array(int[] a, int length) {
	if(length==1)
		return 0;
	if((a[length-1]+a[length-2])%10==0) {
		return 1+div10_array(a,length-1);
	}
	return div10_array(a,length-1);
}

//two small neigbour numbers
private static void small_array(int[] a, int length) {
	if(length<=2)
		return;
	if(a[length-1]>a[length-2] && a[length-3]>a[length-2]) {
		System.out.println(a[length-2]);
	}
	 small_array(a,length-1);
}

//compare 2 arrays
private static boolean compare_arr(int[] a, int[] b,int length) {
	if(length==0) {
		return true;
	}
	if(a[length-1]!=b[length-1]) {
		return false;
	}
	return compare_arr(a, b, length-1);
}
//compare 2 arrays if reversed
private static boolean compare_arr_reversed(int[] a, int[] b,int length) {
	if(length==0) {
		return true;
	}
	if(a[length-1]!=b[(length-1)-(length)+1]) {
		return false;
	}
	return compare_arr_reversed(a, b, length-1);
}

//reverse string
 public static void reverse_string(String str) {
	 if(str.length()==0) {
		 return;
	 }
	 System.out.println(str.length()-1);
	 reverse_string(str.substring(0,str.length()-1));
 }
 
//reverse string
public static String reverse_string1(String str) {
	 if(str.length()==0) {
		 return str;
	 }
	 return reverse_string1(str.substring(1)+str.charAt(0));
}

//count times char in string
public static int char_string(String str,char ch) {
	 if(str.length()==0) {
		 return 0;
	 }
	 if(ch == str.charAt(0)) {
		 return 1+char_string(str, ch);
	 }
	 return char_string(str, ch);
}

public static void print3(int a)//31
{
if (a>10)
{
print3(a-2); // 31 29 27 25 23 21 19 17 15 13 11 9
System.out.println (a); // 11 13 15 17 19 21 23 25 27 29 31
}
}

public static void func(int n,int []a){
if (n<4)// 3 4 3 4
for( int i = 1;i<= 3; i++){
a[i-1] = i ; // a[0] = 1 a[1] = 2 a[2] = 3
func(n+1,a);// 4
}
else
System.out.println (a[0]+" "+a[1]+" "+a[2]);
}//1 0 0
// 1 2 0
// 1 2 3

public static void print5(int a){//-6
if (a<0) {//-6 -4 -2 0
	if (a % 5==0)
		print5(a-1);
else
	print5(a+2);// -6 -4 -2 0
System.out.println (a);//-2 -4 -6
 }
}

	public static void main(String[]args) {
		//rec31(100,-5,10);
	//	System.out.println(rec1(6,8));
		
		//rec4(8);
		//System.out.println(sum(3));
		//charBetween('c','a');
		//System.out.println(func(2,3));
		//System.out.println(func(3,2));
		//System.out.println(func(5,0));
		//System.out.println(func(9,-1));
		//System.out.println(func(2,-4));
	
		
		int[] v=new int[N];
		int i;
		for(i=0;i<N;i++)
		v[i]=i+1;
		fun(v,N,0);
	}

	
	//{6,5,4,4,5,1}; 6 0
	static int funcB(int vec[],int size,int i) {
		int a; // 
		if( size==0) //
			return 0;
		a=vec[i];//6
		if(size>1)//6
			if(vec[i]<vec[1])//6 < 5
				size=1;

		return a+funcB(vec,size-1,i+1);//15
		}
	
	static long func(long a,long b){//9-1
	long ans;
	if (a == 0) {
		ans = 0;
	}else
		if (b == -1) {
			ans = 1;

		}else{
			if (b < -1)
				b = -(b+2);
			if (b == 0)
				ans = a;
			else
				if (b % 2 == 0)
					ans = func(a*a,b/2)/a;
				else
					ans = func(a*a,b/2);

		}
	return ans;//8
	}
	//{12,10,30,50,20,100}; ,int b[]=new int [2]; , 6
	public static void fun(int a[],int b[],int n){
	if (n==2){
		b[0] = a[0];
		b[1] = a[1];
	if (a[0]>a[1]){
		b[0]=a[1];
		b[1]=a[0];
	}}else
		fun(a,b,n-1);
		if (b[0]<a[n-1]){
			if (b[1]<a[n-1])
			{
				b[0]=b[1];
				b[1]=a[n-1];
	}else
		b[0]=a[n-1];
		}
	}//50
	
	//(15369(func)
	public static long func(long num){
	int i=0;
	long high,low,mul,temp = num;
	System.out.println(temp);
	if ((num<10)&&(num>=0))
		return num;
	mul=1;
	while ((temp/=10)!=0){
		i++;
		mul*=10;
	}
	high = num/mul;
	low = num%10;
	temp = (num - high*mul)/10;
	return (high+low*mul+func(temp)*10);
	}//96356
	
	static final int N=2;
	public static void swap(int []v,int i,int j) {
	int t;
	t=v[i];
	v[i]=v[j];
	v[j]=t;
	}
	public static void fun(int []v,int n,int i) {
	int j;
	if(i==n) {
	for(j=0;j<n;j++)
	System.out.print(v[j]+" ");
	System.out.println();
	}
	else
	for(j=i;j<n;j++) {
	swap(v,i,j);
	fun(v,n,j+1);
	swap(v,i,j);
	}//1 2 
	//2 1

	}

	
}
