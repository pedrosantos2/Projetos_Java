package aula4;

public class ProgramaConta {
	
	public static void main(String[] args) {
		classe conta = new classe();
		cliente cli = new cliente();
		conta.numero = 1;
		cli.nome = "Pedro";
		conta.titular = cli;
		conta.deposita(1500);
		
		System.out.println("A conta do titular " + conta.titular.nome);
		System.out.println("Saldo da conta e " + conta.saldo);
		System.out.println("Sacar 500");
		boolean sacou = conta.saca(1100);
		if(sacou) {
			System.out.println("Conseguiu Sacar!");
		}else {
			System.out.println("Nao conseguiu Sacar!");
		}
		System.out.println("Saldo da conta e " + conta.saldo);
	
		classe conta2 = new classe();
		cliente cli2 = new cliente();
		conta2.numero = 2;
		cli2.nome = "Mauricio";
		conta2.deposita(2000);
		
		conta2.transfere(conta, 50);
		System.out.println("Saldo do Mauricio " + conta2.saldo);
		System.out.println("Saldo do Pedro " + conta.saldo);
	}
	
	
		
	
}
