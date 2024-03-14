package com.krakedev.entidades;

import java.util.ArrayList;

import com.krakedev.servicios.Juego;

public class Jugadores {
private ArrayList<String> Jugadores;

public ArrayList<String> getJugadores() {
	return Jugadores;
}

public void setJugadores(ArrayList<String> jugadores) {
	Jugadores = jugadores;
}
public void jugar() {
	ArrayList<String> jugadores = new ArrayList<String>();
	jugadores.add("Camilo");
	jugadores.add("Sandro");
	jugadores.add("Ernesto");
	Juego juego = new Juego(jugadores);
	juego.entregarCartas(5);
	 
    int total = 0;
    for (int i = 0; i < jugadores.size(); i++) {
        total += i;
        System.out.println("Jugador " + (i + 1) + ": " + i);
    }
    System.out.println("Total: " + total);


}



}
