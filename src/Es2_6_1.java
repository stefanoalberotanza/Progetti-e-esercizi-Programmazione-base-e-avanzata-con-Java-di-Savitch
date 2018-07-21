/*Programma 19/07/2018*/
import java.util.Scanner;

public class Es2_6_1 {

	
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci un numero decimale:");
		double x,y;
		x = tastiera.nextDouble();
		y = 1.0/x;
		
		System.out.println("Il loro prodotto è: " + x*y);
		System.out.println("Sottraendo x ho: " + (x*y-x));
		
	}

}
