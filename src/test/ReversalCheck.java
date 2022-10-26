package test;

public class ReversalCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Clean World Green World";
		
		String Result =" ";
		
		for(int index = str.length() -1;index>=0;index--) {
			
			char ch = str.charAt(index);
			Result = Result + ch;
		
	}
		System.out.println("reverse string is " + Result);
		
		
		int num = 12345;
		int res = 0;
		
		while(num>0) {
			
			int rem = num%10;
			
			res = res*10 + rem;
			num =num/10;
		
	}
System.out.println("result int is " + res);
}
}
