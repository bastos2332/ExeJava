import java.beans.JavaBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pacientes P1 = new Pacientes("","",0,0,0);
        Pacientes P2 = new Pacientes("","",0,0,0);
        Pacientes P3 = new Pacientes("","",0,0,0);
        Pacientes P4 = new Pacientes("","",0,0,0);

        String[] nomePacientes = {P1.getNome(),P2.getNome(),P3.getNome(),P4.getNome()};
        String[] sexoPacientes = {P1.getSexo(),P2.getSexo(), P3.getSexo(),P4.getSexo()};
        int[] idadePacientes = {P1.getIdade(),P2.getIdade(),P3.getIdade(),P4.getIdade()};
        double[] pesoPacientes = {P1.getPeso(),P2.getPeso(), P3.getPeso(),P4.getPeso()};
        double[] alturaPacientes = {P1.getAltura(),P2.getAltura(),P3.getAltura(),P4.getAltura()};

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < nomePacientes.length; i++){
            System.out.println("Digite o nome do " + (i+1) +"º paciente");
            String nome = sc.next();
            nomePacientes[i] = nome;
        }
        for(int i = 0; i < sexoPacientes.length; i++) {
            System.out.println("Digite o sexo do " + (i + 1) + "º paciente(M,F)");
            String sexo = sc.next().toUpperCase();
            if (sexo.length() > 1) {
                System.out.println("Digite o que foi propsto pelo programa. Reinicie o programa");
                break;
            } else {
                sexoPacientes[i] = sexo;
            }
        }
        for(int i = 0; i < idadePacientes.length; i++) {
            System.out.println("Digite a idade do " + (i + 1) + "º paciente");
            int idade = sc.nextInt();
            if (idade < 1 && idade > 130) {
                System.out.println("Digite idade valida. Reinicie o programa");
                break;
            } else {
                idadePacientes[i] = idade;
            }
        }
        for(int i = 0; i < pesoPacientes.length; i++) {
            System.out.println("Digite o peso do " + (i + 1) + "º paciente");
            double peso = sc.nextDouble();
            if (peso < 1) {
                System.out.println("Digite peso valido. Reinicie o programa");
                break;
            } else {
                pesoPacientes[i] = peso;
            }
        }
        for(int i = 0; i < alturaPacientes.length; i++) {
            System.out.println("Digite a altura do " + (i + 1) + "º paciente");
            double altura = sc.nextDouble();
            if (altura < 0) {
                System.out.println("Digite uma altura valida. Reinicie o programa");
                break;
            } else {
                alturaPacientes[i] = altura;

            }
        }

        //Fim dos pacientes//
        System.out.println("A lista de pacientes:");
        for(int i = 0; i < nomePacientes.length; i++){
            System.out.println("Paciente: "+(i + 1) + " |nome:"+ nomePacientes[i]+ " | sexo:"+ sexoPacientes[i] + " | idade:"+ idadePacientes[i] + " | peso:"+ pesoPacientes[i] + " | altura:"+ alturaPacientes[i]);
        }

        int qtdTotalHomens = 0;
        for(int i = 0; i < nomePacientes.length; i++){
            if(sexoPacientes[i].contains("M")){
                qtdTotalHomens += 1;
            }
        }
        System.out.println("O total de pacientes masculinos é: " + qtdTotalHomens);

        int qtdTotaIdadeHomens = 0;
        for(int i = 0; i < idadePacientes.length;i++){
            if(sexoPacientes[i].contains("M")){
                qtdTotaIdadeHomens += idadePacientes[i];
            }
        }
        if(qtdTotalHomens == 0){
            System.out.println("Não existem pacientes masculinos cadastrados.");
        }else {
            int mediaIdadeH = qtdTotaIdadeHomens / qtdTotalHomens;
            System.out.println("A média de idade dos homens é: " + mediaIdadeH);
        }

        int qtdMulherPesoAltura = 0;
        for(int i = 0; i < alturaPacientes.length; i++){
            if (sexoPacientes[i].contains("F")) {
                if(pesoPacientes[i] > 70 && alturaPacientes[i] > 1.60 && alturaPacientes[i] < 1.70){
                    qtdMulherPesoAltura += 1;
                }
            }
        }
        System.out.println("A quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg é: " +qtdMulherPesoAltura);

        int qtdIdade = 0;
        for (int i = 0; i < idadePacientes.length; i++){
            if(idadePacientes[i] >= 18 && idadePacientes[i] <= 25){
                qtdIdade += 1;
            }
        }

        System.out.println("A quantidade de pessoas com idade entre 18 e 25 anos é: " + qtdIdade);

        int idade = 0;
        String nomeMaisVelho = "";
        for(int i = 0; i < nomePacientes.length; i ++){

            if(idade < idadePacientes[i]){
                idade = idadePacientes[i];
                nomeMaisVelho = nomePacientes[i];
            }
        }

        System.out.println("O paciente com idade mais avançada é: " + nomeMaisVelho);

        ArrayList<Double> alturaMulheres = new ArrayList<Double>();
        for(int i = 0; i < alturaPacientes.length; i++){
            if (sexoPacientes[i].contains("F")) {
                alturaMulheres.add(alturaPacientes[i]);
            }
        }
        double menorAltura = Collections.min(alturaMulheres);
        String nomeMenorAltura = "";
        for(int i = 0; i < alturaPacientes.length; i++){
            if(menorAltura == alturaPacientes[i]){
                nomeMenorAltura = nomePacientes[i];
            }
        }
        System.out.println("A paciente com menor altura é: " + nomeMenorAltura +". Tendo uma altura de: " + menorAltura);
    }
}