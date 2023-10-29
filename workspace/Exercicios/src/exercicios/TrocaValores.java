package exercicios;

import javax.swing.JOptionPane;

public class TrocaValores {

	public static void main(String[] args) {
		String nome1 = "mestre do universo";
		String nome2 = JOptionPane.showInputDialog(null, "insira aqui o nome para a variavel:", "Trocar Valores", JOptionPane.INFORMATION_MESSAGE);
	
		JOptionPane.showMessageDialog(null, nome1 +" " + nome2, "Trocar valores", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
