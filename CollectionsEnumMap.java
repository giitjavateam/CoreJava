import java.util.*;

public class CollectionsEnumMap {
	public enum Days{
		Monday, Tuesday, Wednesday;
	}
	public static void main(String args[])
	{
		EnumMap<Days, String>  map= new EnumMap<Days, String>(Days.class);
		map.put(Days.Monday, "1");
		map.put(Days.Tuesday, "2");
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey() + " " +m.getValue());
		}
		
	}

}
