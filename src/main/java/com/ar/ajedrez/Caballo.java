package com.ar.ajedrez;

public class Caballo extends Ficha {

    public Caballo(Color color) {
        super(color);
    }

    @Override
    public Movimientos obtenerMovimientosDeFicha() {
       return Movimientos.CABALLO;
    }
}
