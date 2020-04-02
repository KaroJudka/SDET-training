package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// fib num is defined by the sum of the 2 prev fib nums
		// fib(0) = 0 fib(1) = 1 fib(2)=fib(0)+fib(1) etc
		System.out.println(fib(20));
		

	}
	
	public static int fib(int n) {
		if ( n == 0) {
			return 0;
		} else if ( n == 1) {
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}
}
