package com.clasesutt;

public class Main {

    public static void main(String[] args) {
        Cuadrado cuadro = new Cuadrado();
        cuadro.setLado(7);
        double areaCuadrado = cuadro.calcularArea();
        double perimCuadrado = cuadro.calcularPerimetro();
        String nombreCuadrado = cuadro.getNombreFigura(cuadro);
        System.out.println("El area del cuadrado es : " + areaCuadrado);
        System.out.println("El perimetro del cuadrado es :" + perimCuadrado);

        Circulo circulo = new Circulo();
        circulo.setRadio(4);
        double areaCirculo = circulo.calcularArea();
        double perimetroCirculo = circulo.calcularPerimetro();
        String nombreCirculo = circulo.getNombreFigura(circulo);

        System.out.println("El area del circulo es : " + areaCirculo);
        System.out.println("El perimetro del circulo es : " + perimetroCirculo);
        System.out.println("Nombre de la figura: " + nombreCirculo);     System.out.println("Nombre de la figura: " + nombreCuadrado);

        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(5);
        triangulo.setBase(8);

        double areaTriangulo = triangulo.calcularArea();
        double permiTriangulo = triangulo.calcularPerimetro();
        double permiIsoceles = triangulo.calcularPerimetro(3, 4);
        double periEscaleno = triangulo.calcularPerimetro(5, 6, 9);
        String nombreTriangulo = triangulo.getNombreFigura(triangulo);

        System.out.println("El area del triangulo es : " + areaTriangulo);
        System.out.println("El perimetro del triangulo es :" + permiTriangulo);
        System.out.println("El perimetro del triangulo escaleno es : " + periEscaleno);
        System.out.println("El perimetro del triangulo isoceles es : " + permiIsoceles);
        System.out.println("Nombre de la figura: " + nombreTriangulo);
    }
}
