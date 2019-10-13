package NonDfault;

import java.util.Scanner;

class Main {

	public static void main(String[] args)

	{
		assignment15();

	}

	public static void assignment() {

		String Name, Eyes, Teeth, Hair;
		int Age;
		double Height, Weight, Height1, Weight1;

		Name = "Zed A. Shaw";
		Age = 35; // not a lie
		Height = 74; // inches
		Weight = 180; // lbs
		Eyes = "Blue";
		Teeth = "White";
		Hair = "Brown";
		Height1 = (Height * 2.54);
		Weight1 = (Weight * 0.45392);
		System.out.println("Sa vorbim despre " + Name + ".");
		System.out.println("El are " + Height1
				+ " cm inaltime ceea ce inseamna " + Height + "inch");
		System.out.println("Are o greutate de  " + Weight1
				+ " Kg. ceea ce inseamna " + Weight + "pounds");
		System.out.println("De fapt este cam slab.");
		System.out.println("El are ochi " + Eyes + " si par " + Hair + " .");
		System.out.println("Dintii lui sunt de obicei " + Teeth
				+ " in functie de cafea.");

		// This line is tricky; try to get it exactly right.
		System.out.println("Daca adun toate cifrele " + Age + ", " + Height
				+ ", si " + Weight + " obtin " + (Age + Height1 + Weight1)
				+ ".");
	}

	public void assignemnt2() {
		/**
		 * Nu am gasit nereguli
		 */
		int cars;
		int drivers;
		int passengers;
		int cars_not_driven;
		int cars_driven;
		double space_in_a_car;
		double carpool_capacity;
		double average_passengers_per_car;

		/**
		 * Dupa declararea individuala a variabilelor nu s-a modificat decat
		 * lungimea codului :)
		 */
		cars = 100;
		space_in_a_car = 4;
		/**
		 * dupa schimbarea cifrei din 4.0 in 4 nu s-a schimbat nimic.
		 */
		drivers = 30;
		passengers = 90;
		cars_not_driven = cars - drivers;
		cars_driven = drivers;
		carpool_capacity = cars_driven * space_in_a_car;
		average_passengers_per_car = passengers / cars_driven;

		System.out.println("There are " + cars + " cars available.");
		System.out.println("There are only " + drivers + " drivers available.");
		System.out.println("There will be " + cars_not_driven
				+ " empty cars today.");
		System.out.println("We can transport " + carpool_capacity
				+ " people today.");
		System.out.println("We have " + passengers + " to carpool today.");
		System.out.println("We need to put about " + average_passengers_per_car
				+ " in each car.");
	}

	public static void assignment3() {
		int num = 4;
		System.out.println(num);
		System.out.println("num");
		System.out.println(4);
		/**
		 * prima data imi afiseaza valoarea variabilei "num" a doaa data imi
		 * afiseaza un text numit tot "num" a treia data imi afiseaza o valoare
		 * aleasa in prealabil
		 */
	}

	public static void assignment4() {
		int numarul_clasei;
		double alta_variabila;
		String materie;

		numarul_clasei = 113;
		alta_variabila = 2.71828;
		materie = "Informatica";
		System.out.println("Asta este clasa # " + numarul_clasei
				+ "\nUn numar necunoscut este apropiat de " + alta_variabila
				+ "\nInvat ceva despre materia : " + materie);

	}

	public static void assignment5() {
		int anul = 1968;
		String nume = "Johnny Depp";
		System.out.println("Ma numesc " + nume + " si sunt nascut in anul "
				+ anul + ".");
	}

	public static void assignment6() {
		String linie_orizontala = "+--------------------------------------------------+";
		String linie_verticala = "|\n|\n|\n|\n|\n|\n|";
		System.out.println(linie_orizontala + linie_verticala + "\n"
				+ linie_orizontala);

	}

