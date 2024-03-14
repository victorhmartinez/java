package com.krakedev.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;
	

	public Naipe() {
		numerosPosibles = new ArrayList<Numero>();
		cartas = new ArrayList<Carta>();

		numerosPosibles.add(new Numero("A", 11));
		numerosPosibles.add(new Numero("2", 2));
		numerosPosibles.add(new Numero("3", 3));
		numerosPosibles.add(new Numero("4", 4));
		numerosPosibles.add(new Numero("5", 5));
		numerosPosibles.add(new Numero("6", 6));
		numerosPosibles.add(new Numero("7", 7));
		numerosPosibles.add(new Numero("8", 8));
		numerosPosibles.add(new Numero("9", 9));
		numerosPosibles.add(new Numero("10", 10));
		numerosPosibles.add(new Numero("J", 10));
		numerosPosibles.add(new Numero("Q", 10));
		numerosPosibles.add(new Numero("K", 10));
		
		for (int i = 0; i < numerosPosibles.size(); i++) {
			 Palos palo = new Palos();
			Carta carta1 = new Carta(numerosPosibles.get(i), palo.getCorazonNegro());
			Carta carta2 = new Carta(numerosPosibles.get(i), palo.getCorazonRojo());
			Carta carta3 = new Carta(numerosPosibles.get(i), palo.getDiamante());
			Carta carta4 = new Carta(numerosPosibles.get(i), palo.getTrebol());
			cartas.add(carta1);
			cartas.add(carta2);
			cartas.add(carta3);
			cartas.add(carta4);
		}
	}

	public ArrayList<Numero> getNumerosPosibles() {
		return numerosPosibles;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

		public ArrayList<Carta> barajar() {
		/*	Random random = new Random();
			   ArrayList<Carta> auxiliar = new ArrayList<Carta>();
			    ArrayList<Carta> cartasDisponibles = new ArrayList<>(cartas);

			    
			    while (!cartasDisponibles.isEmpty()) {
			        int posicion = random.obtenerPosicion() % cartasDisponibles.size(); // Generar número aleatorio entre 0 y cartasDisponibles.size() - 1
			        Carta carta = cartasDisponibles.remove(posicion);
			        auxiliar.add(carta);
			    }

			    return auxiliar;*/
			Random random = null;
			ArrayList<Carta> auxiliar = new ArrayList<Carta>();
		
				for (int i = 1; i < 100; i++) {
					int posicion = random.obtenerPosicion();
					Carta cartaElemento = cartas.get(posicion);
					if (cartaElemento.getEstado().equals("N")) {
						auxiliar.add(cartaElemento);
						cartaElemento.setEstado("C");
					}
				}
	
			for (int i = 0; i <cartas.size(); i++) {
				Carta carta=cartas.get(i);
				if(carta.getEstado().equals("N")) {
					auxiliar.add(carta);
					carta.setEstado("C");
				}
			}
		
			return auxiliar; 
		}
}
