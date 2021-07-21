package test;

class A {
	  
    private int emp_id;
    private String emp_name;
  
      
    public A setint(int emp_id)
    {
        this.emp_id = emp_id;
        return this;
    }
  
    public A setstring(String emp_name)
    {
        this.emp_name = emp_name;
        return this;
    }
    void display()
    {
        System.out.println("Employee Details = "
                           + emp_id + " " + emp_name);
    }
}
  
public class MethodChaining {
    public static void main(String[] args)
    {
  
        new A().setint(10).setstring("Preeti").display();
    }
}