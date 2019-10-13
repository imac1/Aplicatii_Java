package jademyTeme;

import java.util.Random;
import java.util.Scanner;

public class Bucle {

	public static void main(String[] args) {
		// exemplu();
		// stelute();
		// tablainmultirii();
		// coordonate();
		// serienumere();
		// produsul();
		// armstrong();
		// zar();
		// afisare();
		// vector();
		// vector2();
		// vector3();
		// vector4();
		// vector5();
		// vector6();
		// vector7();
		// vector8();
		// vector9();
		// array();
		vector10();
	}

	/**
	 * Ce afişează exemplul anterior? La setul #1, care variabilă creşte mai
	 * repede? Schimbaţi pentru setul #1 ordinea buclelor – puneţi bucla din
	 * interior în exterior şi invers. Cum se modifică programul? Pentru setul
	 * #2 schimbaţi instrucţiunea print în println. Ce modificări apar? De ce?
	 * Adaugaţi un System.out.println(); dupa finalul buclei interioare. Ce se
	 * intâmplă?
	 */
	public static void exemplu() {
		// this is #1 - I'll call it "CN"
		for (char c = 'A'; c <= 'E'; c++) {
			for (int n = 1; n <= 3; n++) {
				System.out.println(c + " " + n);
			}
		}
		System.out.println("\n");

		// this is #2 - I'll call it "AB"
		for (int a = 1; a <= 3; a++) {
			for (int b = 1; b <= 3; b++) {
				System.out.print(a + "-" + b + " ");
			}
			System.out.println("linie pusa");
		}
		System.out.println("\n");
	}

	public static void stelute() {
		// Scrieţi un program care afişează următorul desen folosind
		// instrucţiunea “System.out.print(“*”);” şi 2 for-uri.
		for (int a = 1; a <= 5; a++) {
			for (int b = 0; b < a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void tablainmultirii() {
		Scanner scanner = new Scanner(System.in);
		// Scrieţi un program care afişează tabla înmulţirii cu 10.
		// System.out.println("*\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\n");
		// for (int i = 0; i <= 10; i++) {
		// System.out.print(i+ "\t");
		// for (int j = 0; j <= 10; j++) {
		//
		// System.out.print((i*j)+"\t");
		// }
		// System.out.println("\n");
		System.out.println("introdu un numar de la tastatura");
		int a = scanner.nextInt();
		System.out.println("*\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\n");
		// tabla inmultirii cu un numar pus de la tastatura
		for (int i = 0; i <= a; i++) {
			System.out.print(i + "\t");
			for (int j = 0; j <= 10; j++) {

				System.out.print((i * j) + "\t");
			}
			System.out.println("\n");

		}
	}

	// Scrieţi un program care afişează coordonatele x şi y de pe ecran în felul
	// următor:
	public static void coordonate() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.print("(" + i + "," + j + ")" + " ");
			}
			System.out.println();
		}
	}

