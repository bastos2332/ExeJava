package Exercicios;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        var creditosGalacticos = 0;
        var percentualAumento = 0;
        var novoC = 0;

        Scanner leitor1 = new Scanner(System.in);
        System.out.println("Qual o valor? ");
        creditosGalacticos = leitor1.nextInt();

        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Qual o percentual de aumento? ");
        percentualAumento = leitor2.nextInt();

        novoC = ((percentualAumento * creditosGalacticos) / 100) + creditosGalacticos;

        System.out.println("Os créditos galacticos com o aumento ficou de: " + novoC);


    }
}
