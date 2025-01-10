package br.com.jogorpg.personagens;

import br.com.jogorpg.habilidades.Jogador;

public class Arqueiro extends Jogador {
    private int flechas;

    public Arqueiro(String nome) {
        super(nome, 80, 25, 15, "Arqueiro");
        this.flechas = 20;  // Arqueiro começa com 20 flechas
    }

    public int getFlechas() {
        return flechas;
    }

    public void usarFlecha() {
        if (flechas > 0) {
            flechas--;
            System.out.println("Flecha disparada! Restam " + flechas + " flechas.");
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
