package veiculo;

public class Veiculo {
	public static int velocidadeMaxima;
	public static int numeroVeiculos;
	
	private String marca;
	private String modelo;
	private int ano;
	
	
	
	public Veiculo(String marca, String modelo, int ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		numeroVeiculos++;
	}



	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}



	public void setVelocidadeMaxima(int VelocidadeMaxima) {
		velocidadeMaxima = VelocidadeMaxima;
	}



	public int getNumeroVeiculos() {
		return numeroVeiculos;
	}



	public void setNumeroVeiculos(int NumeroVeiculos) {
		numeroVeiculos = NumeroVeiculos;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	public int calculoIdade() {
		return ano - 2023;
	}
	
	
}





