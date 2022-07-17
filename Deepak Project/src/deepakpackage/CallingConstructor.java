package deepakpackage;

public class CallingConstructor {

	
	public CallingConstructor() {
		this(2,4);
		System.out.println("I am a default constructor");
	}
		
	public CallingConstructor(int a) {
		System.out.println("I am a one parameterised constructor");
	}
	 
	public CallingConstructor(int a, int b) {
		this(3,4,5);
		System.out.println("I am a two parameterised constructor");
	}
	
	public CallingConstructor(int d, int e, int f) {
		this(1);
		System.out.println("I am a three parameterised constructor");
	}
	
	public CallingConstructor(int s, int d, int x, int g) {
		System.out.println("I am a four parameterised constructor");
	}
		
		
	public static void main(String[] args) {
		
		
		CallingConstructor obj = new CallingConstructor();
		
		
		
		
		
		
		
		

	}

}
