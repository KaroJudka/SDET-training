package basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA,numB);
		int product = multipleNumbers(numA, numB);
		System.out.println(product);
		
	}
		
	static void printName() {
		System.out.println("My name is Tim.");
	}
	
	static void addNumbers(int numberA, int numberB){
		int sum = numA + numB;
		System.out.println("The sum of " + numA + " and " + numB + " is " + sum);
	}
	
	static int multipleNumbers(int valueA, int valueB){
		int product = valueA * valueB;
		return product;
	}
	
}
