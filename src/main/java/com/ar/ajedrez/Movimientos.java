package com.ar.ajedrez;

import java.util.HashMap;
import java.util.Map;

public enum Movimientos {

    PEON("peon","1N/","2N"),
    CABALLO("caballo", "2N-1E/","2N-1O/", "1N-2E"),
    ALFIL("alfil", "2N-2E", "6N-6O"),
    TORRE("torre", "7N", "7O"),
    Rey("rey", "1N", "1E", "1O"),
    Reina("reina", "7N", "3E", "4O");

    Movimientos(String nombre, String n, String s) {
        this.puntoCardinal = n + s;
        this.nombre = nombre;
    }

    Movimientos(String nombre, String s, String s1, String s2) {
        this.puntoCardinal = s + s1 + s2;
        this.nombre = nombre;
    }

    private static Map<String, String> puntosCardinales = new HashMap<>();
    private String puntoCardinal;
    private String nombre;

    static {

        for (Movimientos movimiento : values()) {
            puntosCardinales.put(movimiento.nombre, movimiento.puntoCardinal);
        }

    }



    public String obtenerPuntoCardinalPorNombre(String nombre) {
        return puntosCardinales.get(nombre);
    }
}
