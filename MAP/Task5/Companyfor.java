package Task5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Companyfor
{
    public Map<Integer, Employee> designation()
    {
      Employee e=new Employee();
      Map<Integer,Employee> eMap=new HashMap<>(); 
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Id of Employee");
      e.setId(sc.nextInt());
      System.out.println("Enter Name of Employee");
      e.setName(sc.next());
      System.out.println("Enter Salary of Employee");
      e.setSal(sc.nextDouble());
      eMap.put(1, e);
      return eMap;
    }
	
    public static void main(String args[])
    {       	 
       Companyfor c=new Companyfor();
       Map<Integer,Employee> team=c.designation(); //Create "team" Attribute with Rtype MAP to store MAP method return
       
       Set<Integer> empKeySet = team.keySet();
       for(Integer empKey:empKeySet)
       {    
		   Employee emm=team.get(empKey);       		
		   System.out.println(emm.getId());
		   System.out.println(emm.getName());
		   System.out.println(emm.getSal());		        		
		}      	 
     }
  }

         
         
         
    
    
    


		
		
		
		

	
	
	

