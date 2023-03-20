package Task5;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CompanyTrial          //For and While mix
{
	Employee em=new Employee();   //Create new Employee Obj to store attribute values
	Scanner sc=new Scanner(System.in);   //Create Scanner Obj to store user defined values
	Employee e[] = new Employee[2];
	Map<Integer,Employee>team=new HashMap<Integer,Employee>();
	
	public Map<Integer,Employee> designation()
	{		
		for(int i = 1; i<e.length; i++) {
		
		System.out.println("Enter Id of Employee");
		em.setId(sc.nextInt());			//set values in Employee Obj "e" using setter
		System.out.println("Enter Name of Employee");
		em.setName(sc.next());
		System.out.println("Enter Salary of Employee");
		em.setSal(sc.nextDouble());
		
		e[i] = em;
		team.put(1, e[i]);  //put e obj in MAP
		}
		return team;	//Return MAP obj	
	}
	public static void main(String args[])
	{
		Company c=new Company();
		Map<Integer,Employee> team=c.designation();  //call designation method which returns MAP
		Iterator <Integer> itr = team.keySet().iterator(); //Create array obj for itrator of MAP keySet Eg.1

		while(itr.hasNext()) 
		{
			int mapkey=(int)itr.next();  //Assign key attribute to next() value Eg.1
			Employee emp=team.get(mapkey);  //Get value(Employee obj) using MAP key & store in non-primitive emp
			System.out.println("Employee Id: "+emp.getId());  //Get id from Employee obj using getter
			System.out.println("Employee Name: "+emp.getName());
			System.out.println("Employee Salary: "+emp.getSal());			
		}			
	}
}
