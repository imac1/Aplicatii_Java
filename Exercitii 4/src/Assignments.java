import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Assignemnts {

	public static void main(String[] args) {
		Tema20();

	}

	public static void Tema1() {
		String sir = "ABCD";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu un sir de caractere");
		sir = scanner.nextLine();
		System.out.println("Primul caracter este " + sir.charAt(0));

	}

	public static void Tema2() {
		char raspuns;
		char raspuns1 = 'y', raspuns2 = 'n';
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Spune-mi tu utilizatorule mai vrei suc??Raspunde cu Y(DA) sau N(NU)");
		raspuns = scanner.next().charAt(0);

		if (raspuns == raspuns1) {
			System.out.println("iti voi oferi un pahar cu suc");
		} else if (raspuns == raspuns2) {
			System.out.println("Pacat, oricum nu mai aveam");
		} else
			System.out.println("frate, ti-am zis sa introduci Y sau N");
	}

	public static void Tema3()

	{
		String sir1;
		String sir2;
		System.out.println("Introdu un sir de caractere");
		Scanner scanner = new Scanner(System.in);
		sir1 = scanner.nextLine();
		System.out.println("Introdu alt sir de caracatere");
		sir2 = scanner.nextLine();

		System.out.println(sir1.concat(sir2));
	}

	public static void Tema4() {
		String sir1;
		String sir2;
		boolean bool1;
		System.out.println("Introdu un sir de caractere");
		Scanner scanner = new Scanner(System.in);
		sir1 = scanner.nextLine();
		System.out.println("Introdu alt sir de caracatere");
		sir2 = scanner.nextLine();
		if (bool1 = sir1.contains(sir2)) {
			System.out.println("propozitia este " + bool1);

		} else
			System.out.println("propozitia este flasa");
	}

	public static void Tema5() {
		String sir1;
		boolean bool1;
		System.out.println("Introdu un sir de caractere");
		Scanner scanner = new Scanner(System.in);
		sir1 = scanner.nextLine();
		if (bool1 = sir1.endsWith("ala")) {
			System.out.println("sirul de caractere se termina cu ala");
		} else
			System.out.println("sirul nu se termina cu ala");

	}

	public static void Tema6() {
		String sir1;
		String sir2;
		boolean bool1;
		System.out.println("Introdu un sir de caractere");
		Scanner scanner = new Scanner(System.in);
		sir1 = scanner.nextLine();
		System.out.println("Introdu alt sir de caracatere");
		sir2 = scanner.nextLine();
		if (sir1.equals(sir2)) {
			System.out.println("sirurile sunt egale");

		}
		if (sir1.equalsIgnoreCase(sir2)) {
			System.out.println("Sirurile sunt egale dar cu case-uri diferite");
		} else
			System.out.println("Sirurile nu sunt egale");
	}

	public static void Tema7() {
		String sir1;
		char caracter;

		System.out.println("Introdu un sir de caractere");
		Scanner scanner = new Scanner(System.in);
		sir1 = scanner.nextLine();
		System.out.println("Introdu un singur caracter");
		caracter = scanner.nextLine().charAt(0);

		if (sir1.indexOf(caracter) >= 0) {
			System.out.println("caracterul introdus se afla in sir pe pozitia "
					+ (sir1.indexOf(caracter) + 1));

		} else
			System.out.println("caracterul tau nu se afla in primul sir");
	}

	public static void Tema8() {
		String sir1;
		System.out.println("Introdu un sir de caractere");
		Scanner scanner = new Scanner(System.in);
		sir1 = scanner.nextLine();
		System.out.println(sir1.length());
	}

	public static void Tema9() {
		String sir1;
		String caracter;
		String caracter1;
		System.out.println("Introdu un sir de caractere");
		Scanner scanner = new Scanner(System.in);
		sir1 = scanner.nextLine();
		System.out.println("Introdu un singur caracter");
		caracter = scanner.nextLine();
		System.out.println("Introdu inca un singur caracter");
		caracter1 = scanner.nextLine();
		System.out.println(sir1.replace(caracter, caracter1));

	}

	public static void Tema10() {
		String sir1;
		String sir2;
		System.out.println("Introdu un sir de caractere");
		Scanner scanner = new Scanner(System.in);
		sir1 = scanner.nextLine();
		System.out.println("Introdu alt sir de caracatere");
		sir2 = scanner.nextLine();
		if (sir1.startsWith(sir2)) {
			System.out.println(sir1 + " incepe cu " + sir2);
		} else
			System.out.println(sir1 + " nu incepe cu " + sir2);

	}

	public static void Tema11() {
		String sir1;
		int a;
		int b;
		System.out.println("Introdu un sir de caractere");
		Scanner scanner = new Scanner(System.in);
		sir1 = scanner.nextLine();
		System.out.println("Introdu un numar ");
		a = scanner.nextInt();
		System.out.println("Introdu inca un numar");
		b = scanner.nextInt();
		System.out.println(sir1.subSequence(a, b));

	}

	public static void Tema12() {
		String sir;
		String mari;
		String mici;

		System.out.println("Introdu un sir de caractere");
		Scanner scanner = new Scanner(System.in);
		sir = scanner.nextLine();
		System.out.println("Vrei sa il vezi scris cu litere mari sau mici?");
		mari = scanner.next();
		if (mari.equals("mari")) {
			System.out.println(sir.toUpperCase());
		} else if (mari.equals("mici")) {
			System.out.println(sir.toLowerCase());
		} else
			System.out
					.println("Nu ai specificat daca vrei cu litere mari sau mici");
	}

	public static void Tema13() {

		String sir1;
		System.out.println("Introdu un sir de caractere");
		Scanner scanner = new Scanner(System.in);
		sir1 = scanner.nextLine();
		System.out.println("Afisam cu toate spatiile goale sterse, exemplu: "
				+ sir1.trim() + " !");
	}

	public static void Tema14() {
		int people = 20;
		int cats = 30;
		int dogs = 15;
		if (people < cats) {
			System.out.println("Too many cats!  The world is doomed!");
		}
		if (people > cats) {
			System.out.println("Not many cats!  The world is saved!");
		}
		if (people < dogs) {
			System.out.println("The world is drooled on!");
		}
		if (people > dogs) {
			System.out.println("The world is dry!");
		}
		dogs += 5;
		if (people >= dogs) {
			System.out.println("People are greater than or equal to dogs.");
		}
		if (people <= dogs) {
			System.out.println("People are less than or equal to dogs.");
		}
		if (people == dogs) {
			System.out.println("People are dogs.");
		}
	}

	public static void Tema15() {
		int varsta;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu te rog varsta ta");
		varsta = scanner.nextInt();
		if (varsta <= 16) {
			System.out.println("varsta ta este prea mica nu poti conduce");
		} else if (varsta <= 18) {
			System.out.println("varsta este mai mica ca 18 nu poti vota");
		} else if (varsta < 25) {
			System.out
					.println("varsta ta este mai mica de 25 nu poti inchiria masini");
		} else if (varsta >= 25) {
			System.out.println("Poti sa faci orice este legal");
		}
	}

	public static void Tema16() {
		int ziua;
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Introdu cifra coresunzatoare a unei zile a saptamanii");
		ziua = scanner.nextInt();
		if (ziua == 1) {
			System.out.println("ai introdus cifra corespunzatoare zilei LUNI");
		} else if (ziua == 2) {
			System.out.println("ai introdus cifra corespunzatoare zilei MARTI");
		} else if (ziua == 3) {
			System.out
					.println("ai introdus cifra corespunzatoare zilei MIERCURI");
		} else if (ziua == 4) {
			System.out.println("ai introdus cifra corespunzatoare zilei JOI");
		} else if (ziua == 5) {
			System.out
					.println("ai introdus cifra corespunzatoare zilei VINERI");
		} else if (ziua == 6) {
			System.out
					.println("ai introdus cifra corespunzatoare zilei SAMBATA");

		} else if (ziua == 7) {
			System.out
					.println("ai introdus cifra corespunzatoare zilei DUMINICA");
		} else if (ziua == 0 || ziua > 7) {
			System.out
					.println("Ai introdus o cifra ce nu reprezinta nici o zi a saptamanii");
		}

	}

	public static void Tema17() {
		int greutatea;
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Te rog introdu greutatea ta actuala:");
		greutatea = scanner.nextInt();
		System.out
				.println("Iti pot afisa informatii legate de greutatea ta pe diverse planete"
						+ "\n		1. Venus"
						+ "		2. Marte"
						+ "		3. Jupiter"
						+ "\n		4. Saturn" + "		5. Uranus" + "		6. Neptun");
		System.out.println("Ce planeta vizitezi??");
		i = scanner.nextInt();
		if (i == 1) {
			System.out.println(greutatea * 0.78 + " kg");
		} else if (i == 2) {
			System.out.println(greutatea * 0.39 + " kg");
		} else if (i == 3) {
			System.out.println(greutatea * 2.65 + " kg");
		} else if (i == 4) {
			System.out.println(greutatea * 1.17 + " kg");
		} else if (i == 5) {
			System.out.println(greutatea * 1.05 + " kg");
		} else if (i == 6) {
			System.out.println(greutatea * 1.23 + " kg");
		} else if (i == 0 || i > 6) {
			System.out
					.println("Ai introdus o cifra ce nu reprezinta nici o planeta");
		}
	}

	public static void Tema18() {
		String raspuns, n;
		int i, f = 0;

		System.out.println("Esti gata pentru un QUIZZ");
		Scanner scanner = new Scanner(System.in);
		raspuns = scanner.next();
		if (raspuns.equals("y")) {
			System.out.println("fii atent ii dam drumul");
			System.out
					.println("1. What is the capital of Alaska?\n	 	1) Melbourne\n 		2) Anchorage\n 		3) Juneau ");
			i = scanner.nextInt();
			if (i == 3) {
				System.out.println("Bravo");
				f++;
			} else {
				System.out.println("Raspuns gresit");
			}
			System.out
					.println("2. Can you store the value cat in a variable of type int?\n     1) yes\n     2) no");
			i = scanner.nextInt();
			if (i == 1) {
				System.out.println("Ai raspuns gresit");
			} else {
				System.out.println("Bravo");
				f++;
			}

			System.out
					.println(" 3. What is the result of 9+6/3?\n     1)5\n     2)11\n     3) 15/3");
			i = scanner.nextInt();
			if (i == 2) {
				System.out.println("raspuns corect");
				f++;

			} else {
				System.out.println("Nu ai raspuns corect");
			}
		}
		System.out.println("In total ai raspuns " + f + " din 3 raspunsuri"
				+ "\nMultumim pentru participare");
	}

	public static void Tema19() {
		String variabil;
		String variabil1;
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("MAGIC\nGandestete la un obiect si eu am sa incerc sa il ghicesc");
		System.out
				.println("Question 1)   Is it animal, vegetable, or mineral?");
		variabil = scanner.next();
		System.out.println("is it bigger than a bread?");
		variabil1 = scanner.next();
		if (variabil.equals("animal") && variabil1.equals("no")) {
			System.out.println("Cred ca te gandesti la o veverita");
		} else if (variabil.equals("animal") && variabil1.equals("yes")) {
			System.out.println("Te gandesti la un elan");
		} else if (variabil.equals("vegetable") && variabil1.equals("no")) {
			System.out.println("Cred ca te gandesti la un morcov");
		} else if (variabil.equals("vegetable") && variabil1.equals("yes")) {
			System.out.println("Cred ca te gandesti la un pepene");
		} else if (variabil.equals("mineral") && variabil1.equals("yes")) {
			System.out.println("Cred ca te gandesti la o masina");
		} else if (variabil.equals("mineral") && variabil1.equals("no")) {
			System.out.println("Cred ca te gandesti la o agrafa");
		}
	}

	public static void Tema20() {
		int i = 10;
		int b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu un numar real");
		b = scanner.nextInt();
		while (true) {
			if (i == b) {
				System.out.println("Numarul este corect");
				break;
			} else {
				System.out.println("Numarul nu este corect");
				if (b > 10) {
					System.out.println("introdu un numar mai mic");
					// b = scanner.nextInt();
				} else {
					System.out.println("Introdu un numar mai mare");
				}
				b = scanner.nextInt();
			}
		}
	}

	public static void tema21() {
		String par, impar, pozitiv, negativ;
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("introdu te rog un numar");
		i = scanner.nextInt();
		if (i % 2 == 0) {
			par = "Numar par";
		} else {
			par = "Numar impar";
		}
		if (i > 0) {
			pozitiv = "Numar pozitiv";
		} else {
			pozitiv = "Numar negativ";
		}
		System.out.println("Numarul tau are urmatoarele proprietati" + "\n"
				+ par + "\n" + pozitiv);
		
	}
	
}
