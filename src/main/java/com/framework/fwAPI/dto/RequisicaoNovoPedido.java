package com.framework.fwAPI.dto;



import java.math.BigDecimal;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNullFields;

import com.framework.fwAPI.model.Pedido;
import com.framework.fwAPI.model.StatusPedido;

import lombok.NonNull;

public class RequisicaoNovoPedido {

	@NotBlank
	private String nomeProduto;
	
	@NotNull
	@DecimalMin("0.01")
	private BigDecimal valorProduto;
	private String descricao;
	

	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public BigDecimal getValorProduto() {
		return valorProduto;
	}


	public void setValorProduto(BigDecimal valorProduto) {
		this.valorProduto = valorProduto;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setDescricao(descricao);
		pedido.setNomeProduto(nomeProduto);
		pedido.setValorProduto(valorProduto);
		return pedido;
	}
}
