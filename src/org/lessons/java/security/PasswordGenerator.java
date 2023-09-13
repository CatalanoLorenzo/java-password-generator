package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
public static void main(String[] args) {
	
	//abilito la lettura degliinput da parte dell'utente
	Scanner input = new Scanner(System.in);
	
	//mando in console un messaggio all'utente per inserire un input
	System.out.println("Scrivi il tuo nome");
	
	//genero una variabile di tipo string e l'associo all'input dell'utente
	String nome = input.nextLine();
	
	//mando in console un messaggio all'utente per inserire un input
	System.out.println("Scrivi il tuo cognome");
	
	//genero una variabile di tipo string e l'associo all'input dell'utente
	String cognome = input.nextLine();
	
	//mando in console un messaggio all'utente per inserire un input
	System.out.println("Scrivi il tuo colore preferito");

	//genero una variabile di tipo string e l'associo all'input dell'utente
	String colorePreferito = input.nextLine();

	//genero una variabile di tipo string che per il momento è vuota (null)
	String dataDiNascita = null;
	
	//mando in console un messaggio all'utente per inserire un input
	System.out.println("Scrivi il giorno di nascita");
	
	//genero una variabile di tipo int e l'associo all'input dell'utente
	int giorno = input.nextInt();
	
	//mando in console un messaggio all'utente per inserire un input
	System.out.println("Scrivi il mese di nascita");

	//genero una variabile di tipo int e l'associo all'input dell'utente
	int mese = input.nextInt();
	
	//mando in console un messaggio all'utente per inserire un input
	System.out.println("Scrivi l'anno di nascita");
	
	//genero una variabile di tipo int e l'associo all'input dell'utente
	int anno = input.nextInt();
	
	//disabilito perche non piu necessaria la possibilita da parte dell'utente di inserire input
	input.close();
	
	//associo alla variabile che era vuota  una stringa costituita dalla concatenazione delle tringe giorno mese e anno separate dal carattere -
	dataDiNascita = giorno + "-" + mese + "-" + anno ;
	
	//genere una variabile di tipo stringa  costituita dalla concatenazione delle stringhe nome cognome colorePReferito e dataDiNascita
	String passwordGen = nome + cognome + colorePreferito + dataDiNascita ;
	
	//mostro in console all'utente un messaggio contenete la password generata
	System.out.println("La tua Password generata è : " + passwordGen);
	

	
}
}
