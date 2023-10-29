package aula1;

import java.util.Scanner;

public class leitorConsole {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe seu Nome:");
		
		String nome = leitor.next();
		
		System.out.println("Informe sua Idade:");
		
		String idade = leitor.next();
		
		System.out.println("Informe sua Data de Nascimento:");
		
		String data = leitor.next();
		
		System.out.println("Seja bem-vindo " + nome +" Voce tem: "+ idade + " Voce nasceu em "+ data );

	}
}
