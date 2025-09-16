package com.hamburgueria.Repositoriees;

import com.hamburgueria.hamburgueria_api.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
