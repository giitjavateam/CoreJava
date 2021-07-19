package javaexamples;
 
class LargestNumber
	{
public static void main(String args[])
    	{       	 
	int n1=8, n2=183, n3=1555;
        
            if(n1>=n2 && n1>=n3)
            	System.out.println(n1 +" is the largest number");
            if(n2>=n1  && n2>=n3)
            	System.out.println(n2 +" is the largest number");
            else
                System.out.println(n3 +" is the largest number");             	
 
    	}           	
	}