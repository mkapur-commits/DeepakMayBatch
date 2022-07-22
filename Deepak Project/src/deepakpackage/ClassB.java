package deepakpackage;

public class ClassB {
	
	public int method1(int a, int b) {
		int c;
		c=a+b;
		System.out.println("Sum result is " + c);
		return c;
		
	}
	
	

	public int method2(int r, int g) {
		int d;
		d=r+g;
		System.out.println("Sum result is " + d);
		return d;
		
	}
	
	

	public int method3(int d, int e) {
		int f;
		f=d-e;
		System.out.println("Sub result is " + f);
		return f;
		
	}
	
	public int method4(int r, int f) {
		int v;
		v=r*f;
		System.out.println("Multi result is " + v);
		return v;
		
	}
	
	public int method5(int r, int f) {
		int v;
		v=r/f;
		System.out.println("Div result is " + v);
		return v;
		
	}
	

	public static void main(String[] args) {
		ClassB anb = new ClassB();
	   int sumresult = anb.method1(10, 2);
		int sumresult2 = anb.method2(sumresult, 2);
		int subresult = anb.method3(sumresult2, 2);
		int multiresult = anb.method4(subresult, 2);
		int divresult = anb.method5(multiresult, 2);
		
		
		
		
		

	}

}
