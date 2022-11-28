package Exercicios;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        var funcionario = "";
        while (!funcionario.equalsIgnoreCase("fim")) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o nome do funcionário: ");
            funcionario = leitor.nextLine();

            int salario = 0;
            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Digite seu respectivo salário: ");
            salario = leitor2.nextInt();

            int novoSalario = 0;
            int aumento = 0;
            if (salario < 500) {
                aumento = (20 * salario) / 100;
                novoSalario = salario + aumento;
            } else {
                System.out.println("Seu salário não houve reajuste!");

            }
            System.out.println("o novo salário de " + funcionario + " é " + novoSalario);

            Scanner leitor3 = new Scanner(System.in);
            System.out.println("Funcionário ou fim? ");
            funcionario = leitor3.nextLine();


        }

    }
}
