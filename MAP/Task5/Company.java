package Task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Company             //with generic and for each loop 
{
	Employee e=new Employee();
	Map<Integer,Employee> team=new HashMap<>();
	
    public Map<Integer, Employee> designation()
    {
    	 
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Id of Employee");
      e.setId(sc.nextInt());
      System.out.println("Enter Name of Employee");
      e.setName(sc.next());
      System.out.println("Enter Salary of Employee");
      e.setSal(sc.nextDouble());
      team.put(1, e);
      return team;
    }
	
    public static void main(String args[])
    {
        	 
       Company c=new Company();
       Map<Integer,Employee> team2=c.designation();
       for(Entry<Integer, Employee> em:team2.entrySet())
       {
         Set<Integer>s=team2.keySet();
		        for(int i:s)
		        {
		        	Employee emm=team2.get(i);       		
		        	System.out.println(emm.getId());
		        	System.out.println(emm.getName());
		        	System.out.println(emm.getSal());
		        		
		        }      	 
        }
    }
}
         
         
         
    
    
    


		
		
		
		

	
	
	

