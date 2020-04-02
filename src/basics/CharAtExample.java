package basics;

public class CharAtExample{  
	public static void main(String args[]){  
		String name="javatpoint";  
		char first = name.charAt(0);
		char last = name.charAt(name.length()-1);
		String mid = name.substring(1, name.length()-1);
		
		System.out.println(last + mid + first);  
		}
	}  