package basics;

public class Sums {
	
	public static int summ(int n) {
		int sum = 0;
		for (int i = 1 ; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(summ(2));
		System.out.println(summ(5));

	}
	
	
}
