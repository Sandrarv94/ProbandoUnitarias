package org.example.paqueteDos;

import java.util.ArrayList;
import java.util.List;

public abstract class Supermercado {
    protected String nombre;
    protected String nit;
    protected Integer valorInventario;
    protected List<String> productos = new ArrayList<>();

    public Supermercado() {
    }

    public Supermercado(String nombre, String nit, Integer valorInventario) {
        this.nombre = nombre;
        this.nit = nit;
        this.valorInventario = valorInventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Integer getValorInventario() {
        return valorInventario;
    }

    public void setValorInventario(Integer valorInventario) {
        this.valorInventario = valorInventario;
    }

    @Override
    public String toString() {
        return "Supermercado{" +
                "nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", valorInventario=" + valorInventario +
                '}';
    }

    public void mostrarInventario(){
        this.productos.add("Arroz");
        this.productos.add("Papas");
        System.out.println(this.productos);
    }

    public abstract Double pagarCompra() throws Exception;
}
