package com.hamburgueria.Repositoriees;

import com.hamburgueria.hamburgueria_api.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
