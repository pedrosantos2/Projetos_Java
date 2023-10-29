package If_Else;

public class Condicional {

	public static void main(String[] args) {
		int idade = 15;
		boolean amigoDoDOno = true;
		
		
		if(idade < 18 && amigoDoDOno == false) {
			System.out.println("E menor de idade");
		}else {
			System.out.println("e maior de idade");
		}
		
		if(idade < 18 && !amigoDoDOno) {
			System.out.println("E menor de idade");
		}else {
			System.out.println("e maior de idade");
		}
		
		int mes = 1;
		if(mes ==1 ) {
			System.out.println("Você deveria estar de férias");
		}
		
		while(idade < 18) {
			System.out.println(idade);
			idade++;
		}
	}
}
