
public class MultithreadingRuntimeClass {
	public static void main(String args[])throws Exception{  
		  Runtime r=Runtime.getRuntime();  
		  System.out.println("Total Memory: "+r.totalMemory());  
		  System.out.println("Free Memory: "+r.freeMemory());  
		  System.out.println(Runtime.getRuntime().availableProcessors());
		  System.out.println(r.availableProcessors());  
		  for(int i=0;i<10000;i++){  
		   new MultithreadingRuntimeClass();  
		  }  
		  System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());  
		  System.gc();  
		  System.out.println("After gc(), Free Memory: "+r.freeMemory());  
		 }  

}
