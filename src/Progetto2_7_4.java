import java.util.Scanner;

public class Progetto2_7_4 {
	
	public static void main(String[] args){
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Scrivi un numero di 4 cifre intero:");
		
		int n;
		n = tastiera.nextInt();
		System.out.println(n/1000 + "\n" + n/100%10 + "\n" + n/10%10 + "\n" + n%10);
	}
}
