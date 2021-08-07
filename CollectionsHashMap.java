import java.util.*;
public class CollectionsHashMap {
	public static void main(String args[])
	{
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101,"Swati");
		map.put(102,"Sweety");
		map.put(103, "Ammy");
		map.put(104, "Ammu");
		System.out.println("Iterating through hashmap");
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		map.putIfAbsent(106,"SS");
		System.out.println("Invoking putIfAbsent() method");

		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		map.remove(101);
		System.out.println("Updated list of elements: "+map);  
		
		map.remove(102, "Sweety");
		System.out.println("Updated list of elements: "+map);
		
		map.replace(106, "SS", "SA");
		System.out.println("Updated list of elements: "+map);  
		
		map.replaceAll((k,v)-> "aa");
		System.out.println("Updated list of elements: "+map);  
		
	}
	

}
