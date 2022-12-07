package co.sofka.cardgame.domain;

public class Juego {
    private final Podium podium;
    private final Pista pista;

    public Juego() {
        this.pista = new Pista();
        this.podium = new Podium();
    }
}
