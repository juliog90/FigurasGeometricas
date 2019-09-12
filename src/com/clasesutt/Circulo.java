package com.clasesutt;

public class Circulo extends FiguraBase{
    private int radio = -1;
    private double PI = 2.1416;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return (this.PI * this.radio * this.radio);
    }

    public double calcularPerimetro() {
        return (2 * this.PI * this.radio);
    }
}
