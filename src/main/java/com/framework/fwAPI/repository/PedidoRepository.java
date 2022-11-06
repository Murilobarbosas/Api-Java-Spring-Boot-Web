package com.framework.fwAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.framework.fwAPI.model.Pedido;
import com.framework.fwAPI.model.StatusPedido;
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
}