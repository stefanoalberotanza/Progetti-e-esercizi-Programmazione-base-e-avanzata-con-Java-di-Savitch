/**
 * 21 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 */

public class es4_12 {
	enum Mesi {gen,feb,mar,apr,mag,giu,lug,ago,set,ott,nov,dic};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for	(Mesi mese : Mesi.values())
			System.out.println(mese);
		}

}
