abstract class shape1{
	abstract void draw1(); {}
	shape1(){
		System.out.println("object created");
	}
	void fun()
	{
		System.out.println("Non- abstract method");
	}
}
class Rect extends shape1{
	void draw1()
	{
		System.out.println("Draw rectangle");
	}
}
class Square1 extends shape1{
	void draw1()
	{
		System.out.println("Draw Square");
	}
}
public class TestAbstraction {
	public static void main(String args[])
	{
		shape1 s = new Rect();
		s.draw1();
		s.fun();
		shape1 s1 = new Square1();
		s1.draw1();
		s1.fun();
	}

}
