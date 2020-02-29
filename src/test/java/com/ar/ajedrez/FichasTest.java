package com.ar.ajedrez;

import com.sun.xml.internal.ws.policy.AssertionSet;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class FichasTest {

    @Test
    public void crearPeonConColorBlanco() {

        Ficha peon = new Peon(Color.BLANCO);
        Assertions.assertThat(peon.getColor()).isEqualTo(Color.BLANCO);
    }

    @Test
    public void crearPeonConColorNegro() {

        Ficha peon = new Peon(Color.NEGRO);
        Assertions.assertThat(peon.getColor()).isEqualTo(Color.NEGRO);
    }

    @Test
    public void crearCaballoConColorBlanco(){
        Ficha caballo = new Caballo(Color.BLANCO);

        Assertions.assertThat(caballo.getColor()).isEqualTo(Color.BLANCO);
    }

    @Test
    public void crearCaballoConColorNegro(){
        Ficha caballo = new Caballo(Color.NEGRO);

        Assertions.assertThat(caballo.getColor()).isEqualTo(Color.NEGRO);
    }

    @Test
    public void crearAlfilConColorBlanco(){
        Ficha alfil = new Alfil(Color.BLANCO);

        Assertions.assertThat(alfil.getColor()).isEqualTo(Color.BLANCO);
    }

    @Test
    public void crearAlfilConColorNegro(){
        Ficha alfil = new Alfil(Color.NEGRO);

        Assertions.assertThat(alfil.getColor()).isEqualTo(Color.NEGRO);
    }

    @Test
    public void crearTorreConColorBlanco(){
        Ficha torre = new Torre(Color.BLANCO);

        Assertions.assertThat(torre.getColor()).isEqualTo(Color.BLANCO);
    }

    @Test
    public void crearTorreConColorNegro(){
        Ficha alfil = new Alfil(Color.NEGRO);

        Assertions.assertThat(alfil.getColor()).isEqualTo(Color.NEGRO);
    }

    @Test
    public void crearReyConColorBlanco(){
        Ficha rey = new Rey(Color.BLANCO);

        Assertions.assertThat(rey.getColor()).isEqualTo(Color.BLANCO);
    }

    @Test
    public void crearReyConColorNegro(){
        Ficha alfil = new Alfil(Color.NEGRO);

        Assertions.assertThat(alfil.getColor()).isEqualTo(Color.NEGRO);
    }

    @Test
    public void crearReinaConColorBlanco(){
        Ficha reina = new Reina(Color.BLANCO);

        Assertions.assertThat(reina.getColor()).isEqualTo(Color.BLANCO);
    }

    @Test
    public void crearReinaConColorNegro(){
        Ficha reina = new Reina(Color.NEGRO);

        Assertions.assertThat(reina.getColor()).isEqualTo(Color.NEGRO);
    }
}

