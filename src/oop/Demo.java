package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	void eat(){
		System.out.println(email);
	}
	void sleep(){
		System.out.println(name + " is sleeping");
	}
	
}

public class Demo {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "joe@gmail.com";
		person1.phone = "35095902";
		
		person1.walk();
		person1.eat();
		person1.sleep();
	}
//		//Person
//		// Attributes
//		String name = "Joe";
//		String email = "joe@gmail.com";
//		String phone = "345039093";
//		
//		walking("Joe");
//		//Action,activities
		
//	}
//	static void walking(String name) {
//		System.out.println(name + " is walking");
//	}

}
