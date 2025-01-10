package br.com.jogorpg.habilidades;

import java.util.Random;

public class Ataques extends Jogador{

    public double ataqueArqueiro(){
        Random random = new Random();
        int chanceAcerto = random.nextInt(100);
        if (chanceAcerto <= 70){
            System.out.println("Você acertou um ataque certeiro na cabeça!");
            return ataque * 2;
        } else {
            System.out.println("Falhou o ataque!");
            return 0;
        }
    }

    public double ataqueGuerreiro(){
        Random random = new Random();
        int chanceAcerto = random.nextInt(100);
        if (chanceAcerto <= 50){
            System.out.println("Você acertou um ataque certeiro na cabeça!");
            return ataque * 3;
        } else {
            System.out.println("Falhou o ataque!");
            return 0;
        }
    }

    public double ataqueLanceiro(){
        Random random = new Random();
        int chanceAcerto = random.nextInt(100);
        if (chanceAcerto <= 72){
            System.out.println("Você acertou um ataque certeiro na cabeça!");
            return ataque * 4;
        } else {
            System.out.println("Falhou o ataque!");
            return 0;
        }
    }
}
