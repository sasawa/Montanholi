package d18m02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	
	
	static void ativ1(Scanner entry) {
		int a, b;
		
		System.out.println("Insira os valores de forma consecutiva");
		a = entry.nextInt();
		b = entry.nextInt();
		
		if(a>b)
			System.out.println("O primeiro valor � maior que o segundo");
		else if (a<b)
			System.out.println("O segundo valor � maior que o primeiro");
		else
			System.out.println("Ambos s�o iguais");
		
	}
	static void ativ2(Scanner entry) {
		char letra;
		char[] array = {'A','a','E','e','I','i','O','o','U','u'};
		System.out.println("Insira uma letra");
		letra = entry.nextLine().charAt(0);
		
		for(char a : array )
			if(letra == a) {
				System.out.println("� Vogal ");
				return;
			}
		System.out.println("� Consoante");
	}
	static void ativ3(Scanner entry) {
		for (int i = 0; i < 200; i++) {
			if(i%5 == 0 && i%10 !=0 )
				System.out.println(i);
		}
		
	}
	static void ativ4(Scanner entry) {
		List<Entrevistado> lista = new ArrayList<Entrevistado>();
		
		
		while(true) {
			System.out.println("Deseja inserir um registro?(S/N)");
			if(entry.nextLine().charAt(0) == 'N' ) break;
			
			Entrevistado obj = new Entrevistado();
			
			System.out.println("Insira nome: ");
			obj.setNome(entry.nextLine());
			
			System.out.println("Insira o ano de nascimento: ");
			obj.setAnoNasc(entry.nextLine());
			System.out.println("Insira a escolaridade: ");
			obj.setEscolaridade(entry.nextLine());
			System.out.println("Insira o estado civil;");
			obj.setEstadoCivil(entry.nextLine());
			System.out.println("Insira o sexo:");
			obj.setSexo(entry.nextLine());
			
			lista.add(obj);
		}
		int unit = 0;
		for(Entrevistado obj : lista) {
			if(obj.getIdade() < 20 && obj.getEstadoCivil().equals("Casado"))
				unit++;
		}
		System.out.println(unit+" Entrevistados s�o casados com menos de 20");
		
	}
	static void ativ5(Scanner entry) {
		System.out.println("Insira as horas trabalhadas");
		double hrs = entry.nextDouble();
		System.out.println("O trabalhador recebeu R$"+(hrs*26*8));
		
	}
	static void ativ6(Scanner entry) {
		int ciclos;
		double[] qtdes, precos;
		
		System.out.println("Insira a quantidade de produtos a ser inserida");
		ciclos = entry.nextInt();	
		
		qtdes = new double[ciclos];
		precos = new double[ciclos];
		
		for (int i = 0; i < ciclos; i++) {
			qtdes[i] = inserirDouble("Insira a quantidade do produto "+(i+1));
			precos[i] = inserirDouble("Insira o pre�o do produto "+(i+1));
		}
		
		
		
	}
	
	static double inserirDouble(String msg) {
		double a;
		do {
			a = Double.parseDouble(JOptionPane.showInputDialog(msg));		
		}while( a < 0);
		
		return a;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Escolha a atividade proposta(0 para sair)");
		int atividade = scan.nextInt();
		while(atividade != 0) {
			scan = new Scanner(System.in);
			switch (atividade) {
			case 1:
				System.out.println("Solicite dois n�meros ao usu�rio e mostre o menor valor.");
				ativ1(scan);
				break;
			case 2:
				System.out.println("Solicite uma letra ao usu�rio e verifique se � vogal ou consoante.");
				ativ2(scan);
				break;
			case 3:
				System.out.println("Imprima n�meros de 0 � 200 que possuem o n�mero 5 como �ltimo algarismo.");
				ativ3(scan);
				break;
			case 4:
				System.out.println("Uma empresa precisa realizar entrevistas dom v�rias pessoas."
						+ " Os dados necess�rios s�o: nome, ano de nascimento, sexo,\r\n" + 
						"escolaridade e estado civil. Com o ano de nascimento � necess�rio que"
						+ " o programa calcule a idade da pessoa. Fa�a um\r\n" + 
						"programa que colete os dados das pessoas e informe quantos entrevistados"
						+ " com menos de 20 anos s�o casados.");
				ativ4(scan);
				break;
			case 5:
				System.out.println("Fa�a um programa que leia o n�mero de horas trabalhadas "
						+ "(por dia) de um funcion�rio por um per�odo de 30 dias e apresente\r\n" + 
						"o sal�rio bruto recebido por ele nesse per�odo, "
						+ "sabendo que o valor do sal�rio � R$ 8,00/hora trabalhada e "
						+ "que este m�s teve 4\r\n" + 
						"domingos e dois s�bados que ele n�o trabalhou.");
				ativ5(scan);
				break;
			case 6:
				System.out.println("Construa um programa que leia a quantidade "
						+ "e o pre�o de v�rios produtos diferentes (quantidade de leitura previamente\r\n" + 
						"definida pelo usu�rio) comprados por uma empresa e "
						+ "apresente o total desta compra. A quantidade e o pre�o fornecido pelo\r\n" + 
						"usu�rio n�o pode ser negativo.");
				ativ6(scan);
				break;
	
			default:
				System.out.println("Atividade invalida");
				break;
			}
			System.out.println("\nEscolha a atividade proposta(0 para sair)");
			atividade = scan.nextInt();
		}
		System.out.println("Atividade finalizada Deus � Top!");
	}

}
