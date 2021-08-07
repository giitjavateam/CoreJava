import java.util.*;

public class CollectionsDequeue {
	public static void main(String args[])
	{
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("Swati");
		dq.add("Singhal");
		dq.offer("ji");
		dq.pollLast();
		for(String d:dq){  
	        System.out.println(d);  
	    } 
		
	}

}
