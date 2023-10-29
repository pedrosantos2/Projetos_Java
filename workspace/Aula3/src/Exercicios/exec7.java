package Exercicios;

import javax.swing.JOptionPane;

public class exec7 {
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero", "Caramba", JOptionPane.INFORMATION_MESSAGE));
		
		for(int i = 0; i <= x; i++) {
			if(x%2 == 0) {
				x = x/2;
				
			}else {
				x = 3 * x + 1;
				
			}
			System.out.println(x);
			
		}
		
	}
}
