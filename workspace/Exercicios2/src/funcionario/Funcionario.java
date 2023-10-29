package funcionario;

public class Funcionario {
	public static int salarioBase = 2000;
	public static int bonus = 100;
	
	private String nome;
	private String cargo;
	private int salario;
	
	public Funcionario(String nome, String cargo, int salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public static int getSalarioBase() {
		return salarioBase;
	}

	public static void setSalarioBase(int salarioBase) {
		Funcionario.salarioBase = salarioBase;
	}

	public static int getBonus() {
		return bonus;
	}

	public static void setBonus(int bonus) {
		Funcionario.bonus = bonus;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public int contarSalario() {
		return salarioBase + bonus;
	}
	
	
}
