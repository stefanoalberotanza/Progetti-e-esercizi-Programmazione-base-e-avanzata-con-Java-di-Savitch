import java.util.Scanner;

public class Progetto2_7_2 {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Scrivi due parole: ");
		String s1,s2;
		s1 = tastiera.next();
		s2 = tastiera.next();
		
		System.out.println(s1 + "\n" + s2);
		System.out.println(s1 + s2);
		System.out.println((s1 + s2).length());
	}
}