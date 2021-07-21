class A4{
	A4 fun()
	{
		System.out.println("I am in class A");
		return new A4();
	}
}
class B4 extends A4{
	B4 fun()
	{
		System.out.println("I am in class B");
		return new B4();
	}
}
public class Test_Covarient {
	public static void main(String args[])
	{
		A4 a = new A4();
		a.fun();
		
		B4 b = new B4();
		b.fun();
	}
}
