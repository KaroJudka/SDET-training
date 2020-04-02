package basics;

public class Fractal {

	public static void main(String[] args) {
		// !0 = - !1 = 1 !2 = 2*1 !3= 3*2*1 !4=4*3*2*1
		System.out.println(fact(1));
		System.out.println(fact(2));
		System.out.println(fact(5));
	}

	public static int fact(int n) {
		if (n==0) {
			return 1;
		}
		return fact(n-1)*n;
		}
	}
