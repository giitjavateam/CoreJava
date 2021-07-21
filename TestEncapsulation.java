// Encapsulation is wrapping up of code and data together in a single unit.
//We can achieve a fully encapsulated class by making all the data members private.
//private data members can only be accessed within the class.
class Account{
	private long acc_no;
	private String name;
	private String branch;
	
	public long getAcc_no()
	{
		return acc_no;
		
	}
	public void set_Accno(long acc_no)
	{
		this.acc_no = acc_no;
	}
	public String getName() {  
	    return name;  
	}  
	
	public void setName(String name) {  
	    this.name = name;  
	}  
	
	public String get_branch() {  
	    return branch;  
	}  
	public void set_branch(String branch) {  
	    this.branch = branch;  
	}  
}
public class TestEncapsulation {
	public static void main(String args[])
	{
		Account a = new Account();
		a.set_Accno(126980807);
		a.setName("Swati");
		a.set_branch("Bahadurgarh");
		System.out.println("Details are:");
		System.out.println("Acc no" + a.getAcc_no() + "\n" + "Name:" + a.getName() + "\n" +  "Branch:" + a.get_branch());
	
	}
	

}
