package aula1;

import javax.swing.JOptionPane;

public class Joption {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog(null, "Informe Seu Nome","Dados Cadastrais", JOptionPane.INFORMATION_MESSAGE);
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe Sua Idade","Dados Cadastrais", JOptionPane.INFORMATION_MESSAGE));
		
		String dataNascimento = JOptionPane.showInputDialog(null, "Informe Sua Data de Nascimento","Dados Cadastrais", JOptionPane.INFORMATION_MESSAGE);
	
		JOptionPane.showMessageDialog(null, "Seu nome e: " + nome + "\nSua idade e: " + idade
				+ "\nSua data de Nascimento e: "+ dataNascimento,"Dados", JOptionPane.INFORMATION_MESSAGE);
		
		
	}
	
}
