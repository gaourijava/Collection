package Task1Q2WithGeneric;

import java.util.HashMap;
import java.util.Map;

public class A 
{
	public static void main(String args[])
	{
		Map<String,String>m=new HashMap<>();
		m.put("aa"  , "abc");
		m.put("bb"  , "pqr");
		m.put("cc"  , "xyz");
		
		System.out.println(m);         //{aa=abc, bb=pqr, cc=xyz}
		
		System.out.println(m.get("aa"));    //abc
		System.out.println(m.get("bb"));        //pqr
		System.out.println(m.get("cc"));         //xyz
		
		
		for(Map.Entry<String,String>e:m.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());       //aa abc
			                                                      //bb pqr
			                                                        //cc xyz
		}
	}

}
