package model;

import java.util.Scanner;

public class Sorvete extends Produto {

	private String nome;
	private String sabor;
	private String tamanho;
	private Boolean cobertura;
	
	Scanner scanner = new Scanner(System.in);
	
	
	public Sorvete inserirSorvete(){
		Sorvete sorveteDaniel = new Sorvete(nome, sabor, tamanho, cobertura);
		System.out.println("Iserir nome: ");
		nome = scanner.nextLine();
		System.out.println("Iserir sabor: ");
		sabor = scanner.nextLine();
		System.out.println("Iserir tamanho: ");
		tamanho = scanner.nextLine();
		System.out.println("Iserir cobertura: true ou false");
		cobertura = scanner.nextBoolean();
		
		return sorveteDaniel;
		
	}
	
	
	  public void criarSorvete1(String nome, String sabor, String tamanho, boolean cobertura) {
			setNome(nome);
			setSabor(sabor);
			setTamanho(tamanho);
			setCobertura(cobertura);
			// DAOImpl.salvar(sv);
		}

	public Sorvete(String nome, String sabor, String tamanho, Boolean cobertura) {
		super();
		this.nome = nome;
		this.sabor = sabor;
		this.tamanho = tamanho;
		this.cobertura = cobertura;
	}
	public Sorvete() {
		// TODO Auto-generated constructor stub
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
		return "SorveteDaniel [nome=" + nome + ", sabor=" + sabor + ", tamanho=" + tamanho + ", cobertura=" + cobertura
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sorvete other = (Sorvete) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	

}
