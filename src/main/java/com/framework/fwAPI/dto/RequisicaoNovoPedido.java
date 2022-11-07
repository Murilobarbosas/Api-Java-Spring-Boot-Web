package com.framework.fwAPI.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import com.framework.fwAPI.model.Pedido;

public class RequisicaoNovoPedido {

	Pedido pedido = new Pedido();
	
	private String descricao;
	
	@NotBlank
	private String nome_pedido;
	
	@NotNull
	private String valor_pedido;


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

	public Pedido toPedido() {
		pedido.setDescricao(descricao);
		pedido.setNome_pedido(nome_pedido);
		pedido.setValor_pedido(valor_pedido);
		return pedido;
	}

	@Override
	public String toString() {
		return "RequisicaoNovoPedido [descricao=" + descricao + ", nome_pedido=" + nome_pedido + ", valor_pedido="
				+ valor_pedido + "]";
	}
}
