package basics;

public class Weather {
	public static void main(String[] args) {
		int temperature = 25;
	
			if (temperature > 80) {
				System.out.println("kr�tki r�kawek");
			} else if ( temperature > 60 ) {
				System.out.println("d�ugi r�kaw");
			} else {
				System.out.println("zimno, swetr!");
			}
	}
}