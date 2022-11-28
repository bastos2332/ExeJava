package Exercicios;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        var diariaCrua = 40;
        var dias = 0;
        var valorDias = 0;
        var contaCliente = 0;
        var i = 0;
        var nomeCliente = "";
        var totalArrecadado = 0;

        while (i < 5 ) {
            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Qual o seu nome? ");
            nomeCliente = leitor2.nextLine();

            Scanner leitor1 = new Scanner(System.in);
            System.out.println("Quantos dias você passará? ");
            dias = leitor1.nextInt();

            if (dias < 10) {
                valorDias = dias * 15;
            } else if (dias >= 10) {
                valorDias = dias * 8;
            }
            contaCliente = diariaCrua + valorDias;
            totalArrecadado += contaCliente;
            System.out.println("a conta do cliente " + nomeCliente + " tem o valor de: " + contaCliente);
            i++;
        }
        System.out.println("O arrecadado neste período foi de: " + totalArrecadado);

    }
}
