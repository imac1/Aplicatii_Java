package pachetul;

import java.util.Random;
import java.util.Scanner;

public class Temele {

	public static void main(String[] args) {

		Tema12();
	}

	public static void Tema1() {
		byte byte1;
		short short1;
		int int1;
		long long1;
		float float1;
		double double1;
		boolean boolean1;
		char char1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu prima valoare de tip byte");
		byte1 = scanner.nextByte();
		System.out.println("Introdu a doua valoare de tip byte");
		byte1 = scanner.nextByte();
		System.out.println("Introdu prima valoare de tip short");
		short1 = scanner.nextShort();
		System.out.println("Introdu a doua valoare de tip short");
		short1 = scanner.nextShort();
		/**
		 * Se observa ca odata ce introducem o valoare mai mare decat tipul
		 * variabilei decalarata programul da eroare
		 */
	}

	public static void Tema2() {
		Scanner scanner = new Scanner(System.in);
		double a;
		double b;
		String semn;
		double rezultat = 0;
		double rezultat2 = 0;
		double rezultat3 = 0;
		double rezultat4 = 0;
		double rezultat5 = 0;

		String adunare = "+";
		String scadere = "-";
		String inmultire = "*";
		String impartire = "/";
		String modulo = "%";
		System.out
				.println("EU SUNT UN CALCULATOR CE ITI VA FACE o operatie la alegere cu 2 numere");
		System.out.println("Introdu primul numar");
		a = scanner.nextDouble();
		System.out.println("Introdu al doilea numar");
		b = scanner.nextDouble();

		{
			rezultat = (a - b);
			rezultat2 = (a + b);
			rezultat3 = (a * b);
			rezultat4 = (a / b);
			rezultat5 = (a % b);
		}

		System.out.println("REZULTATUL Scaderii= " + rezultat
				+ "\nREZULTATUL adunarii= " + rezultat2
				+ "\nREZULTATUL inmultirii= " + rezultat3
				+ "\nREZULTATUL impartirii= " + rezultat4
				+ "\nREZULTATUL modulo10= " + rezultat5);
	}

	public static void Tema3()
	/*
	 * Să se verifice dacă un oraş este metropolă. Se vor folosi 3 variabile:
	 * 
	 * isCapitalCity is true if and only if the city is a capital city.
	 * numberOfCitizen is the number of citizens in this city. taxPerCitizen is
	 * the average tax per month a citizen of the city pays. O metropolă este un
	 * oraş care este ori capitală cu mai mult de 100 000 de cetăţeni ori un
	 * oraş cu mai mult de 200 000 de cetăţeni şi un venit mediu de 72 000. Să
	 * se introducă de la tastatură cele 3 valori, să se reţină într-o expresie
	 * booleană rezultatul şi să se afişeze.
	 */
	{
		boolean Oras_capitala;
		int Numar_cetateni;
		double Taxepecetatean;

		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Introdu daca este oras sau capitala daca este oras scrie FALSE");
		Oras_capitala = scanner.nextBoolean();
		System.out.println("Introdu numarul de locuitori pentru oras ");
		Numar_cetateni = scanner.nextInt();
		System.out.println("Introdu valorea taxelor pentru oras ");
		Taxepecetatean = scanner.nextDouble();
		if ((Oras_capitala == true && Numar_cetateni > 100000)
				|| (Oras_capitala == false && Numar_cetateni > 200000 && Taxepecetatean > 72000)) {
			System.out.println("Orasul este Metropola");
		} else
			System.out.println("Orasul nu este Metropola");

	}

	public static void Tema4() {
		double R;
		double L;
		double A;
		double D;
		double raza;
		double rezistenta;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu lungimea firului in metrii");
		L = scanner.nextDouble();
		System.out.println("Introdu diamentrul firului");
		D = scanner.nextDouble();
		System.out.println("Introdu rezistivitatea firului");
		R = 1.78 * 10E-8;
		raza = D / 2;
		A = (3.14159 * raza * raza);
		rezistenta = R * (L * A);
		System.out.println("Rezistenta firului este" + rezistenta);
	}

	public static void Tema5() {
		/**
		 * Se citeste de la tastatura un numar, daca numarul este par se se
		 * afiseaza : "ai introdus un numar par si introdu un alt numar par"
		 * Daca al doilea numar este si asta par afiseaza
		 * :"ai introdus un numar par" altfel afiseaza:
		 * "nu ai introdus un numar par".Daca primul numar introdus este par
		 * afiseaza toate operatiile matematice primare cu acel numar;
		 */
		int n;
		int n1;
		int rezultat1 = 0;
		int rezultat2 = 0;
		int rezultat3 = 0;
		double rezultat4 = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu un numar");
		n = scanner.nextInt();
		if (n % 2 == 0) {
			System.out
					.println("Ai introdus un numar par, te rog sa mai introduci inca un numar PAR");
			n1 = scanner.nextInt();
			if (n1 % 2 == 0) {
				System.out.println("FELICITARI STI CE E AIA UN NUMAR PAR :)");
			} else
				System.out.println("Ti-am zis sa pui un numar par :(((");

		} else {
			rezultat1 = (n + 2);
			rezultat2 = (n - 2);
			rezultat3 = (n * 2);
			rezultat4 = (n / 2);

			System.out.println("REZULTATUL Scaderii= " + rezultat1
					+ "\nREZULTATUL adunarii= " + rezultat2
					+ "\nREZULTATUL inmultirii= " + rezultat3
					+ "\nREZULTATUL impartirii= " + rezultat4);
		}
	}

	public static void Tema6() {
		int rezervor;
		int timpumplere;
		int cicluri;
		int timpgolire;
		int timpdat;
		short rezervorfinal;
		short rezervorfinal1;
		short rezervorfinal2;
		rezervor = 255;
		timpgolire = 1;
		timpumplere = 255;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu un numar de minute");
		timpdat = scanner.nextInt();
		rezervorfinal = (short) (timpdat - (timpdat / timpumplere) * rezervor);
		rezervorfinal1 = (short) (rezervorfinal - (short) (timpdat / timpumplere));
		rezervorfinal2 = (short) (rezervorfinal1 - 128);
		System.out.println(rezervorfinal2);
	}

	public static void Tema7() {

		int circumferinta;
		double raza;
		circumferinta = 5;
		raza = ((2 * Math.PI) / circumferinta);
		System.out.println(raza);
	}

	public static void Tema8() {
		double volum;
		double raza;
		raza = 20;
		volum = (4 * Math.PI * Math.pow(raza, 3)) / 3;
		System.out.println(volum);
	}

	public static void Tema9() {
		int cantitate;
		int vbaril;
		int varint;
		int varpeafara;
		cantitate = 1000;
		vbaril = 159;
		varint = cantitate / vbaril;
		varpeafara = cantitate - (varint * vbaril);
		System.out.println(varpeafara);
	}

	public static void Tema10() {
		int litri = 100;
		double vsticle = 1.2;
		int elevi;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu numarul de elevi din scoala");
		elevi = scanner.nextInt();
		System.out.println((litri/vsticle) / elevi);

	}
	public static void Tema11() 
	{
		double sinus;
		double grade;
		Scanner scanner = new Scanner(System.in);
		System.out.println("introdu un numar de grade");
		grade= scanner.nextInt();
		sinus = Math.sin(grade);
		System.out.println(sinus);
			
	}
	public static void Tema12()
	{
		
		Random r=new Random();
		int a =r.nextInt(6)+1;
		System.out.println(a);
		
		
	}
}
