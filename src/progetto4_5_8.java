/**
 * 22 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 */
import java.util.Scanner;

public class progetto4_5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci una parola");
		String s = tastiera.next();
		while(!s.equalsIgnoreCase("uscita")){
			int n =s.length();
			int i = 0;
			int max = 0;
			while(s.charAt(i) == s.charAt(n-1)&&(max < n/2)){
				i++;
				n--;
			}
			if(s.charAt(i)!=s.charAt(n-1)){
				System.out.println("La parola non è palindroma.");
			} else {
				System.out.println("E' palindroma!");
			}
			s = tastiera.next();
		}
	}

}
