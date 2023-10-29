package ContaBancaria;

public class contabancaria {
	public static double taxaJuros = 0.02;
	public static int numeroContas = 0;
	
	private int saldo;
	private String titular;
	
	public contabancaria(int saldo, String titular) {
		super();
		this.saldo = saldo;
		this.titular = titular;
		numeroContas++;
	}

	public void deposita(double valor) {
		if(valor > 0) {
			saldo += valor;
			System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
		}else {
			 System.out.println("O valor do depósito deve ser maior que zero.");
        }
		
	}
	
	public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void calcularJurosAnuais() {
        double juros = saldo * taxaJuros;
        saldo += juros;
        System.out.println("Juros anuais de R$" + juros + " foram adicionados à conta.");
    }
	
	public static double getTaxaJuros() {
		return taxaJuros;
	}

	public static void setTaxaJuros(int taxaJuros) {
		contabancaria.taxaJuros = taxaJuros;
	}

	public static int getNumeroContas() {
		return numeroContas;
	}

	public static void setNumeroContas(int numeroContas) {
		contabancaria.numeroContas = numeroContas;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	
	
}
