package com.senac.refactor;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                1- Calculos de area
                2- Calculos de perimetro
                3- Calculos de volume
                4- Calculos de area""");

        int option = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o valor do raio: ");
        double raio = scanner.nextDouble();
        scanner.nextLine();

        Circle circle = new Circle();
        switch (option) {
            case 1:
                double area = circle.calculaAreaDoCirculo(raio);
                System.out.println("A área do círculo é: " + area);
                break;
            case 2:
                double perimetro = circle.calculaPerimetroDoCirculo(raio);
                System.out.println("O perímetro do círculo é: " + perimetro);
                break;
            case 3:
                double volume = circle.calculaVolumeDaEsfera(raio);
                System.out.println("O volume da esfera é: " + volume);
                break;
            case 4:
                double areaSuperficie = circle.calculaAreaDaSuperficieDaEsfera(raio);
                System.out.println("A área da superfície da esfera é: " + areaSuperficie);
                break;
            default:
                System.out.println("Opção inválida.");
        }
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
