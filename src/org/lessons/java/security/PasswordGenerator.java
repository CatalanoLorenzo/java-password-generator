package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Scrivi il tuo nome");
	
	String nome = input.nextLine();
	
	System.out.println("Scrivi il tuo cognome");
	
	String cognome = input.nextLine();
	
	System.out.println("Scrivi il tuo colore preferito");

	String colorePreferito = input.nextLine();

	String dataDiNascita = null;
	
	System.out.println("Scrivi il giorno di nascita");
	
	int giorno = input.nextInt();
	
	System.out.println("Scrivi il mese di nascita");

	int mese = input.nextInt();
	
	System.out.println("Scrivi l'anno di nascita");
	
	int anno = input.nextInt();
	
	dataDiNascita = giorno + "-" + mese + "-" + anno ;
	
	String passwordGen = nome + cognome + colorePreferito + dataDiNascita ;
	System.out.println("La tua Password generata è : " + passwordGen);
	

	
}
}
