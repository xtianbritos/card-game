package co.sofka.cardgame;

import co.sofka.cardgame.domain.Carro;
import co.sofka.cardgame.domain.Conductor;
import co.sofka.cardgame.domain.Juego;
import co.sofka.cardgame.domain.Podium;

public class Aplication {

    public static void main(String[] args) {
        int numCarriles = 3;
        int kilometros = 200;
        Juego juego = new Juego(numCarriles, kilometros, "Pista#Los Andes");

        Carro rojo = new Carro(Carro.Color.ROJO, "XX1");
        rojo.agregarConductor(new Conductor("C1", "Raul", "raul@email.com", "raul"));

        Carro azul = new Carro(Carro.Color.AZUL, "XX2");
        azul.agregarConductor(new Conductor("C2", "Andres", "andres@email.com", "andres"));

        Carro verde = new Carro(Carro.Color.NEGRO, "XX3");
        verde.agregarConductor(new Conductor("C3", "Pedro", "pedro@email.com", "pedro"));

        Carro blanco = new Carro(Carro.Color.BLANCO, "XX4");
        blanco.agregarConductor(new Conductor("C4", "Ana", "ana@email.com", "ana"));

        juego.agregarCarroACarril(1, rojo);
        juego.agregarCarroACarril(2, azul);
        juego.agregarCarroACarril(3, verde);
        juego.agregarCarroACarril(1, blanco);

        Podium podium = juego.iniciarJuego();
        System.out.println(podium);
    }
}
