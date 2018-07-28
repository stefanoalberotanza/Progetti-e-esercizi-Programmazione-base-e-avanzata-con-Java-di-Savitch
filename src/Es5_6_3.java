/**
 * 24 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 */
import java.util.Scanner;

public class Es5_6_3 {

	public static boolean divisibile(int divisore, int dividendo){
		if(divisore >= dividendo && divisore%dividendo == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci due interi: ");
		int n1,n2;
		n1 = tastiera.nextInt();
		n2 = tastiera.nextInt();
		System.out.println(n1 + (divisibile(n1, n2)?"":" non") + " è divisibile per " + n2);
	}

}
