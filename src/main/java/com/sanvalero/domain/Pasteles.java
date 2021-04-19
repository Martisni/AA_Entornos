package com.sanvalero.domain;

import java.util.Objects;

public class Pasteles {
    private String nombre;
    private int peso;
    private float precio;
    private int cantidad;
    private String descripcion;

    public Pasteles() {
    }

    public Pasteles(String nombre, int peso, String descripcion, float precio, int cantidad) {
        this.nombre = nombre;
        this.peso = peso;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Pasteles(String nombre, String tamanio, float precio, int cantidad, String descripcion) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasteles pasteles = (Pasteles) o;
        return peso == pasteles.peso && Float.compare(pasteles.precio, precio) == 0 && cantidad == pasteles.cantidad && Objects.equals(nombre, pasteles.nombre) && Objects.equals(descripcion, pasteles.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, peso, precio, cantidad, descripcion);
    }
}