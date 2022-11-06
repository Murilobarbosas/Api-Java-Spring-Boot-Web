package com.framework.fwAPI.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	@PostMapping
	public Pedido save(@Valid Pedido p){
		return repository.save(p);
	}
}