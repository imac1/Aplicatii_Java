package teme;

import java.util.Scanner;

public class forcontinue {
	
	
	static int numar;
	static int counter;
	static String user = "Johhny";
	static String pass = "password";
	static int salariu = 2000;
	static int i;
	static int n;
	static String caracter;

	public static void main(String[] args) {

		
		// break1();
		// break2();
		// continue2();
		// continue3();
		// if(logare(user,pass))System.out.println("Aveti salariu de : "+salariu+" lei ");

		// System.out.println("Divizorii sunt "+ metodaDivizori(100));
		// stelute ("*",3);
		if (numarPrim(3) == true) {
			System.out.println("Numarul este prim");
		}else System.out.println("Numarul nu este prim");

	}

	public static void break1() {
		int numar = 0;
		int suma = 0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("introdu numere la infinit");
			numar = scanner.nextInt();
			suma = suma + numar;
			if (numar < 0) {
				break;
			}
		}
		System.out.println("suma este " + suma);
	}

	public static void break2() {
		int numar;
		int i;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Introdu numare la infinit");
			numar = scanner.nextInt();
			if (numar % 2 != 0)
				System.out.println("Atentie, numar impar   :  " + numar);
			if (numar == 0) {
				break;
			}

		}
	}

	public static void continue2() {
		/*
		 * Se citesc numere. Să se facă produsul numerelor citite, doar dacă
		 * sunt pozitive. Se va afişa produsul la fiecare iteraţie. Să se
		 * evite înmulţirea cu 0 prin folosirea instrucţiunii continue. Să se
		 * evite şi înmulţirea cu 1 prin aceeaşi metodă.
		 */
		int produs = 1;
		int numar;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Introdu un numar la infinit");
			numar = scanner.nextInt();
			if (numar >= 0) {
				if (numar == 0) {
					System.out.println("Ai introdus 0 nu se inmuleteste");
					continue;
				}

				System.out.println("produsul :" + (produs = produs * numar));
			}
		}
	}

	public static void continue3() {
		int numar;
		int suma = 0;

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Pune numere la infinit  : ");
			numar = scanner.nextInt();
			if (numar == 7)
				break;
			if (numar >= 0)
				continue;

			suma = suma + numar;
			System.out.println("suma este   :" + suma);
		}
	}

	public static boolean logare(String u, String p) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("username: ");
		String u1 = scanner.next();
		System.out.println("parola: ");
		String p1 = scanner.next();
		if (u.equals(u1) && p.equals(p1)) {
			System.out.println("sunteti logat");
			return true;
		} else {
			System.out.println("Logarea nu s-a realizat");
			return false;
		}

	}

	public static int metodaDivizori(int numar) {
		int counter = 0;
		for (int i = 1; i <= numar; i++) {
			if (numar % i == 0)
				counter++;

		}
		return counter;
	}

	public static void stelute(String caracter, int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(caracter);
			}
			System.out.println();
		}
	}

	public static boolean numarPrim(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
