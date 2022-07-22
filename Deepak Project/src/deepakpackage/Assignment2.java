package deepakpackage;

public class Assignment2 {
	
	public int sum(int a, int b) {
		int c;
		c=a+b;
		System.out.println("Value is " + c);
		return c;
		
	}
	

	public int sum1(int a1, int b1) {
		int c1;
		c1=a1+b1;
		System.out.println("Value is " + c1);
		return c1;
		
	}
	
	public int sub(int a3, int b3) {
		int c3;
		c3=a3-b3;
		System.out.println("Value is " + c3);
		return c3;
		
	}
	
	
	public int multi(int a4, int b4) {
		int c4;
		c4=a4*b4;
		System.out.println("Value is " + c4);
		return c4;
		
	}
		
	
	public int div(int a5, int b5) {
		int c5;
		c5=a5/b5;
		System.out.println("Value is " + c5);
		return c5;
		
	}
	
	public static void main(String[] args) {
		
		Assignment2 obj = new Assignment2();
		int sumresult1= obj.sum(2, 10);
		int sumresult2= obj.sum1(sumresult1, 2);
		int subresult=obj.sub(sumresult2, 2);
		int multiresult = obj.multi(subresult, 2);
		int divresult = obj.div(multiresult, 2);
		
		
		
		
		
		
		
		

	}

}
