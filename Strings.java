
public class Strings {
	public static void main(String args[]) {
	String str = "My name is Swati Singhal.";
	String str1 = "Good to see u!.";
	System.out.println(str.charAt(3));
	System.out.println(str.length());
	System.out.println(" "+str.concat(str1));
	System.out.println(str.equals(str1));
	System.out.println(str.compareTo(str1));
	System.out.println(str.replace("Swati", "Sakshi"));
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	System.out.println(str.substring(3));
	System.out.println(str.substring(11,16));
	String s[] = str1.split("\\s+");
	for(int i=0; i<s.length; i++) {
	System.out.println(s[i]);
	}
	String s1[] = str1.split("!");
	for(int i=0; i<s1.length; i++) {
	System.out.println(s[i]);
	}
	
	}
}
