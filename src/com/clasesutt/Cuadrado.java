package com.clasesutt;

public class Cuadrado extends FiguraBase{
    private int lado = 1;

    public int getLado() {
        return lado;
    }

    public void setLado(int valor) {
        this.lado = valor;
    }

    public double calcularArea() {
        return (this.lado * this.lado);
    }

    public double calcularPerimetro() {
        return (4 * this.lado);
    }
}
