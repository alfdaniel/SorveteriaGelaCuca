package entidade;

import java.util.ArrayList;
import java.util.List;

public class CriarProduto {

	Sorvete sv = new Sorvete();
	Picole pc = new Picole();
	List<Picole> lp = new ArrayList();
	List<Sorvete> ls = new ArrayList();
	//SorveteriaGeralDAOImpl DAOImpl = new SorveteriaGeralDAOImpl();

	public void criarSorvete(String nome, String sabor, String tamanho, Boolean cobertura) {
		sv.setNome(nome);
		sv.setSabor(sabor);
		sv.setTamanho(tamanho);
		sv.setCobertura(cobertura);
		//ls.add(sv);
	//	DAOImpl.salvar(sv);
	}

	public void criarPicole(String nome, String sabor, String tamanho, Boolean cobertura) {
		pc.setNome(nome);
		pc.setSabor(sabor);
		pc.setTamanho(tamanho);
		pc.setCobertura(cobertura);
		lp.add(pc);
	//	DAOImpl.salvar(pc);
	}
	
	
//	public void listaSorvete() {
//		for (Object produto : ls) {
//			mostarSorvete(produto);
//		}		
//		
//	}
	
	public void listaSorvete() {
		for (int i = 0; i < ls.size(); i++) {
			mostarSorvete(ls.get(i));
		}
		
	}
	
	public void mostarSorvete(Object obj) {
		System.out.println("Nome: " + sv.getNome()
		+ ", Sabor: " +  sv.getSabor()
		+ ", Tamanho: " +  sv.getTamanho()
		+ ", Cobertura: " + sv.getCobertura());
	}
	
	public void mostarPicole() {
		System.out.println("Nome: " + pc.getNome()
		+ ", Sabor: " +  pc.getSabor()
		+ ", Tamanho: " +  pc.getTamanho()
		+ ", Cobertura: " + pc.getCobertura());
	}
	
}
