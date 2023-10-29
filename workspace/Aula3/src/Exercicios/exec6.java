package Exercicios;

public class exec6 {
	public static void main(String[] args) {
		long a =1;
		long b = 0;
		long aux;
		for(long n = 0; n <= 100; n++) {
			System.out.println(a);
			aux = a;
			a = a + b;
			b = aux;
		}
	}
}
