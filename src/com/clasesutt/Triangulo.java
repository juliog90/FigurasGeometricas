package com.clasesutt;

public class Triangulo extends FiguraBase {
    private int base = 0;
    private int altura = 0;

    public int getBase(){
        return this.base;
    }

    public void setBase(int valor) {
        this.base = valor;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int valor) {
        this.altura = valor;
    }

    public double calcularArea() {
        return this.base * this.altura / 2;
    }

    public double calcularPerimetro() {
        return this.base * 3;
    }

    public double calcularPerimetro(int ladoA, int ladoB) {
        return (2 * ladoA + ladoB);
    }

    public double calcularPerimetro(int ladoA, int ladoB, int ladoC) {
        return ladoA + ladoB + ladoC;
    }
}
