package Exercicios;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        var salarioBruto= 0;
        var valorPrestacao = 0;
        var valorMaxPrest = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        salarioBruto = leitor.nextInt();

        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Quanto você quer pagar por prestação? ");
        valorPrestacao = leitor2.nextInt();

        valorMaxPrest = (30 * salarioBruto) / 100;

        if (valorPrestacao < valorMaxPrest ){
            System.out.println("Emprestimo Aprovado!");
        } else {
            System.out.println("Emprestimo não Aprovado! ");
        }
    }
}
