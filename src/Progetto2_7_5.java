import java.util.Scanner;

public class Progetto2_7_5 {
	
	public static void main(String[] args){
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Scrivi una stringa di 4 lettere:");
		String s;
		s = tastiera.next();
		System.out.println(s.substring(0,1) + "\n" + s.substring(1,2) + "\n" + s.substring(2,3) + "\n" + s.substring(3,4));
	}
}
