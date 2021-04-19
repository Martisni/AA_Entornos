package com.sanvalero.domain;

import java.util.Objects;

public class Tartas {
    private String nombre;
    private String sabor;
    private int cantidad;
    private float precio;
    private String descripcion;

    public Tartas() {
    }

    public Tartas(String nombre, String sabor, int cantidad, float precio, String descripcion) {
        this.nombre = nombre;
        this.sabor = sabor;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tartas tartas = (Tartas) o;
        return cantidad == tartas.cantidad && Float.compare(tartas.precio, precio) == 0 && Objects.equals(nombre, tartas.nombre) && Objects.equals(sabor, tartas.sabor) && Objects.equals(descripcion, tartas.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, sabor, cantidad, precio, descripcion);
    }
}
