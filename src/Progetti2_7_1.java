import java.util.Scanner;

public class Progetti2_7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Digita tre numeri interi seguiti da uno spazio");
		int n1, n2, n3;
		double y;
		n1 = tastiera.nextInt();
		n2 = tastiera.nextInt();
		n3 = tastiera.nextInt();
		y = (n1 + n2 + n3)/3;
		System.out.println("La media è: " + y);
	}

}
