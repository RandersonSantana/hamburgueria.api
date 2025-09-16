package com.hamburgueria.Repositoriees;

import com.hamburgueria.hamburgueria_api.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
