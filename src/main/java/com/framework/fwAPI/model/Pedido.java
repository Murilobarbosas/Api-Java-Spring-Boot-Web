package com.framework.fwAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Pedido {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;
	private String nome_pedido;
	private String valor_pedido;
	
	public Pedido(String descricao, String nome_pedido, String valor_pedido) {
		this.descricao = descricao;
		this.nome_pedido = nome_pedido;
		this.valor_pedido = valor_pedido;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome_pedido() {
		return nome_pedido;
	}

	public void setNome_pedido(String nome_pedido) {
		this.nome_pedido = nome_pedido;
	}

	public String getValor_pedido() {
		return valor_pedido;
	}

	public void setValor_pedido(String valor_pedido) {
		this.valor_pedido = valor_pedido;
	}
}
