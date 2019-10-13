package teme;

import java.util.Random;
import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// coderonat();
		// mofifiedDice();
		// ghicesteNumarul();
		// sumaSiprodus();
		// cifreInNumar();
		// iKnowjava();
		// numaratoare();
		// numaratoareComplexa();
		// numaratoare3();
		// numaratoarePatrat();
		// NumaratoareImpara();
		// tresCinco();
		// analizaString();
		// sumaPrimelor();
		// sumaNumeretastatura();
		// cuvantVocala();
		tablaInmultirii2();
	}

	public static void coderonat()
	/*
	 * codul a avut o problema, nu exista linia de cod prin care se cerea
	 * confirmarea inaintea lui while, drept pentru care nu intra in strucura
	 * repetitiva Modificarea programului cu do while este optima, nu mai
	 * necesita nici o modificare ulterioara
	 */
	{
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();
		String again;
		// System.out.print( "Would you like to flip again (y/n)? " );
		// again = keyboard.next();
		do {
			int flip = rng.nextInt(2);
			String coin;
			if (flip == 1)
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println("You flip a coin and it is... " + coin);

			System.out.print("Would you like to flip again (y/n)? ");
			again = keyboard.next();
		} while (again.equals("y"));
	}

	public static void mofifiedDice() {
		int number1;
		int number2;

		int counter = 0;
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		do {
			number1 = random.nextInt(7 - 1) + 1;

			number2 = random.nextInt(7 - 1) + 1;

			System.out.println(number1 + " si " + number2 + " = "
					+ (number1 + number2));
			counter++;

		} while (number1 != number2);
		System.out.println("Double " + number1 + " you had a number of "
				+ counter + " tries");

	}

	public static void ghicesteNumaru() {
		int numar;
		int numarghicit;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introdu un numar intre 1 si 10 ");
		numar = random.nextInt(10 - 1) + 1;
		numarghicit = scanner.nextInt();
		do {

			if (numarghicit > numar) {
				System.out.println("Introdu un numar mai mic");
				numarghicit = scanner.nextInt();
			} else {
				if (numarghicit < numar) {
					System.out.println("Introdu un numar mai mare");
					numarghicit = scanner.nextInt();
				}
			}
		} while (numar != numarghicit);
		System.out.println("bravo ai ghicit numarul");

	}

	public static void calculator() {
		int a;
		int b;
		int sum;
		char operator;
		String operation = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println(" I am a calculator ");
		do {
			System.out.println("Choose operation");
			operation = scanner.nextLine();

			operator = operation.charAt(1);

			a = operation.charAt(0) - '0';// se citeste caracterul corespunzator
											// din string DAR fiind in ASCII se
											// foloseste acest artificiu

			b = operation.charAt(2) - '0';

			if (operator == '+') {
				sum = a + b;
				System.out.println(a + " + " + b + " = " + sum);
			} else {
				if (operator == '-') {
					sum = a - b;
					System.out.println(a + " - " + b + " = " + sum);
				}
			}
			if (operator == '*') {
				sum = a * b;
				System.out.println(a + " * " + b + " = " + sum);

			} else {
				if (operator == '/') {
					sum = a / b;
					System.out.println(a + " / " + b + " = " + sum);

				}
			}

		} while ((a != 0) || (b != 0) || (operator != '+'));
	}

	public static void sumaSiprodus()

	{
		Scanner scanner = new Scanner(System.in);
		int numar;
		int suma = 0;
		int produs = 1;
		do {
			System.out.println("Introdu un numar");
			numar = scanner.nextInt();
			if (numar % 2 == 0) {
				suma = suma + numar;
			} else {
				produs = produs * numar;
			}
		} while (numar != 0);
		System.out.println("suma numarelor pare = " + suma);
		System.out.println("Produsul numerelor impare = " + produs);
	}

	public static void cifreInNumar() {
		long numar;
		int contor = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("introdu un numar si eu voi spune cate cifre are");
		numar = scanner.nextLong();
		do {
			numar = numar / 10;
			contor++;
		} while (numar != 0);

		System.out.println("numarul are " + contor + " cifre");
	}

	public static void iKnowjava() {
		String mesaj = "i Know java!!!!";
		int i;
		for (i = 0; i <= 10; i++) {
			System.out.println(mesaj);
		}
	}

	public static void numaratoare() {
		int numar;
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu un numar ");
		numar = scanner.nextInt();
		for (i = 0; i <= numar; i++) {

			System.out.print(i + " ");
		}
	}

	public static void numaratoareComplexa() {
		int numar1;
		int numar2;
		int numar3;
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("De la cat vrei sa pornesti numaratoarea?");
		numar1 = scanner.nextInt();
		System.out.println("Pana unde vrei sa numari");
		numar2 = scanner.nextInt();
		System.out.println("cu ce interval vrei sa mearga numaratoarea");
		numar3 = scanner.nextInt();
		for (i = numar1; i <= numar2; i += numar3) {// ca sa numeri de la I la
													// din cat vrei in cat vrei
			System.out.print(i + " ");
		}

	}

	/*
	 * Scrieţi un program care foloseşte o variabilă x pentru a număra de la -10
	 * la +10 din 0.5 în 0.5 (Rezultatul va fi -10, -9.5, -9, -8.5, …).
	 */
	public static void numaratoare3() {

		double x;
		int i;
		Scanner scanner = new Scanner(System.in);
		for (x = -10; x <= 10; x += 0.5) {
			System.out.println(x + " ");
		}

	}

	public static void numaratoarePatrat()
	/**
	 * Pentru programul de la punctul 4. afişaţi şi pătratul fiecărui număr
	 * folosind o variabilă y.
	 */
	{
		double x, y;
		int i;
		Scanner scanner = new Scanner(System.in);
		for (x = -10; x <= 10; x += 0.5) {
			y = x * x;
			System.out.println(x + " patratul lui este" + y);
		}
	}

	public static void NumaratoareImpara() {
		// Scrieţi un program care citeşte un număr şi afişează toate numele
		// până la acesta. Programul va afişa un semn în dreptul numerelor pare
		// şi alt semn în dreptul numerelor impare.
		int numar;
		int numar1;
		int numar2;
		int numar3;
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("De la cat vrei sa pornesti numaratoarea?");
		numar1 = scanner.nextInt();
		System.out.println("Pana unde vrei sa numari");
		numar2 = scanner.nextInt();
		System.out.println("cu ce interval vrei sa mearga numaratoarea");
		numar3 = scanner.nextInt();
		for (i = numar1; i <= numar2; i += numar3) {// ca sa numeri de la I la
													// din cat vrei in cat vrei
			if (i % 2 == 0) {
				System.out.println(i + " numar par");
			} else {
				System.out.println(i + " numar impar");
			}
		}

	}

	public static void tresCinco()
	/**
	 * Scrieţi un program care afişează toate numerele de la 0 la 100. Pentru
	 * multiplii de 3 afişaţi mesajul “Tres”, pentru multiplii de 5 afişaţi
	 * mesajul “Cinco”, iar pentru numerele care se împart şi la 3 şi la 5
	 * afişaţi “TresCinco”.
	 */
	{
		String tres = "tres";
		String cinco = "cinco";
		String trescinco = "trescinco";

		int i;

		for (i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i + " " + tres);
			}
			if (i % 5 == 0) {
				System.out.println(i + " " + cinco);
				if ((i % 3 == 0) && (i % 5 == 0)) {
					System.out.println(i + " " + trescinco);
				}
			}
		}

	}

	public static void analizaString() {
		/**
		 * Citiţi un şir de caractere de la tastatură. Afişaţi lungimea lui,
		 * poziţia şi valoarea primului caracter, poziţia şi valoarea ultimului
		 * caracter şi fiecare caracter cu poziţia lui. Puteţi folosi funcţia
		 * charAt(int) a clasei String. Număraţi de câte ori apare litera ‘a’
		 * (fie a, fie A). Afişaţi mesaje pentru fiecare parte
		 */
		String sir;
		int i;
		int contor = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu un sir de caractere/un nume etc");
		sir = scanner.nextLine();
		System.out.println(sir + " are " + sir.length() + " caractere ");
		char c;
		String s1;
		for (i = 0; i <= sir.length() - 1; i++) {
			System.out.println(sir.charAt(i) + " are pozitia " + (i + 1));
			c = sir.charAt(i);
			s1 = String.valueOf(c);
			if (s1.equalsIgnoreCase("a")) {
				contor++;

			}
		}
		System.out.println("litera a apare de " + contor + " ori");
	}

	public static void sumaPrimelor() {
		/*
		 * Scrieţi un program care face suma primelor n numere, unde n este
		 * citit de la tastatură (adică 1 + 2 + 3 + 4 + … + n).
		 */

		int i;
		int n;
		int suma = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("introdu un numar");
		n = scanner.nextInt();
		for (i = 0; i <= n; i++) {
			suma = suma + n;

		}
		System.out.println("suma primelor " + n + " numere naturale este : "
				+ suma);
	}

	public static void sumaNumeretastatura() {
		/*
		 * 9.Scrieţi un program care face suma primelor n numere, unde n este
		 * citit de la tastatură (adică 1 + 2 + 3 + 4 + … + n).
		 * 
		 * 10.Scrieţi un program care adună n numere citite de la tastatură (n
		 * este şi el citit de la tastatură). De exemplu: a + b + c + d + …. +
		 * k.
		 */
		int catenumere;
		int numaradunat;
		int suma = 0;
		int i;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Cate numere vrei sa introduci de la tastatura");
		catenumere = scanner.nextInt();
		for (i = 0; i < catenumere; i++) {
			System.out.println("introdu un numar");
			numaradunat = scanner.nextInt();
			suma = suma + numaradunat;

		}
		System.out.println(suma);
	}

	public static void cuvantVocala() {
		/*
		 * Scrieţi un program care citeşte un cuvânt de la tastatură şi îl
		 * afişează de 10 ori. În cazul în care cuvântul începe cu o vocală,
		 * acesta trebuie afişat doar de 5 ori. Folosiţi UN SINGUR if şi UN
		 * SINGUR for.
		 */
		String cuvantcitit;
		int i;
		int contor = 10;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Te rog introdu un cuvant");
		cuvantcitit = scanner.nextLine();
		if ((cuvantcitit.charAt(0) == 'a') || (cuvantcitit.charAt(0) == 'e')
				|| (cuvantcitit.charAt(0) == 'i')
				|| (cuvantcitit.charAt(0) == 'o')
				|| (cuvantcitit.charAt(0) == 'u')) {
			contor = contor / 2;
		}
		for (i = 0; i < contor; i++) {
			System.out.println(cuvantcitit);
		}
	
	}public static void tablaInmultirii2(){
		int i;
		for (i=0;i<=10;i++){
		System.out.println(i+" * 2 = " +i*2);
		}
	}
}
