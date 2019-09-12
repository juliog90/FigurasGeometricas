package com.clasesutt;

public class FiguraBase {
    public double calcularArea() { return 0; }

    public double calcularPerimetro() { return 0; }

    public String getNombreFigura(FiguraBase figura) {
        return "La figura es un " + figura.getClass().getSimpleName();
    }
}
