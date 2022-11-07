package com.framework.fwAPI.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.framework.fwAPI.dto.RequisicaoNovoPedido;
import com.framework.fwAPI.model.Pedido;
import com.framework.fwAPI.repository.PedidoRepository;

@RestController
@RequestMapping("/android")
public class AndroidController {
	
	@Autowired
	private PedidoRepository repository;
	
	@GetMapping
	public List<Pedido> listar(){
		return repository.findAll();
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping()
	public String novo(@Valid String descricao, String nome_pedido, String valor_pedido) {
		
		RequisicaoNovoPedido requisicao = new RequisicaoNovoPedido();
		requisicao.setDescricao(descricao);
		requisicao.setNome_pedido(nome_pedido);
		requisicao.setValor_pedido(valor_pedido);
		
		Pedido pedido = requisicao.toPedido();
		
		repository.save(pedido);
		
		return "Salvo";
	}
}