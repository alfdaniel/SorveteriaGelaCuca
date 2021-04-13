package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Produto;
import model.Sorvete;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		int opcao = 0;

		List<Sorvete> listaSorvete = new ArrayList<>();

		Produto produto = new Produto();

		Sorvete s1 = new Sorvete();
		Sorvete s2 = new Sorvete();
		Sorvete s3 = new Sorvete();

		// Produto s1 = new Produto();
		// Produto s2 = new Produto();
		// Produto s3 = new Produto();

		// Produto p1 = new Produto();
		// Produto p2 = new Produto();
		// Produto p3 = new Produto();

		// criando sabores para sorvetes
		s1.criarSorvete1("Chocobomba", "Chocolate", "Grande", true);
		s2.criarSorvete1("Morango Vermelho", "Morango", "medio", true);
		s3.criarSorvete1("Assaí na casca", "Assaí", "pequeno", true);

		// Criando sabores para picole
		// p1.criarPicole("Maracugina", "Maracujá", "Grande", false);
		// p2.criarPicole("Limonada", "Limão", "Médio", false);
		// p3.criarPicole("Laranja Melada", "Laranja com mel", "Pequeno",
		// false);

		listaSorvete.add(s1);
		listaSorvete.add(s2);
		listaSorvete.add(s3);
		// listaPoduto.add(p1);
		// listaPoduto.add(p2);
		// listaPoduto.add(p3);
		//
		
		

		System.out.println("Você adcionou " + listaSorvete.size() + " produtos à sua lista. \n");

		while (opcao < 5 && opcao != 3) {
			Sorvete sv = new Sorvete();

			for (Sorvete sorveteDaniel : listaSorvete) {
				System.out.println("Produto: " + listaSorvete.indexOf(sorveteDaniel) + " " + sorveteDaniel.getNome()
						+ " - " + sorveteDaniel.getSabor() + " - " + sorveteDaniel.getTamanho() + " - "
						+ sorveteDaniel.getCobertura());
			}

			opcao = produto.opcaoMenu();

			if (opcao == 1) {
				System.out.println("Deseja Adcionar um novo Sorvete ou Picolé? \n[S] - sorvete \n[P] - Picolé "
						+ "\n[C] - Cancelar operação");
				produto.linhaVazia();
				String sP = scan1.nextLine();
				if (sP.equals("s")) {
					sv.inserirSorvete();
					listaSorvete.add(sv);
					
				} else if (sP.equals("p")) {
					System.out.println("Opção em fase de desenvolvimento-------");
					produto.linhaVazia();
				} else if (sP.equals("c")) {
					System.out.println("Operação finalizada");
					produto.linhaVazia();
					break;
				
				} else {
					System.out.println("Opção inválida");
				}

			}
			if (opcao == 2) {
				System.out.println("Escolha o indice de qual produto vai ser removido: ");
				int removeProduto = scan.nextInt();
				listaSorvete.remove(removeProduto);
				System.out.println("Produto removido com sucesso.\n ");
			}
			
			if (opcao == 3) {
				System.out.println("Sistema encerrado");
				break;
			}
		}
	}

}
