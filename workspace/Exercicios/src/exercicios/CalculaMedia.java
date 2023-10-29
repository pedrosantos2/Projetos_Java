package exercicios;

import javax.swing.JOptionPane;

public class CalculaMedia {

	public static void main(String[] args) {
		String nomeAluno = JOptionPane.showInputDialog(null, "Insira o seu nome:", "Calcular Media", JOptionPane.INFORMATION_MESSAGE);
		int media = 0;
		int soma = 0;
		
		for(int i = 1; i <= 4; i++) {
			int nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira aqui sua nota " + i, "Calcular Media", JOptionPane.INFORMATION_MESSAGE));
			soma += nota;
			media = soma/4;
		}
		
		JOptionPane.showMessageDialog(null, "Ola " +nomeAluno +" Sua media foi: " + media, "Calcular Media", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
