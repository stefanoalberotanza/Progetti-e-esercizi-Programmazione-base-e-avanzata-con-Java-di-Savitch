/**
 * 24 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 */
import java.util.Scanner;

public class Es5_6_2 {
	
	public static void saluta(int numeroVolte, String nome){
		int i = 0;
		while(i < numeroVolte){
			System.out.println("Ciao " + nome);
			i++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci un numero e un nome.");
		int n;
		String s;
		n = tastiera.nextInt();
		s = tastiera.next();
		saluta(n, s);
	}

}
