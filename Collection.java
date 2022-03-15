.1

.2
public static int getTopSum(Stack<Integer>[] stacks) הפעולה את ממשו
הפעולה מקבלת מערך מחסניות של מספרים שלמים ומחזירה את סכום המספרים שנמצאים
בראשי המחסניות שבמערך.
שימו לב: יתכן שהמחסנית תהיה ריקה ולכן אין לה מספר בראש המחסנית.

.3
ממשו את הפעולה:
boolean isSorted (Vector<Integer> v)
המקבלת וקטור של מספרים שלמים ומחזירה true אם הוקטור ממוין בסדר עולה. אחרת,
הפעולה תחזיר false .

.4
ממשו את הפעולה:
ArrayList<Integer> merge (ArrayList<Integer> a, ArrayList<Integer> b)
המקבלת שתי רשימות של מספרים שלמים b,a ומחזירה רשימה אחת ממויינת של כל
המספרים בשתי הרשימות.

.5
ממשו את הפעולה:
LinkedList<String> reversePairs (LinkedList<String> l)
המקבלת רשימה מקושרת של מחרוזות l ומחזירה רשימה חדשה כך שכל זוג מחרוזות
בסדר הפוך. אין לשנות את הרשימה l.
שים לב: אורך הרשימה l יכול להיות אי-זוגי. במקרה זה,
האיבר האחרון יישאר במקומו )אחרון(
לדוגמא:
Benny -> Begin -> Avi -> Israeli -> Ariana -> Grande : l הרשימה עבור
Begin -> Benny -> Israeli -> Avi -> Grande -> Ariana :ה



package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import unit4.collectionsLib.Stack;

public class main2 {
	
	//targil 1
	public static Stack<Integer> count(Stack<String> s){
		
		Stack<String> t= new Stack<String>();
		Stack<Integer> i = new Stack<Integer>();
		while(!s.isEmpty()) {
			String word=s.pop();
			t.push(word);
			int count=0;
			while(word.length()>0) {
				count++;
				word=word.substring(1);
			}
			
			i.push(count);
			count=0;
		}
		while(!t.isEmpty()) {
			s.push(t.pop());
		}
		
		return i;
	}
	//targil 2
	public static int sumHeads(List<Stack<Integer>> s){
		int sum=0;
		for(Stack<Integer> t:s) {
			if(!t.isEmpty()) {
				sum+=t.top();
			}
		System.out.println(t);
		}
		
		return sum;
	}
	//targil 3
	public static boolean isSorted (Vector<Integer> v) {
		int min = v.firstElement();
		boolean res=true;
		 for (int i = 1; i < v.size(); i++){
			 if(min<v.get(i)) {
				 min=v.get(i);
			 }else {
				 res=false;
			 }
		 }
		 
		return res;
	}
	//targil 4
	public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
		
		ArrayList<Integer> t = new ArrayList<Integer>();
		
		for(int a1:a) {
			t.add(a1);
		}
		for(int b1:b) {
			t.add(b1);
		}
		Collections.sort(t);
		return t;
	}
	
	//targil 5
	public static LinkedList<String> reversePairs(LinkedList<String> l){
	LinkedList<String> first=new LinkedList<>();
	
	for(int i=0;i<l.size()-1;i+=2) {
			String temp = l.get(i);
			first.add(i, l.get(i+1));
			first.add(i+1, temp);
	}
	return first;
	
	}
	
	
	public static void main(String[]args) {
		
		//targil 1
		Stack<String> s1 = new Stack<String>();
		
		s1.push("Maradona");
		s1.push("Pele");
		s1.push("Messy");
		s1.push("Ron");
		
		
		//targil 2
		Stack<Integer> i1 = new Stack<Integer>();
	
		Stack<Integer> i2 = new Stack<Integer>();
		i2.push(1);
		i2.push(1);
		i2.push(5);
		Stack<Integer> i3 = new Stack<Integer>();
		i3.push(1);
		i3.push(5);
		Stack<Integer> i4 = new Stack<Integer>();
		i4.push(1);
		i4.push(1);
		i4.push(5);
		
		List<Stack<Integer>> lstStack = new ArrayList<Stack<Integer>>();
		lstStack.add(i1);
		lstStack.add(i2);
		lstStack.add(i3);
		lstStack.add(i4);
		
		System.out.println(sumHeads(lstStack));
		
		
		//targil 3
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		System.out.println(isSorted(v));
		
		//targil 4
		
		ArrayList<Integer> t1 = new ArrayList<Integer>();
		t1.add(1);
		t1.add(15);
		t1.add(-9);
		ArrayList<Integer> t2 = new ArrayList<Integer>();
		t2.add(-1);
		t2.add(5);
		t2.add(9);
		System.out.println(merge(t1, t2));
		
		
		//targil 5
		LinkedList<String> ll = new LinkedList<String>();
		 
        // Adding elements to the linked list
        ll.add("Benny");
        ll.add("Begin");
        ll.add("Avi");
        ll.add("Israeli");
        ll.add("Ariana");
        ll.add("Grande");
        
        System.out.println(reversePairs(ll));
	}

}
