package com.ar.ajedrez;

import java.util.*;

public class Tablero {

   private Map<Posicion, Casilla> casillas;

   public Tablero(){
       this.casillas = crearCasillas();
   }

    private Map<Posicion, Casilla> crearCasillas() {

       Map<Posicion, Casilla> casillas = new HashMap<>();

        for (Posicion posicion: Posicion.values()) {
            casillas.put(posicion, new Casilla());
        }

       return casillas;
    }

    public void añadirPieza(Ficha peon, Posicion posicionActual) {
        peon.setPosicion(posicionActual);
        Casilla casilla = new Casilla();
        casilla.setFicha(peon);
        this.casillas.put(posicionActual,casilla);
    }

    public Ficha obtenerPieza(Posicion origen) {
        return this.casillas.get(origen).getFicha();
    }

    public void moverPieza(Posicion origen,Posicion destino ) {

        Casilla casillaOrigen = this.casillas.get(origen);
        Casilla casillaDestino =  new Casilla();

        Ficha ficha = casillaOrigen.getFicha();
        ficha.setPosicion(destino);

        casillaOrigen.setFicha(null);
        casillaDestino.setFicha(ficha);

        this.casillas.put(destino, casillaDestino);

    }

    public List<Posicion> obtenerPosicionesValidasAPartirDeLa(Posicion posicion) {

       Ficha ficha = this.casillas.get(posicion).getFicha();

       Movimientos movimientosFicha = ficha.obtenerMovimientosDeFicha();

       List<Posicion> posicionesDisponibles = validarMovimiento(movimientosFicha, posicion,ficha.getNombre());

       return posicionesDisponibles;
    }

    private List<Posicion> validarMovimiento(Movimientos movimientosFicha, Posicion posicion, String nombre) {

       String puntoCardinal = movimientosFicha.obtenerPuntoCardinalPorNombre(nombre);


       return null;
    }
}
