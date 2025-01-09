package br.com.jogorpg.personagens;

import br.com.jogorpg.primeiromapa.PrimeiroMapa;

import java.util.Random;

public class Arqueiro{
    private String armaArqueiro;
    private int flechas;

    public void ferramentas(String armaArqueiro, int flechas){
        this.armaArqueiro = armaArqueiro;
        this.flechas = flechas;
    }

    public String getArmaArqueiro() {
        return armaArqueiro;
    }

    public int getFlechas() {
        return flechas;
    }

    public void usarFlecha(){
        if (flechas > 0){
            flechas --;
            System.out.println("Flecha disparada! Flechas restantes: " + flechas);

            Random random = new Random();
            int chanceDeAcerto = random.nextInt(100); // Simulação de acerto entre 0 e 99;
            if (chanceDeAcerto < 20){
                System.out.println("Você acertou a cabeça!");
            }
        } else {
            System.out.println("Sem flechas!");
        }
    }

    public void msgArqueiro(){
        System.out.println("""
                ===============================================================================================
                O Arqueiro é mestre no combate à distância, utilizando seu arco para atingir inimigos de longe.
                Ele é ágil e pode se mover rapidamente para evitar ataques, além de ter um grande alcance.
                ===============================================================================================
                """);

    }

}
