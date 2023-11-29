package com.api.xclusive.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "orden")
public class Orden
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOrden")
    private Integer idOrden;
    @ManyToMany
    private List<Producto> productos;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "total")
    private Double total;
    @Column(name = "status")
    private String status;

    public Orden() {
    }

    public Orden(Integer idOrden, List<Producto> productos, String direccion, Double total, String status) {
        this.idOrden = idOrden;
        this.productos = productos;
        this.direccion = direccion;
        this.total = total;
        this.status = status;
    }

    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
