 class parent{
	int id;
	String name;
	public void detail()
	{
		id = 11;
		name = "Swati";
	}
}
class child extends parent{
	public void detail()
	{
		id = 111;
		name = "Sweety";
	}
	void display()
	{
		System.out.println(name + " " +id);
	}
}

public class Overridding {
	public static void main(String args[]) {
		child c = new child();
		c.detail();
		c.display();
	}

}
