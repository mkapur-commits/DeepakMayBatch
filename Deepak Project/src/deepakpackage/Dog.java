package deepakpackage;

public class Dog {
	
	int age=13;// Global variable
	public void breed(int age) {
		this.age =age;
		System.out.println(age);
	}

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.breed(12);
		System.out.println(obj.age);
	}

}
