package Task5;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CompanyIterator 
{		
	public Map<Integer,Employee> designation()
	{		
		Employee e=new Employee();   //Create new Employee Obj to store attribute values
		Map<Integer,Employee> team=new HashMap<Integer,Employee>();
		Scanner sc=new Scanner(System.in);   //Create Scanner Obj to store user defined values
		System.out.println("Enter Id of Employee");
		e.setId(sc.nextInt());			//set values in Employee Obj using setter
		System.out.println("Enter Name of Employee");
		e.setName(sc.next());
		System.out.println("Enter Salary of Employee");
		e.setSal(sc.nextDouble());
		
		team.put(1, e);  //put e obj in MAP
		return team;
		
	}
	public static void main(String args[])
	{
		Company c=new Company();
		Map<Integer,Employee> team=c.designation();  //call designation method which returns MAP
		Iterator <Integer> itr = team.keySet().iterator(); //Create array obj for itrator of MAP keySet Eg.1

		while(itr.hasNext()) 
		{
			int key=(int)itr.next();  //Assign key attribute to next() value Eg.1
			Employee emm=team.get(key);  //Get value(Employee obj) using MAP key
			System.out.println("Employee Id: "+emm.getId());  //Get id from Employee obj using getter
			System.out.println("Employee Name: "+emm.getName());
			System.out.println("Employee Salary: "+emm.getSal());			
		}			
	}
}
