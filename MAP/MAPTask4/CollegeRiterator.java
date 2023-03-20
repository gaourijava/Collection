package MAPTask4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;  //task3  use of return and iterator


public class CollegeRiterator {    //with generic using iterator
	
   Scanner sc = new Scanner(System.in);
   Student s1 = new Student(); //first student
   Map<Integer, String> eng = new HashMap<Integer, String>();
 
	
	public Map<Integer,String> m1() {
		
		System.out.println("Enter roll no of student 1");
		s1.setRollno(sc.nextInt());
		
		System.out.println("Enter Name of student 1");
		s1.setName(sc.next());
		
		eng.put(s1.getRollno(),s1.getName());
		return eng;
		
		 
		
	}
	
	public static void main(String args[]) {
		CollegeRiterator c = new CollegeRiterator();
		Map<Integer,String> eng = c.m1();
		
		Iterator itr = eng.entrySet().iterator();
		
		while(itr.hasNext())// Traversing of the elements through the Map   
        {   
            System.out.println(itr.next()); 
        }
	}

}
