package com.api.xclusive.repository;

import com.api.xclusive.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepo extends JpaRepository<Producto, Integer>
{

}
