package basics;

public class minmaxav {

	public static void main(String[] args) {
		int[] numbers = {5, -2, 8, -10, 20, 18};
		System.out.println(findMin(numbers));
		System.out.println(findMax(numbers));
		System.out.println(findAvg(numbers));
	}
	
	public static int findAvg(int[] arr) {
		int sum=0;
		for(int i=0; i< arr.length; i++ ) {
			sum = sum + arr[i];
		}
		System.out.println("sum " + sum);
		return sum/arr.length;
	}
	
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for( int i =0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		for( int i =0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
