//If class has private, static, final method it has static binding because compiler knows that these methods can't be 
//overridden and can be accessed only by object of local class.Hence compiler doesn't have any difficulty to determine 
//object of class (local class for sure).


public class StaticBinding {
	private void eat(){
		System.out.println("eating..");
	}
	public static void main(String args[])
	{
		StaticBinding a = new StaticBinding();
		a.eat();
	}

}
