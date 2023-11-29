package com.api.xclusive.repository;

import com.api.xclusive.entity.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenRepo extends JpaRepository<Orden, Integer>
{
}
