package com.sanvalero.domain;

import java.util.Objects;

public class Pan {
    private String nombre;
    private String tamanio;
    private float precio;
    private int cantidad;
    private String descripcion;

    public Pan() {
    }

    public Pan(String nombre, String tamanio, float precio, int cantidad, String descripcion) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
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
        Pan pan = (Pan) o;
        return Float.compare(pan.precio, precio) == 0 && cantidad == pan.cantidad && Objects.equals(nombre, pan.nombre) && Objects.equals(tamanio, pan.tamanio) && Objects.equals(descripcion, pan.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tamanio, precio, cantidad, descripcion);
    }
}