/**
 * 23 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 */
import java.util.Scanner;

public class progetto4_5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci un numero da 1 a 50 intero");
		int base = tastiera.nextInt();
		int count,controllo;
		controllo = 0;
		count = 1;
		while(count < base){
			while(controllo < count){
				System.out.print("*");
				controllo++;
			}
			count++;
			System.out.print("\n");
			controllo = 0;
		}
		while(count > 0){
			while(controllo < count){
				System.out.print("*");
				controllo++;
			}
			count--;
			System.out.print("\n");
			controllo = 0;
		}
		
		
	}

}
