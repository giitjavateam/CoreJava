
public class Wrapper_Class {
	public static void main(String args[])
	{
		int i = 20;
		char c = 'A';
		Integer in = Integer.valueOf(i);// primitive method of boxing
		int a = in.intValue();//primitive method of unboxing
		Integer inn = a;//auto boxing
		int b = in;//auto unboxing
		System.out.println(i + " "+ in+ " " + a + " " +inn +" " + b);
		Character ch = Character.valueOf(c);
		char l = ch.charValue();
		Character chh = l;
		char m = chh;
		System.out.println(c + " "+ ch+ " " + l + " " + chh+ " "+m);
	}

}
