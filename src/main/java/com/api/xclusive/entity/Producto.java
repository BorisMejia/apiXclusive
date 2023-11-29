package com.api.xclusive.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Producto
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducto")
    private Integer idProducto;
    @Column(name = "nombreProducto")
    private String nombreProducto;
    @Column(name = "precio")
    private Double precio;
    @Column(name = "stock")
    private Short stock;

    public Producto() {
    }

    public Producto(Integer idProducto, String nombreProducto, Double precio, Short stock) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Short getStock() {
        return stock;
    }

    public void setStock(Short stock) {
        this.stock = stock;
    }
}
