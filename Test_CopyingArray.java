
public class Test_CopyingArray {
	public static void main(String args[])
	{
		char[] copyFrom = {
				'H', 'i', ' ', 'S', 'w', 'e', 'e', 't', 'y'
		};
		
		char[] copyTo = new char[6];
		System.arraycopy(copyFrom, 3, copyTo, 0, 6);
		System.out.println(String.valueOf(copyTo));
	}

}
