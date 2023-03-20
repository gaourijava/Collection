package Task3;

import java.util.HashMap;
import java.util.Map;


public class AWithGeneric 
{
	public static void main(String args[])
	{
		Map<Integer,String>m=new HashMap<>();
		m.put(1, "ABC");
		m.put(2, "PQR");
		m.put(3, "XYZ");
		
		
		for(Map.Entry<Integer, String> e:m.entrySet())
		{
			System.out.println(e);
		}
		
	}

}