	public static void assignment7() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu un numar");
		int nr = scanner.nextInt();
		System.out.println("Ai introdus numarul " + nr);

	}

	public static void assignment8() {
		Scanner scanner = new Scanner(System.in);
		int varsta;
		double inaltime, inaltime_inch;
		double greutate, greutate_pounds;

		System.out.println("Cati ani ai ?");
		varsta = scanner.nextInt();
		System.out.println("Ce inaltime ai ?");
		inaltime = scanner.nextDouble();
		System.out.println("Ce greutate ai ?");
		greutate = scanner.nextDouble();

		inaltime_inch = (inaltime / 2.54);
		greutate_pounds = (greutate / 0.45);

		System.out.println("In concluzie ai o varsta de " + varsta
				+ " ani, o greutate de " + greutate
				+ " kilograme si o inaltime de " + inaltime);
		System.out.println("IN UNITATI DE MASURA DIFERITE");
		System.out.println("In concluzie ai o varsta de " + varsta
				+ " ani, o greutate de " + greutate_pounds
				+ " pounds si o inaltime de " + inaltime_inch);

	}

	public static void assignment9() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Trebuie sa introduci 2 cuvinte si 2 numere");
		System.out.println("Introdu primul cuvant");
		System.out.println("Primul cuvant introdus de tine este:  "
				+ scanner.next());
		System.out.println("Introdu al doilea cuvant");
		System.out.println("Al doilea cuvant introdus de tine este:  "
				+ scanner.next());
		System.out.println("Introdu primul numar");
		System.out.println("Primul numar introdus de tine este:  "
				+ scanner.next());
		System.out.println("Introdu al doilea numar");
		System.out.println("Al doilea numar introdus de tine este:  "
				+ scanner.next());
		System.out.println("Multumim!!");
	}

	public static void assignment10() {
		Scanner scanner = new Scanner(System.in);
		String nume;
		String varsta;
		String salariu;
		System.out.println("Salut, te rog spune-mi cum te numesti");
		nume = scanner.next();
		System.out.println("Salut, " + nume + " spune-mi te rog cati ani ai?");
		varsta = scanner.next();
		System.out.println("In concluzie te numesti " + nume + " si ai "
				+ varsta + " ani, poti sa imi spui cat castigi.");
		scanner.nextLine();
		salariu = scanner.nextLine();
		System.out.println("Wooow, ce salariu ai!! " + salariu);
	}

	public static void assignment11() {
		Scanner scanner = new Scanner(System.in);
		String nume_familie;
		String prenume;
		int clasa;
		String StudentId;
		String NumeLogin;
		Double NotaFinala;

		System.out.println("Introdu Numele de familie");
		nume_familie = scanner.next();
		System.out.println("Introdu prenumele");
		prenume = scanner.next();
		System.out.println("Introdu clasa in care esti");
		clasa = scanner.nextInt();
		System.out.println("Introdu StudentiD-ul");
		StudentId = scanner.next();
		System.out.println("Introdu User Name-ul");
		NumeLogin = scanner.next();
		System.out.println("Introdu Nota Finala");
		NotaFinala = scanner.nextDouble();
		System.out.println("Numele de familie : " + nume_familie
				+ "\nPrenumele : " + prenume + "\nClasa : " + clasa
				+ "\nStudent ID : " + StudentId + "\nUser Name : " + NumeLogin
				+ "\nNota Finala : " + NotaFinala);
	}

	public static void assignment12() 
	{
		Scanner scanner = new Scanner(System.in);
		String nume;
		int varsta;
		int viitor;
		int trecut;
		System.out.println("Salut, te rog spune-mi cum te numesti");
		nume = scanner.next();
		System.out.println("Salut, " + nume + " spune-mi te rog cati ani ai?");
		varsta = scanner.nextInt();
		viitor = varsta + 5;
		trecut = varsta - 5;
		System.out.println(" Stiai ca peste 5 ani vei avea " + viitor
				+ " ? Si acum 5 ani ai avut " + trecut
				+ " ? Ia-ti-o p-asta :)))");

	}
	public static void assignment13()
	{
		Scanner scanner = new Scanner(System.in);
		double a;
		double b;
		double c;
		double rezultat;
		System.out.println("EU SUNT UN CALCULATOR CE ITI VA FACE SUMA A 3 NUMERE SI APOI O VA IMPARTI LA 2");
		System.out.println("Introdu primul numar");
		a = scanner.nextDouble(); 
		System.out.println("Introdu al doilea numar");
		b = scanner.nextDouble();
		System.out.println("Introdu al treilea numar");
		c = scanner.nextDouble();
		rezultat = ((a+b+c)/2);
		System.out.println("REZULTATUL = " +rezultat);
		
	}
	public static void assignment14()
	{
		
		Scanner scanner = new Scanner(System.in);
		
	double hm;
	double wkg;
	double BMI;
		System.out.println("BMI Calculator\n Indicele BMI sau Body Mass Index este frecvent folosit de catre nutritionisti");
		System.out.println("Introdu inaltimea in metri");
		hm = scanner.nextDouble();
		System.out.println("introdu greutatea in kilograme");
		wkg = scanner.nextDouble();
		
	    BMI = (wkg/(hm*hm));
	    System.out.println("indicele tau BMI este "+ BMI);
	}
	public static void assignment15()
	{
		Scanner scanner = new Scanner(System.in);
		double a;
		double b;
		String semn;
		double rezultat=0;
		String adunare = "+";
		String scadere = "-";
		String inmultire = "*";
		String impartire = "/";
		System.out.println("EU SUNT UN CALCULATOR CE ITI VA FACE o operatie la alegere cu 2 numere");
		System.out.println("Introdu primul numar");
		a = scanner.nextDouble(); 
		System.out.println("Introdu al doilea numar");
		b = scanner.nextDouble();
		System.out.println("Introdu semnul operatiei dorite ");
		semn = scanner.next();
		if(semn.equals(adunare))
		{
			rezultat = a+b;
		}
		if(semn.equals(scadere))
		{
			rezultat = a-b;
		}
		if(semn.equals(inmultire))
		{
			rezultat =  a*b;
		}
		if(semn.equals(impartire))
		{
			rezultat = a/b;
		}
		
	
		System.out.println("REZULTATUL = " +rezultat);
		
	}
	
	}
	


