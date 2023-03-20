package MAPTask4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//without generic
public class CollegeWithoutGenric {
	
   Scanner sc = new Scanner(System.in);
   Student s1 = new Student(); //first student
   Map<Integer, String> eng = new HashMap();
 
	
	public void m1() {
		
		System.out.println("Enter roll no of student 1");
		s1.setRollno(sc.nextInt());
		
		System.out.println("Enter Name of student 1");
		s1.setName(sc.next());
		
		eng.put(s1.getRollno(),s1.getName());
		for (Map.Entry e : eng.entrySet())// Traversing of the elements through the Map   
        {   
            System.out.println(e.getKey() +" =>  "+ e.getValue());   
        } 
		
	}
	
	public static void main(String args[]) {
		CollegeWithoutGenric c = new CollegeWithoutGenric();
		c.m1();		
	}

}
