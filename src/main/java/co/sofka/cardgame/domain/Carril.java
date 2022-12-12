package co.sofka.cardgame.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Carril {
    private final Integer numero;
    private final Integer kilometros;
    private List<Carro> carros;

    public Carril(Integer numero, Integer kilometros) {
        this.kilometros = Objects.requireNonNull(kilometros);
        this.numero = Objects.requireNonNull(numero);
        this.carros = new ArrayList<>();
        if (kilometros <= 0) {
            throw new IllegalArgumentException("No es un kilómetro permitido");
        }
    }

    public void agregarCarro(Carro carro) {
        carros.add(carro);
    }

    public Integer kilometros() {
        return kilometros;
    }

    public Integer numero() {
        return numero;
    }

    public List<Carro> carros() {
        return carros;
    }

    public Integer progresoCarro(String placa) {
        for(Carro carro : this.carros) {
            if (carro.placa().equalsIgnoreCase(placa)) {
                int metros = kilometros()*1000;
                return (100*carro.metros())/metros;
            }
        }
        throw new IllegalArgumentException("No existe el carro");
    }
}
