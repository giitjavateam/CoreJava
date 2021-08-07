import java.util.*;
public class CollectionsHashSet {
	public static void main(String args[])
	{
		HashSet<String> h = new HashSet<String>();
		h.add("hi");
		h.add("Swati");
		h.add("Sweety");
		h.add("Ammmy");
		h.add("Sweety");
		
		h.remove("Sweety");
		Iterator<String> i = h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
