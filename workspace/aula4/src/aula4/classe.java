package aula4;

public class classe {
	
	private int numero;
	private cliente titular;
	private double saldo;
	
	boolean saca(double valor) {
		if(this.saldo < valor) {
			return false;
		}else {
			this.saldo -= valor;
			return true;
		}
		
		}
	void transfere(classe destino, double valor) {
		this.saldo -= valor;
		destino.saldo += valor;
		
	}
	
	void deposita()

}
