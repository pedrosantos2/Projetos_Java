package Exercicios;

public class exec5 {
	public static void main(String[] args) {
		long fatorial = 1;
		for(long n = 1; n <= 20; n++) {
			fatorial *= n;
			System.out.println(fatorial);
		}
	}
}
