package com.ar.ajedrez;

public abstract class Ficha {

    private String nombre;

    private Color color;

    private Posicion posicion;

    public Ficha(Color color){
        this.color = color;
    }

    abstract public Movimientos obtenerMovimientosDeFicha();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
