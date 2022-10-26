package Oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   Employee E1 = new Employee("subbu", 1000, "engg", 7896);
   E1.Display();
   
   Employee E2 = new Employee();
   E2.Name = "patel";
   E2.EmpId = 1509;
   E2.Salary = 12345;
   
   System.out.println(E2.Name);
   System.out.println(E2.EmpId);
   System.out.println(E2.Salary);
   
   Bank B = new Bank();
   
   B.DisplayBalance();
    
   int Bal = B.GetBalance();
   
   System.out.println("The Balance is " + Bal);
   System.out.println("The Balance is " + B.GetBalance());
    
   BOABank B1 = new BOABank();
   
   B1.CCBalance();
   B1.DisplayBalance();

   OverLoadingExample obj = new OverLoadingExample(); 
  
   
   
	   int RecArea = obj.GetArea(4 ,7);
	   
	   int SqArea = obj.GetArea(4,5);
	   
	   System.out.println("the Recarea is " + RecArea);
	   System.out.println("the Sqarea is " + SqArea);
	   
	   EncapsulationEx En = new EncapsulationEx();
	  En.setBalance(4000);
	  System.out.println(En.getBalance());
   }
   
	}


