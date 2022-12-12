package co.sofka.cardgame.domain;

import java.util.Objects;

public class Carro {
    private final Color color;
    private final String placa;
    private Conductor conductor;
    private Integer metros;
    private boolean estaEnMarcha;


    public Carro(Color color, String placa, Integer metros) {
        this.color = Objects.requireNonNull(color);
        this.placa = Objects.requireNonNull(placa);
        this.metros = Objects.requireNonNull(metros);
        this.estaEnMarcha = false;
        if (metros < 0) {
            throw new IllegalArgumentException("No se puede tener metros negtivos");
        }
    }

    public Carro(Color color, String placa) {
        this(color, placa, 0);
    }

    public void agregarConductor(Conductor conductor) {
        this.conductor = Objects.requireNonNull(conductor);
    }

    public void iniciar() {this.estaEnMarcha = true;}

    public void aumentarMetro() {
        if (this.estaEnMarcha) {
            this.metros = metros + 1;
        }
    }

    public double kilometros() {
        return Math.ceil((double)metros/1000);
    }

    public void pararMarcha() {this.estaEnMarcha = false;}

    public Integer metros() {
        return metros;
    }

    public Conductor conductor() {
        return conductor;
    }

    public Color color() {
        return color;
    }

    public String placa() {
        return placa;
    }

    public boolean estaEnMarcha() {return estaEnMarcha;}

    public enum Color {
        ROJO, BLANCO, NEGRO, AZUL
    }

    @Override
    public String toString() {
        return "Carro{" +
                "color=" + color +
                ", placa='" + placa + '\'' +
                ", conductor=" + conductor +
                ", metros=" + metros +
                '}';
    }
}
