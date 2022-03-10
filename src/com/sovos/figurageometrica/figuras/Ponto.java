package com.sovos.figurageometrica.figuras;
import com.sovos.figurageometrica.interfaces.FiguraGeometricaDefault;

public class Ponto implements FiguraGeometricaDefault {



    @Override
    public String getNomeFigura() {
        return "Ponto";
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public int getPerimetro() {
        return 0;
    }

    @Override
    public void getRetornaNada() {
        System.out.println("Circunferencia: "+ 0 +"\nNa Geometria, pontos não possuem volume, área, comprimento ou qualquer dimensão semelhante. ");
    }
}
