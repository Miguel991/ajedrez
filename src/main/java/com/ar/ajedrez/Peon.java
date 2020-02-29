package com.ar.ajedrez;

public class Peon extends Ficha {

    public Peon(Color color) {
        super(color);
    }

    @Override
    public Movimientos obtenerMovimientosDeFicha() {
        return Movimientos.PEON;
    }
}
