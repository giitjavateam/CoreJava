package test;

import java.util.HashMap;
import java.util.Iterator;

public class GenericHashmap1 {

	 static Integer data;
     static String data1;
     HashMap<Integer, String> hmp = new HashMap<Integer, String>();
	

    
    
	public <T,T1> GenericHashmap1(T data,T1 data1) {
		GenericHashmap1.data = (Integer) data;
		GenericHashmap1.data1 = data1.toString();
		hmp.put(GenericHashmap1.data, GenericHashmap1.data1);
   		System.out.println("Key and Value are: "+hmp);

    }
    
   	public static void main(String[] args) {
		
   		new GenericHashmap1(1, "Neha");
   		
		/*Iterator<Integer> keyIterator = hmp.keySet().iterator();
		while (keyIterator.hasNext()) {
		    Integer key =  keyIterator.next();
		    String value = hmp.get(key);
		    System.out.println("key = " + obj.data + "; value = " + obj.data1);
		}*/
		
		
   	}
   	}