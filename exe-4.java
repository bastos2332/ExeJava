package Exercicios;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        int litrosGasolina = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("quantos litros você colocou?" );
        litrosGasolina = leitor.nextInt();

        var valorGasolina = litrosGasolina * 2.5;
        var valorRefri = 6;

        var valorTotal = valorGasolina + valorRefri  ;

        System.out.println("O total a pagar é: R$" + valorTotal );
        
    }
}
