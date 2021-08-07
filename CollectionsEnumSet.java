import java.util.*;
enum days{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class CollectionsEnumSet {
	public static void main(String args[])
	{
		Set<days> set = EnumSet.allOf(days.class);
		Iterator<days> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
