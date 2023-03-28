package view;

import javax.swing.JOptionPane;
import controller.FatController;

public class Principal {
	public static void main(String[] args) throws Exception{
		FatController fat = new FatController();
		int n;
		do{
			n = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro de 0 a 10."));
			if(n < 0 || n > 10) {
				JOptionPane.showMessageDialog(null, "Número fora do intervalo.");
			}
		} while (n < 0 || n > 10);
		JOptionPane.showMessageDialog(null, "O fatorial de "+n+" é "+fat.fatorial(n)+".");
	}
}

