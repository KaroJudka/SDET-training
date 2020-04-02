package basics;

public class Weather {
	public static void main(String[] args) {
		int temperature = 25;
	
			if (temperature > 80) {
				System.out.println("krótki rêkawek");
			} else if ( temperature > 60 ) {
				System.out.println("d³ugi rêkaw");
			} else {
				System.out.println("zimno, swetr!");
			}
	}
}