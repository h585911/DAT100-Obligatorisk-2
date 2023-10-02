package no.hvl.dat100.lab5.tabeller;

import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		/*
		 * Ønsker å skrive ut tabellen som en Array.
		 * Eksempel [1, 2, 3, 4]
		 * Derfor må vi først skrive ut parantesen før vi legger til alle verdiene.
		 */
		System.out.print("[");
		
		/*
		 * Itererer gjennom tabellen og skriver ut verdien.
		 * Bruker %d som en placeholder for integer.
		 */
		for (int i = 0; i < tabell.length; i++) {
			System.out.printf("%d", tabell[i]);
			
			/*
			 * if-setningen sjekker om elementet i tabellen er det siste elementet,
			 * dersom den ikke er det, ligger vi til ett komma mellom verdiene.
			 * Dermed får vi formatet som en Array.
			 */
			if (i < tabell.length - 1) {
				System.out.print(", ");
			}
		}
		
		/*
		 * Skriver ut den siste parantesen etterfulgt av en ny linje.
		 * Dersom vi kjører TabellerEnhetsTester.java, får vi tre tabeller som ser slik ut:
		 * (1) [1, 4, 6]
		 * (2) [1]
		 * (3) []
		 */
		System.out.print("]\n");
	}

	// b)
	public static String tilStreng(int[] tabell) {

		StringBuilder strengBuilder = new StringBuilder();
		
		strengBuilder.append("[");
		
		for (int i = 0; i < tabell.length; i++) {
			strengBuilder.append(tabell[i]);
			
			if (i < tabell.length - 1) {
				strengBuilder.append(",");
			}
		}
		
		strengBuilder.append("]");
		
		System.out.println(strengBuilder.toString());
		
		return strengBuilder.toString();
	}

	// c)
	public static int summer(int[] tabell) {

		/*
		 * På grunn av scoping i Java, må vi definere noen variabel.
		 * Velger å bruke en variabel til summerte elementer for hver av løkkene.
		 * Variablene inneholder summen av alle tallene i tabellen.
		 * 
		 * Vi må også definere en teller til while-løkken: 'elementWhile'.
		 */
		int summertTallForLokke = 0;
		int summertTallUtvidetForLokke = 0;
		int summertTallWhileLokke = 0;
		int elementWhile = 0;
		
		/*
		 * Itererer gjennom tabellen ved å bruke en for-løkke.
		 * For hvert element i tabellen, legges verdien i summertTallForLokke.
		 */
		for (int elementFor = 0; elementFor < tabell.length; elementFor++) {
			summertTallForLokke = summertTallForLokke + tabell[elementFor];
		}
		
		/*
		 * Itererer gjennom tabellen ved å bruke en utvidet for-løkke.
		 * For hvert element i tabellen, legges verdien i summertTallUtvidetForLokke.
		 */
		for (int elementUtvidet : tabell) {
			summertTallUtvidetForLokke = summertTallUtvidetForLokke + elementUtvidet;
		}
		
		/*
		 * Itererer gjennom tabellen ved å bruke en while-løkke.
		 * For hvert element i tabellen, legges verdien i summertTallWhileLokke.
		 */
		while(elementWhile < tabell.length) {
			summertTallWhileLokke += tabell[elementWhile];
			elementWhile++;
		}
		
		/*
		 * For testing, skriver ut summertTallForLokke, summertTallUtvidetForLokke og summertTallWhileLokke.
		 */
		System.out.println("Summert tall vha for løkke: " + summertTallForLokke);
		System.out.println("Summert tall vha utvidet for løkke: " + summertTallUtvidetForLokke);
		System.out.println("Summert tall vha while løkke: " + summertTallWhileLokke);

		/*
		 * return kan endres til summertTallForLokke, summertTallUtvidetForLokke eller summertTallWhileLokke.
		 * Alle variablene gir samme verdi: 11, 1, 0.
		 */
		return summertTallForLokke;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return true;
			}
		}
		
		return false;
		//throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				System.out.println("posisjonTall: " + i);
				return i;
			}
		}
		
		return -1;
		//throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] reversertTabell = new int[tabell.length];
		
		for (int i = 0; i < tabell.length; i++) {
			reversertTabell[i] = tabell[tabell.length - 1 - i];
		}
		
		System.out.println("(f) funksjon reverser > original tabell: " + Arrays.toString(tabell));
		System.out.println("(f) funksjon reverser > reversert tabell: " + Arrays.toString(reversertTabell));
		
		return reversertTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int totalLengde = tabell1.length + tabell2.length;
		int[] sammensattTabell = new int[totalLengde];
		
		for (int i = 0; i < tabell1.length; i++) {
			sammensattTabell[i] = tabell1[i];
		}
		
		for (int i = 0; i < tabell2.length; i++) {
			sammensattTabell[tabell1.length + i] = tabell2[i];
		}
		
		return sammensattTabell;
	}
}
