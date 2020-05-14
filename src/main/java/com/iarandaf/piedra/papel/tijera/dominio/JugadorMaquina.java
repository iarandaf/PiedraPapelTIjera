package com.iarandaf.piedra.papel.tijera.dominio;

public class JugadorMaquina extends Jugador {

	protected int tipoJugada;

	@Override
	public int getTipoJugada() {
		return tipoJugada;
	}

	@Override
	public void setTipoJugada(int tipoJugada) {
		this.tipoJugada = tipoJugada;
	}

}
