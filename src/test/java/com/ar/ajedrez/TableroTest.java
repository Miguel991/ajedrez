package com.ar.ajedrez;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TableroTest {

    @Test
    public void ponerPiezaEnTablero(){

        Ficha peon = new Peon(Color.NEGRO);

        Tablero tablero = new Tablero();

        tablero.añadirPieza(peon, Posicion.A1);

        Assertions.assertThat(peon.getPosicion()).isEqualTo(Posicion.A1);
    }

    @Test
    public void obtenerPiezaDelTablero(){

        Ficha peon = new Peon(Color.NEGRO);

        Tablero tablero = new Tablero();

        tablero.añadirPieza(peon, Posicion.A1);

       Ficha peonInsertado = tablero.obtenerPieza(Posicion.A1);

        Assertions.assertThat(peonInsertado).isEqualTo(peon);
    }

    @Test
    public void moverPeonEnTablero(){

        Ficha peon = new Peon(Color.NEGRO);

        Tablero tablero = new Tablero();

        tablero.añadirPieza(peon, Posicion.A1);

        tablero.moverPieza(Posicion.A1, Posicion.A2);

        Ficha fichaEsperada = tablero.obtenerPieza(Posicion.A2);
        Ficha posicionVacia = tablero.obtenerPieza(Posicion.A1);

        Assertions.assertThat(fichaEsperada).isEqualTo(peon);
        Assertions.assertThat(fichaEsperada.getPosicion()).isEqualTo(Posicion.A2);
        Assertions.assertThat(posicionVacia).isEqualTo(null);

    }


}
