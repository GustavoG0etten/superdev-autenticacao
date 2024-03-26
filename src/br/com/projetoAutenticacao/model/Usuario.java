package br.com.projetoAutenticacao.model;

public class Usuario {
	
	private int id;
	private String nome;
	private String login;
	private String senha;
	private boolean isAtivo;
	
	
	public Usuario() {
		
	}
		
	public Usuario(int id, String nome, String login, String senha, boolean isAtivo) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.isAtivo = isAtivo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return login;
	}


	public void setEmail(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public boolean getIsAtivo() {
		return isAtivo;
	}


	public void setIsAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	
	
	
	

}
