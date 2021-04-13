package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto {

	private String nome;
	private String sabor;
	private String tamanho;
	private Boolean cobertura;
	
	static Scanner scan = new Scanner(System.in);
	static Scanner scan1 = new Scanner(System.in);
	static Scanner scan2 = new Scanner(System.in);
	

	
	List<Produto> listaprodutos = new ArrayList<Produto>();
	// SorveteriaGeralDAOImpl DAOImpl = new SorveteriaGeralDAOImpl();


	

//	  public void criarSorvete(String nome, String sabor, String tamanho, boolean cobertura) {
//		SorveteDaniel sv = new SorveteDaniel();
//		sv.setNome(nome);
//		sv.setSabor(sabor);
//		sv.setTamanho(tamanho);
//		sv.setCobertura(cobertura);
//		// DAOImpl.salvar(sv);
//	}
//
//	public void criarPicole(String nome, String sabor, String tamanho, boolean cobertura) {
//		Picole pc = new Picole();
//		pc.setNome(nome);
//		pc.setSabor(sabor);
//		pc.setTamanho(tamanho);
//		pc.setCobertura(cobertura);
//		// DAOImpl.salvar(pc);
//	}

//	public void mostarSorvete(Object obj) {
//		SorveteDaniel sv = new SorveteDaniel();
//		System.out.println("Nome: " + sv.getNome() + ", Sabor: " + sv.getSabor() + ", Tamanho: "
//				+ sv.getTamanho() + ", Cobertura: " + sv.getCobertura());
//	}

//	public void mostarPicole() {
//		Picole picole = new Picole();
//		System.out.println("Nome: " + picole.getNome() + ", Sabor: " + picole.getSabor() + ", Tamanho: "
//				+ picole.getTamanho() + ", Cobertura: " + picole.getCobertura());
//	}

	public static int removerOpcao() {
		System.out.println("\n\nDigite o CÓDIGO para remover o produto: ");
		int opcao = scan.nextInt();
		return opcao;
	}
	
	public void tamList() {
		System.out.println(listaprodutos.size());
	}

	public void linhaVazia() {
		System.out.println(" ");
	}
	
	public static int opcaoMenu() {
		System.out.println("");
		System.out.println("------------------------------------------------------");
		System.out.println("--------------SELECIONE UMA OPÇÃO DO MENU-------------");
		System.out.println("\n[1] Adicionar Sorvete\n[2] Remover Sorvete\n[3] Encerrar o Programa");
		System.out.println("------------------------------------------------------");
		System.out.println("");
		int opcao = scan.nextInt();
		return opcao;
	}
	
	public void iniciarMenu() {
		
		System.out.println("");
		System.out.println("------------------------------------------------------");
		System.out.println("--------------SELECIONE UMA OPÇÃO DO MENU-------------");
		System.out.println("\n[1] Adicionar Sorvete\n[2] Remover Sorvete\n[3] Encerrar o Programa");
		System.out.println("------------------------------------------------------");
		System.out.println("");
	
		String recomecarMenu;
		int opcaoMenu = scan.nextInt();

		if (opcaoMenu == 0 && opcaoMenu > 3) {
			System.out.println("Entrada inválida \nDigite uma opção correspondente ao menu");
			iniciarMenu();
		} else {
			switch (opcaoMenu) {
			case 1:
				System.out.println("A opção escolhida foi - Adicionar novo produto");
				System.out.println("Deseja Adcionar um novo Sorvete ou Picolé? \n[S] - sorvete \n[P] - Picolé "
						+ "\n[C] - Cancelar operação");
				String sP = scan1.nextLine();
				if (sP.equals("s")) {
					Sorvete sorveteDaniel = new Sorvete(null, null, null, null);
					 System.out.println("Deseja Iniciar menu novamente");
					 recomecarMenu = scan2.nextLine();
					 if (recomecarMenu.equals("s")) {
					 iniciarMenu();
					 }
				} else if (sP.equals("n")) {
					System.out.println("Operação temporariamente fora de operação");
					//criarPicole(null, null, null, (Boolean) null);
					System.out.println("Iniciar menu novamente");
					iniciarMenu();
				} else {
					System.out.println("Operação cancelada");
					break;
				}
			case 2:
				System.out.println("Opção 2");
				break;
			case 3:
				System.out.println("Opção 3");
				break;
			default:

				break;
			}

			scan.close();
		}
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public Boolean getCobertura() {
		return cobertura;
	}
	public void setCobertura(Boolean cobertura) {
		this.cobertura = cobertura;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", sabor=" + sabor + ", tamanho=" + tamanho + ", cobertura=" + cobertura
				+ ", listaprodutos=" + listaprodutos + "]";
	}

		

}
