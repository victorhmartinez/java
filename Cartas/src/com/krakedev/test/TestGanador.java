package com.krakedev.test;



import java.util.ArrayList;

import com.krakedev.entidades.Jugadores;
import com.krakedev.servicios.Juego;

public class TestGanador {

    public static void main(String[] args) {

        Jugadores jugadores = new Jugadores();
        ArrayList<String> listaJugadores = new ArrayList<>();
        listaJugadores.add("jugador 1");
        listaJugadores.add("jugador 2");
        listaJugadores.add("jugador 3");
        jugadores.setJugadores(listaJugadores);

       Juego juego = new Juego(jugadores.getJugadores());
        juego.entregarCartas(5);

        for (int i = 0; i < jugadores.getJugadores().size(); i++) {
            int total = juego.devolverTotal(i);
            System.out.println("Total del jugador " + (i + 1) + ": " + total);
        }

        String ganador = juego.determinarGanador();
        System.out.println("El ganador es: " + ganador);
    }
}
