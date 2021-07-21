package test;

interface EmployeeAddress
{
    String add = "140A, Sector-56" ;
    void address();
}
class AnonymousClass
{
    public static void main(String[] args) 
    {
        Employee1 obj=new Employee1();
        obj.address();     
    }
}
  
class Employee1 implements EmployeeAddress
{
    @Override
    public void address() 
    {
    	System.out.print("Address is "+add);
    }
}
    