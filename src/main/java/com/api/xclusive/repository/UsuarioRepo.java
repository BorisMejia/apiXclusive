package com.api.xclusive.repository;

import com.api.xclusive.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Integer>
{
    
}
