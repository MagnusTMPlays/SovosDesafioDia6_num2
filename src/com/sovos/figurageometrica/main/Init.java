package com.sovos.figurageometrica.main;

import com.sovos.figurageometrica.figuras.*;

public class Init {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        triangulo.setBase(3);
        triangulo.setAltura(4);
        triangulo.setLadoA(1);
        triangulo.setLadoA(2);
        triangulo.setLadoA(3);
        System.out.println("A forma geometrica é o:" +triangulo.getNomeFigura());
        System.out.println("Sua Base é: " + triangulo.getBase());
        System.out.println("Sua Altura é: " + triangulo.getAltura());
        System.out.println("Seu LadoA é: " + triangulo.getLadoA());
        System.out.println("Seu LadoB é: " + triangulo.getLadoB());
        System.out.println("Seu LadoC é: " + triangulo.getLadoC());
        System.out.println("A area do triangulo é: " + triangulo.getArea());
        System.out.println("O perimetro do triangulo é: " + triangulo.getPerimetro());
        triangulo.getRetornaNada();
        System.out.println("============================================");

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(2);
        System.out.println("A forma geometrica é o:" +quadrado.getNomeFigura());
        System.out.println("Seus Lados medem: " + quadrado.getLado());
        System.out.println("A area do quadrado é: " + quadrado.getArea());
        System.out.println("O perimetro do quadrado é: " + quadrado.getPerimetro());
        quadrado.getRetornaNada();
        System.out.println("============================================");

        Ponto ponto = new Ponto();
        System.out.println("A forma geometrica é o:" +ponto.getNomeFigura());
        System.out.println("A area do ponto é: " + ponto.getArea());
        System.out.println("O perimetro do ponto é: " + ponto.getPerimetro());
        ponto.getRetornaNada();
        System.out.println("============================================");

        Circulo circulo = new Circulo();
        circulo.setRaio(3);
        System.out.println("A forma geometrica é o:" +circulo.getNomeFigura());
        System.out.println("Seus Raio medem: " + circulo.getRaio());
        System.out.println("A area do circulo é: " + circulo.getArea());
        System.out.println("O perimetro do circulo é: " + circulo.getPerimetro());
        circulo.getRetornaNada();
        System.out.println("============================================");

        Cilindro cilindro = new Cilindro();
        cilindro.setAltura(2);
        cilindro.setRaio(3);
        System.out.println("A forma geometrica é o:" +cilindro.getNomeFigura());
        System.out.println("Sua Altura é: " + cilindro.getAltura());
        System.out.println("Seu Raio é: " + cilindro.getRaio());
        System.out.println("A area total do cilindro é: " + cilindro.getArea());
        System.out.println("A area Lateral do cilindro é: " + cilindro.getAreaLateral());
        System.out.println("A area da Base do cilindro é: " + cilindro.getAreaBase());
        cilindro.getRetornaNada();
        System.out.println("============================================");

    }
}
