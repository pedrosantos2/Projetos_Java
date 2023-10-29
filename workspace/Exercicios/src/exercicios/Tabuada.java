package exercicios;

import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero que deseja saber a tabuada", "Tabuada",JOptionPane.INFORMATION_MESSAGE));
	
		for(int i = 0; i <= 10; i++) {
			int resultado = numero * i;
			 System.out.println( numero + " x " + i + " = " + resultado);
		}
	}
}
