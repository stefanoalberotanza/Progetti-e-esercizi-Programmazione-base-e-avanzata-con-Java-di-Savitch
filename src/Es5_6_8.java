/**
 * 26 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 *
 * Traccia: a) realizzare il metodo primo che prende in input un intero e restituisce true, altrimenti false;
 * 			b) realizzare il metodo divisore che prende in ingresso un numero intero e restituisce il suo minimo divisore (escluso 1);
 *			c) realizzare il metodo main che legge in input un numero intero diverso da 0 e sfrutta i metodi precedenti per dare informazioni sul numero.
 */
import java.util.Scanner;

public class Es5_6_8 {
	public static boolean primo(int n){
		int i = 2;
		while(i < Math.round(Math.pow(n, (double)1/i)) && n%i != 0 ){
			i++;
		}
		if(n%i == 0){
			return false;
		}else{
			return true;
		}
	}
	
	public static int divisore(int n){
		int i = 2;
		while(n%i != 0){
			i++;
		}
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci un numero intero: ");
		int n = tastiera.nextInt();
		System.out.println("Questo numero " +  (primo(n)?"è primo":"non è primo e il suo minimo divisore è: " + divisore(n)) );
	}

}
