package test;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {2,5,7};
		int num =10;
		
try {
		int res = num/0;	
		System.out.println(array[5]);	
		
	}
   catch(ArrayIndexOutOfBoundsException e) {
	   
	   System.out.println("inside the array catch block");
	}
catch(ArithmeticException e) {
	   
	   System.out.println("inside the arithmetic catch block");
	}
finally {
System.out.println("inside finaaly");
}
System.out.println("after exception");
	
}
}