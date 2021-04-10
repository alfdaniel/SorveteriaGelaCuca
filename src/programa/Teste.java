package programa;

import entidade.CriarProduto;

public class Teste {

	public static void main(String[] args) {
		
		CriarProduto listaP = new CriarProduto();
		
		CriarProduto s1 = new CriarProduto();
		CriarProduto s2 = new CriarProduto();
		CriarProduto s3 = new CriarProduto();
		
		CriarProduto p1 = new CriarProduto();
		CriarProduto p2 = new CriarProduto();
		CriarProduto p3 = new CriarProduto();
		
		
		//criando sabores para sorvetes
		s1.criarSorvete("Chocobomba", "Chocolate" , "Grande", true);
		//cp.mostarSorvete();
		
		s2.criarSorvete("Morango Vermelho", "Morango" , "medio", true);
		//cp.mostarSorvete();
		
		s3.criarSorvete("Assaí na casca", "Assaí" , "pequeno", true);
		//cp.mostarSorvete();
		
		//Criando sabores para picole
		p1.criarPicole("Maracugina", "Maracujá", "Grande", false);
		//cp.mostarPicole();
		
		p2.criarPicole("Limonada", "Limão", "Médio", false);
		//cp.mostarPicole();
		
		p3.criarPicole("Laranja Melada", "Laranja com mel", "Pequeno", false);
		//cp.mostarPicole();
		
		System.out.println();
		listaP.listaSorvete();

	}

}
