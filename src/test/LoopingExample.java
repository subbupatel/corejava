package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =2;
		
		while(num<=10)
		{
			if(num==6) {
				
				num = num+2;
				break
				;
			}
			
		System.out.println(num);
		 num = num+2;
		
		}
		System.out.println("after while loop");
		
		// for loop
		for(int index =1;index<=10;index++)
		{
			
			System.out.println(index);	
		}
		System.out.println("after while loop");
		
		int[] array1 ={10,20,30,40,50,60};
		
		for(int index =0;index<=array1.length-1;index++)
			
				{
			System.out.println(array1[index]);
		}
		
	}
}


