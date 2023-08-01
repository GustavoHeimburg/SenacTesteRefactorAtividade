package com.senac.refactor;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner PI = new Scanner(System.in);

        System.out.println("""
                1- Calculos de area
                2- Calculos de perimetro
                3- Calculos de volume
                4- Calculos de areaasdadsad""");

        int CalculoDeArea = PI.nextInt();
        PI.nextLine();

    }
    public double calculaAreaDoCirculo(double raio) {
        double area = Math.PI * raio * raio;
        return area;
    }

    public double calculaPerimetroDoCirculo(double raio) {
        double perimetro = 2 * Math.PI * raio;
        return perimetro;
    }

    public double calculaVolumeDaEsfera(double raio) {
        double volume = (4 * Math.PI * raio * raio * raio) / 3;
        return volume;
    }

    public double calculaAreaDaSuperficieDaEsfera(double raio) {
        double area = 4 * Math.PI * raio * raio;
        return area;
    }
}
