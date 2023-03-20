package MapLambda;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A 
{
	public static void main(String args[])
	{
		Map<Integer,String>m=new LinkedHashMap<Integer,String>();
		m.put(10,"ABC" );
		m.put(20,"MNO" );
		m.put(30,"PQR" );
		m.put(40,"XYZ" );
		
		Set<Integer>s=m.keySet();
		s.forEach((a)->
		{
			String n=m.get(a);
			System.out.println(a);
			System.out.println(n);
			
		});
		
	}

}
