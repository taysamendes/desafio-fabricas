package model;

//padrao Abstract Factory
//pq classe abstrata?

public class Avatar {
	private String nome;
	private int id;
	private float fortuna;
	private Vestimenta roupa;
	private String cabelo;
	private Estilo estilo;
	private String cor;
	private String tamanho;
	

	public Avatar(String nome, int id, float fortuna) {
		super();
		this.nome = nome;
		this.id = id;
		this.fortuna = fortuna;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getFortuna() {
		return fortuna;
	}

	public void setFortuna(float fortuna) {
		this.fortuna = fortuna;
	}

	public Vestimenta getRoupa() {
		return roupa;
	}

	public void setRoupa(Vestimenta roupa) {
		this.roupa = roupa;
	}

	public String getCabelo() {
		return cabelo;
	}

	public void setCabelo(String cabelo) {
		this.cabelo = cabelo;
	}

	public Estilo getEstilo() {
		return estilo;
	}

	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Nome= " + nome + ", id=" + id ;
	}

}
