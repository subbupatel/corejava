package Oops;

public class Employee {
	
	public String Name;
	public int EmpId;
	public String Dept;
	public int Salary;
	
	public Employee() {
		System.out.println("inside default constr");
		
	}
	
	public Employee(String P1, int P2, String P3, int P4) {
		
		Name = P1;
		EmpId = P2;
		Dept = P3;
		Salary = P4;
}
	public void Display() {
		
		
		System.out.println(Name);
		System.out.println(EmpId);
		System.out.println(Dept);
		System.out.println(Salary);
		
		
}
}