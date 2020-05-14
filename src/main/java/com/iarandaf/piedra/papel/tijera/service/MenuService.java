package com.iarandaf.piedra.papel.tijera.service;

import com.iarandaf.piedra.papel.tijera.dominio.JugadorHumano;
import com.iarandaf.piedra.papel.tijera.dominio.JugadorMaquina;

public class MenuService {

	public void MenuService() {
		JugadorHumano jugadorH = new JugadorHumano();
		JugadorMaquina jugadorM = new JugadorMaquina();
		JuegoService juego = new JuegoService();
		juego.empezarJuego(jugadorH, jugadorM);

	}

}
