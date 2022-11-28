package Exercicios;

import java.util.Scanner;

/* */
public class ex06 {
    public static void main(String[] args) {
        var alunos = 0;
        var i = 0;
        var notaUm = 0;
        var notaDois = 0;
        var mediaDuasNotas = 0;
        var totalAlunosAprovados = 0;
        var totalAlunosExame = 0;
        var totalAlunosReprovados = 0;
        var mediaDaClasse = 0;


        for (i=0; i<6; i++){

            Scanner leitor1 = new Scanner(System.in);
            System.out.println("Primeira nota: ");
            notaUm = leitor1.nextInt();

            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Segunda nota: ");
            notaDois = leitor2.nextInt();
            
            mediaDuasNotas = (notaUm + notaDois) / 2;

            if (mediaDuasNotas < 3){
                System.out.println("Reprovado!");
                totalAlunosReprovados++;

            } else if (mediaDuasNotas >=3 && mediaDuasNotas <7) {
                System.out.println("Exame");
                totalAlunosExame++;

                
            } else if (mediaDuasNotas >= 7){
                System.out.println("Aprovado! ");
                totalAlunosAprovados++;
            }
            mediaDaClasse += mediaDuasNotas / 6; // tirar dúvida!!!!!!


        }
        System.out.println("O total de alunos aprovados foi: "+ totalAlunosAprovados);
        System.out.println("O total de alunos para fazer exame é: " + totalAlunosExame);
        System.out.println("O total de alunos reprovados foi: " + totalAlunosReprovados);
        System.out.println("Média da classe foi: " + mediaDaClasse);
    }

}
