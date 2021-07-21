import java.util.*;

class Student{
	int rollno;
	String name;
	
}
class Marks extends Student{
	int marks1;
	int marks2;
	void in()
	{
		Scanner sc = new Scanner(System.in);
		 rollno = sc.nextInt();
		 name = sc.next();
		 marks1 = sc.nextInt();
		 marks2 = sc.nextInt();
	}
	void display()
	{
		System.out.println(rollno + " " + name + " " + marks1 + " " + marks2);
	}
}
public class singleInherit {
	public static void main(String args[])
	{
		
		Marks m = new Marks();
		m.in();
		m.display();
	}
	

}
