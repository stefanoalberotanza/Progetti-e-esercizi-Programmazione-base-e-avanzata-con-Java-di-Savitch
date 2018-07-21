import java.util.Scanner;

public class progetto2_7_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci una sequenza di 4 bit da convertire: ");
		String s = tastiera.next();
		int b0, b1, b2, b3;
		b0 = Character.getNumericValue(s.charAt(0));
		b1 = Character.getNumericValue(s.charAt(1));
		b2 = Character.getNumericValue(s.charAt(2));
		b3 = Character.getNumericValue(s.charAt(3));
		System.out.println(8*b0 + 4*b1 + 2*b2 + b3);
	}

}
