/**
 * 21 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 */
import java.util.Scanner;

public class es4_8 {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Scrivi una frase: ");
		String s = tastiera.nextLine();
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == ' '){
				count++;
			}
		}
		System.out.println("C'erano " + count + " spazi.");
		
	}

}
