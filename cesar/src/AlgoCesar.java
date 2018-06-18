/**
 * Un exemple d'implémentation du Code César.
 *
 * @author David Gayerie
 *
 */
public class AlgoCesar {

	public String encrypte(String s) {

		String chaine = "";

		for (char c : s.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				chaine = chaine + (char) (97 + ((c + 23 - 97) % 26));
			} else if (c >= 'A' && c <= 'Z') {
				chaine = chaine + (char) (65 + ((c + 23 - 65) % 26));
			} else {
				chaine = chaine + c;
			}
		}
		return chaine;
	}  

	public static void main(String[] args) {
		AlgoCesar algoCesar = new AlgoCesar();

		String resultat = algoCesar.encrypte("");
		System.out.println("".equals(resultat));

		// étape 2
		resultat = algoCesar.encrypte("az");
		System.out.println("xw".equals(resultat));
		

		// étape 3
		resultat = algoCesar.encrypte("AZ");
		System.out.println("XW".equals(resultat));


		// étape 4
		resultat = algoCesar.encrypte("1,000.00");
		System.out.println("1,000.00".equals(resultat));

		
		// étape 5
		String phrase = "In cryptography, a Caesar cipher is one " +
		"of the simplest and most widely known " + "encryption techniques."; resultat
		= algoCesar.encrypte(phrase);
		
		String phraseAttendue = "Fk zovmqldoxmev, x Zxbpxo zfmebo fp lkb " +
		"lc qeb pfjmibpq xka jlpq tfabiv hkltk " + "bkzovmqflk qbzekfnrbp.";
		System.out.println(phraseAttendue.equals(resultat));
		
	}
}