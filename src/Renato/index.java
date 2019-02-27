package Renato;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class index {
	static List<Carro> database = new ArrayList<Carro>();
	
	public static void main(String[] args) {
		while(true) {
			int acao = Integer.parseInt(
					JOptionPane.showInputDialog(""
							+ "Escolha a açao\n"
							+ "1 - Cadastrar registro\n"
							+ "2 - Visualizar por preço"));
			switch (acao) {
			case 1:
				inserirRegistro();
				break;

			default:
				visualizarPreco();
				break;
			}
		}
	}

	private static void visualizarPreco() {
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o preco"));
		String msg = "";
		List<Carro> temp = database.stream()
				.filter(p -> p.preco == preco).collect(Collectors.toList());
		for (Carro carro : temp) {
			msg += "Modelo/Chassi: "+carro.modelo+"/"+carro.chassi+"\n";
		}
		JOptionPane.showMessageDialog(null, msg, "Carros do valor de "+preco,0);
	}

	private static void inserirRegistro() {
		Carro obj = new Carro();

		obj.modelo = JOptionPane.showInputDialog("Insira o Modelo");
		obj.fabricante = JOptionPane.showInputDialog("Insira o Fabricante");
		obj.chassi = JOptionPane.showInputDialog("Insira o Chassi");
		obj.ano = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano"));
		obj.preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o preco"));
		
		database.add(obj);
	}

}
