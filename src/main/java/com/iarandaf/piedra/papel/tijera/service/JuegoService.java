package com.iarandaf.piedra.papel.tijera.service;

import java.util.Random;
import java.util.Scanner;

import com.iarandaf.piedra.papel.tijera.dominio.JugadorHumano;
import com.iarandaf.piedra.papel.tijera.dominio.JugadorMaquina;

public class JuegoService {

	private int leerHumano() {
		String opcion;
		int seleccion = 0;

		System.out.println("Seleccione una de las tres opciones: ");

		Scanner teclado = new Scanner(System.in);

		opcion = teclado.next().toLowerCase();

		if (opcion.equals("piedra")) {
			seleccion = 0;
		} else {
			if (opcion.equals("papel")) {
				seleccion = 1;
			} else if (opcion.equals("tijera")) {
				seleccion = 2;
			}
		}
		return seleccion;
	}

	private int leerMaquina() {
		Random random = new Random();
		return random.nextInt(3);
	}

	public void empezarJuego(JugadorHumano jugadorHumano, JugadorMaquina jugadorMaquina) {
		int numHumano, numMaquina;
		int contadorMaquina = 0;
		int contadorUsuario = 0;

		System.out.println("Bienvenido a Piedra, Papel o Tijera");
		System.out.println("-----------------------------------");

		do {
			numHumano = leerHumano();
			jugadorHumano.setTipoJugada(numHumano);

			numMaquina = leerMaquina();
			jugadorMaquina.setTipoJugada(numMaquina);

			if (jugadorMaquina.getTipoJugada() == jugadorHumano.getTipoJugada()) {
				System.out.println("Empate!");
			} else if ((jugadorMaquina.getTipoJugada() == 0 && jugadorHumano.getTipoJugada() == 2)
					|| (jugadorMaquina.getTipoJugada() == 1 && jugadorHumano.getTipoJugada() == 0)
					|| (jugadorMaquina.getTipoJugada() == 2 && jugadorHumano.getTipoJugada() == 1)) {
				System.out.println("Has perdido!");
				contadorMaquina++;
			} else {
				System.out.println("Has ganado!");
				contadorUsuario++;
			}
			System.out.printf("Jugador: %d | Máquina: %d \n", contadorUsuario, contadorMaquina);
		} while (contadorMaquina < 3 && contadorUsuario < 3);

		System.out.printf("Final!!");
		System.out.printf("Jugador: %d | Máquina: %d \n", contadorUsuario, contadorMaquina);
	}

}
