package br.com.praticaweb.model;

import java.io.Serializable;

public class Produto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2578273601118373131L;
	
	private Integer codigo;
	private String nome;
	private float valor; 
	private String fabricante;
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
		

}
