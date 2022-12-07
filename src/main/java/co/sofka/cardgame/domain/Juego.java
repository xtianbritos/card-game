package co.sofka.cardgame.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Juego {
    private final Podium podium;
    private final Pista pista;
    private Estado estado;

    public Juego(Integer numCarriles, Integer kilometros, String nombreDePista) {
        Map<Integer, Carril> carriles = generarCarriles(numCarriles, kilometros);
        pista = new Pista(UUID.randomUUID().toString(), carriles, nombreDePista);
        this.podium = new Podium();
    }

    private Map<Integer, Carril> generarCarriles(Integer numCarriles, Integer kilometros) {
        Map<Integer, Carril> carriles = new HashMap<>();
        for (int i = 1; numCarriles >= i ; i++) {
            carriles.put(i, new Carril(i, kilometros));
        }
        return carriles;
    }

    private void finDelJuego() {
        estado = Estado.FINALIZADO;
    }

    public enum Estado {
        INICIADO, FINALIZADO, NO_INICIADO
    }
}