	// Generaţi o serie de numere care au suma egală cu 60 şi diferenţa egală cu
	// 14.
	public static void serienumere() {
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				if ((i + j == 60) && (i - j == 14)) {
					System.out.println(i + " si " + j);
				}
			}
		}
	}

	// Generaţi numere între un interval introdus de la tastatură. Pentru
	// fiecare număr, afişaţi produsul cifrelor.
	public static void produsul() {
		int a;
		int b;
		int produsul = 1;
		int a1 = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu primul numar");
		a = scanner.nextInt();
		System.out.println("Introdu al doilea numar");
		b = scanner.nextInt();
		for (int i = a; i <= b; i++) {
			a1 = i;
			produsul = 1;
			if (a1 > 0) {
				produsul = produsul * (a1 % 10);
				a1 = a1 / 10;

			}
			System.out.println("produsul este : " + produsul);
		}
	}

	public static void armstrong() {
		// Găsiţi numere care au proprietatea Armstrong.
		int cifra;
		int a;
		int suma = 0;

		for (int i = 1; i <= 5000; i++) {
			a = i;
			suma = 0;
			while (a > 0) {
				cifra = a % 10;
				suma = suma + (cifra * cifra * cifra);
				a = a / 10;
			}
			if (suma == i) {
				System.out.print(i + " ; ");
			}
		}
	}

	public static void zar() {
		// Să se arunce cu zarul de 5 ori. Să se afișeze suma punctelor obținute
		// în cele 5 aruncări folosind Math.random().
		int zar;
		int suma = 0;
		for (int i = 1; i <= 5; i++) {
			zar = (int) (Math.random() * 6 + 1);
			suma = suma + zar;
		}
		System.out.println("Suma celor 5 aruncari de zar este " + suma);
	}

	public static void afisare() {
		// for (int i = 1; i < 10; i++) {
		// for (int j = 0; j < 10; j++) {
		// System.out.print(j+" ");
		// }
		// System.out.println();
		// }
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i == j) {
					System.out.print("1");

				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

	public static void vector() {
		int[] vector = { 1, 2, 3, 4, 5 };
		System.out.println(vector[0]);
		System.out.println(vector[2]);
		System.out.println(vector[4]);
	}

	public static void vector2() {
		int[] vector = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < 10; i++) {
			System.out.print(vector[i]);
		}
		System.out.println();
		for (int elem : vector) {
			System.out.print(elem + "");
		}

	}

	/*
	 * Se citeşte un număr n care reprezintă lungimea unui vector. Creaţi
	 * vectorul de lungime n, puneţi valori aleatoare pe fiecare poziţie (între
	 * 1 şi 100) şi afişaţi vectorul.
	 */
	public static void vector3() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("introdu lungimea vectorului");
		int lungime = scanner.nextInt();
		int[] vector = new int[lungime];

		for (int i = 0; i < lungime; i++) {
			vector[i] = random.nextInt(100) + 1;
			System.out.println(vector[i] + " ");
		}

	}

	/*
	 * Creaţi un vector care reţine 1000 de valori. Puneţi în el valori
	 * aleatoare între 10 şi 99. Afişaţi vectorul, apoi afişaţi de câte ori apar
	 * numere cu 0 în coadă (ex: 10, 20, 30, etc…).
	 */
	public static void vector4() {
		Random random = new Random();
		int[] vector = new int[1000];
		for (int i = 0; i < 1000; i++) {
			vector[i] = random.nextInt(100 - 10) + 10;
			System.out.print(vector[i]);
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < 1000; i++) {
			if (vector[i] % 10 == 0) {
				System.out.print(vector[i] + " ");
			}
		}
	}

	/*
	 * Creaţi un vector de 5 elemente, apoi citiţi elementele lui de la
	 * tastatură. Copiaţi apoi conţinutul în alt vector. Schimbaţi ultimul
	 * element cu valoarea -5. Afişaţi vectorii.
	 */
	public static void vector5() {
		Scanner scanner = new Scanner(System.in);
		int[] vector = new int[5];
		int[] vector1 = new int[5];
		for (int i = 0; i <= 4; i++) {
			System.out.print("introdu " + i + " element :");
			vector[i] = scanner.nextInt();
			vector1[i] = vector[i];
		}
		vector1[4] = -5;
		for (int elem : vector) {
			System.out.print(elem + " ");
		}
		System.out.println();
		for (int elem1 : vector1) {
			System.out.print(elem1 + " ");
		}
	}

	public static void vector6() {
		// Creaţi un vector de 10 elemente cu numere aleatoare între 0 şi 99.
		// Creaţi un alt vector care să reţină o copie inversă a acestuia.
		// Afişaţi rezultatul.
		Random random = new Random();
		int[] vector = new int[10];
		int[] vector1 = new int[10];
		for (int i = 0; i < 10; i++) {
			vector[i] = random.nextInt(100 - 10) + 10;
			System.out.print(vector[i]);
		}
		System.out.println();
		System.out.println();
		int i = 9;
		for (int elem : vector) {
			vector1[i] = elem;
			i--;
		}
		for (int j = 0; j < 10; j++) {
			System.out.print(vector1[j]);
		}
	}

	public static void vector7() {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		/*
		 * Creaţi un vector care să reţină 10 numere aleatoare. Introduceţi un
		 * număr de la tastatură şi afişaţi de câte ori găsiţi numărul respectiv
		 * în vector. Afişaţi şi un mesaj când aţi găsit numărul. Schimbaţi
		 * programul astfel încât să afişaţi şi indexul pe care numărul a fost
		 * găsit. Schimbaţi programul astfel încât să reţineţi toţi indecşii
		 * pentru numărul respectiv într-un alt vector pe care să îl afişaţi la
		 * final.
		 */
		int[] vector = new int[10];
		int[] vector1 = new int[10];
		int numar;
		int index;
		for (int i = 0; i < 10; i++) {
			vector[i] = random.nextInt(10);
		}
		System.out.println("introdu un numar de la tastatura");
		numar = scanner.nextInt();
		for (int i = 0; i < 10; i++) {
			if (vector[i] == numar) {
				System.out.println("S-a gasit numarul pe pozitia " + i);
				vector1[i] = numar;
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(vector1[i]);
		}
	}

	public static void vector8() {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		/*
		 * Generaţi un vector cu 10 numere aleatoare. Creaţi un program care
		 * cere un număr de la tastatură, caută numărul în vector şi afişează un
		 * mesaj cu numărul şi poziţia atunci când acesta a fost găsit.
		 * Utilizaţi break sau o variabilă booleană.
		 */
		int[] vector = new int[10];
		int numar;
		System.out.println("introdu un numar!");
		numar = scanner.nextInt();
		for (int i = 0; i < 10; i++) {
			vector[i] = random.nextInt(10);
		}
		for (int i = 0; i < 10; i++) {
			if (vector[i] == numar) {
				System.out.println("S-a gasit numarul " + numar
						+ " pe pozitia " + i);
				break;
			}
		}
	}

	public static void vector9() {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		/*
		 * Creaţi un vector cu n numere aleatoare între 0 şi 99 (n introdus de
		 * la tastatură). Afişaţi vectorul, elementul minim, elementul maxim,
		 * suma elementelor, produsul elementelor diferite de 0, media
		 * aritmetică a elementelor. Schimbaţi programul astfel încât să afişaţi
		 * pe ce poziţie se află minimul si maximul.
		 */
		int numar;
		int elemminim = 100;
		int elemmax = 0;
		int suma = 0;
		long produsul = 1;
		int pozitiemin = 0;
		int pozitiemax = 0;
		System.out.println("introdu un numar");
		numar = scanner.nextInt();
		int[] vector = new int[numar];
		for (int i = 0; i < numar; i++) {
			vector[i] = random.nextInt(100 - 10) + 10;
			System.out.print(vector[i] + " ");
		}
		for (int i = 0; i < numar; i++) {
			if (elemminim > vector[i]) {
				elemminim = vector[i];
				pozitiemin = i;
			}
			if (elemmax < vector[i]) {
				elemmax = vector[i];
				pozitiemax = i;
			}
			if (vector[i] > 0) {
				produsul = produsul * vector[i];
			}
			suma = suma + vector[i];
		}
		System.out.println();
		System.out.println("elementul minim: " + elemminim
				+ " si este pe pozitia " + pozitiemin);
		System.out.println("elementul maxim: " + elemmax
				+ " sie este pe pozitia " + pozitiemax);
		System.out.println("suma elementelor: " + suma);
		System.out.println("produsul este: " + produsul);
		System.out.println("media aritmetica a elementelor: " + (suma / numar));

	}

	public static void array() {
		/*
		 * Creaţi un array de String ce conţine iniţializări pentru elemente la
		 * declarare. Afişaţi vectorul.
		 */
		String[] vector = { "tony", "john" };
		for (String elem : vector) {
			System.out.println(elem);
		}
	}

	public static void vector10() {
		Scanner scanner = new Scanner(System.in);
		/*
		 * Creaţi 3 vectori care reţin date despre 5 persoane. Poziţia din cei 3
		 * vectori vă va indica datele despre persoana respectivă. Primul vector
		 * este de tipul String şi va reţine numele acestora. Al doilea vector
		 * este de tipul double şi va reţine notele acestora. Ultimul vector
		 * este de tipul int şi va reţine un id pentru fiecare persoană. Daţi
		 * valori celor 3 vectori. Afişaţi apoi informaţiile despre persoana
		 * respectivă.
		 */

		/*
		 * Recreaţi programul anterior pentru a face căutarea în funcţie de
		 * numele persoanei.
		 */
		String[] vectornume = { "Johny", "Tom", "Ron", "Tim", "Dana" };
		String[] vectornote = { "10", "10", "8", "7", "5" };
		String[] vectorid = { "6412", "3145", "4433", "3333" };
		String nume;
		String id;
		String nota;
		String alegere;
		System.out
				.println("Dupa ce criteriu ai vrea sa cauti??\n\tNume\tNota\tId");
		alegere = scanner.nextLine();
		if (alegere.equalsIgnoreCase("nume")) {
			System.out
					.println("Introdu un nume alegand intre: Johny, Tom, Ron, Tim, Dana");
			nume = scanner.nextLine();
			for (int i = 0; i < 4; i++) {
				if (nume.equalsIgnoreCase(vectornume[i]))
					System.out.println("Nume : " + vectornume[i] + "\tNota : "
							+ vectornote[i] + "\tId :" + vectorid[i] + "\n");
			}
		} else {
			if (alegere.equalsIgnoreCase("nota")) {
				System.out
				.println("Scrie o nota");
				nota = scanner.nextLine();
				for (int i = 0; i < 4; i++) {
					if (nota.equalsIgnoreCase(vectornote[i]))
						System.out.println("Nume : " + vectornume[i]
								+ "\tNota : " + vectornote[i] + "\tId :"
								+ vectorid[i] + "\n");
				}
			} else {
				if (alegere.equalsIgnoreCase("id")) {
					System.out
					.println("Scrie un id dintre 6412, 3145, 4433, 3333");
					id = scanner.nextLine();
					for (int i = 0; i < 4; i++) {
						if (id.equalsIgnoreCase(vectorid[i]))
							System.out.println("Nume : " + vectornume[i]
									+ "\tNota : " + vectornote[i] + "\tId :"
									+ vectorid[i] + "\n");
					}
				}
			}
		}
	}
}