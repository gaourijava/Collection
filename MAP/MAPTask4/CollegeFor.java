package MAPTask4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollegeFor {     // task 3     //for each loop
	
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
		CollegeFor c = new CollegeFor();
		Map<Integer,String> eng = c.m1();
		
		for (Map.Entry<Integer, String> e : eng.entrySet())// Traversing of the elements through the Map   
        {   
            System.out.println(e.getKey() +" =>  "+ e.getValue());   
        }
	}

}
