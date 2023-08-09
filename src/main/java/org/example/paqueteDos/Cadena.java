package org.example.paqueteDos;

public class Cadena extends Supermercado{
    private Integer numeroSucursales;
    private Integer numeroPuntos;

    public Cadena() {
    }

    @Override
    public Double pagarCompra() throws Exception {
        if(this.numeroPuntos>100){
            return 100000-(100000*0.2);
        } else{
            throw new Exception("No puede pagar con puntos");
        }
    }

    public Cadena(String nombre, String nit, Integer valorInventario, Integer numeroSucursales) {
        super(nombre, nit, valorInventario);
        this.numeroSucursales = numeroSucursales;
    }

    public Integer getNumeroSucursales() {
        return numeroSucursales;
    }

    public void setNumeroSucursales(Integer numeroSucursales) {
        this.numeroSucursales = numeroSucursales;
    }

    public Boolean registrarCliente(String nombre, String contrasena, String contrasena2){

        if(contrasena.equals(contrasena2)){
            return true;
        } else{
            return false;
        }
    }

    public Integer getNumeroPuntos() {
        return numeroPuntos;
    }

    public void setNumeroPuntos(Integer numeroPuntos) {
        this.numeroPuntos = numeroPuntos;
    }

}
