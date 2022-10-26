package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {10,20,30,40,50,60};
		
		System.out.println("the second num is " + array1[1]);
		
		System.out.println("the last num is " + array1[4]);
		
		System.out.println("the total length is " + array1.length);
		
		System.out.println("the last num is " + array1[array1.length-1]);
		
		String[] array2 = {"abc","pqr","xyz"};
	
		
	    String strl = "Clean World Green World";
	    
	    String[] array3 = strl.split(" "); // {"Clean","World","Green","World"}
	    
	    System.out.println("the first word is " + array3[0]);
	    
	}
}