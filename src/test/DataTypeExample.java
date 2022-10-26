package test;

public class DataTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 30;
		int num2 = 20;
		

		int sum = num1 + num2;
		int mul = num1 * num2;
		float div = (float) num1 / num2;
		
		System.out.println("the sum of two num is " + sum);
		System.out.println("the mul of two num is " + mul);
		System.out.println("the div of two num is " + div);
		
		String strl = "clean world green world";
		
		System.out.println(strl);
		System.out.println("the length of this string is " + strl.length());

char ch1 = strl.charAt(0);

System.out.println( "the first char is " + ch1);

char chn = strl.charAt(strl.length() -1);
System.out.println( "the last char is " + chn);

	}

}
