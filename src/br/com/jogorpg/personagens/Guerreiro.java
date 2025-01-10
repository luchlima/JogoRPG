package br.com.jogorpg.personagens;

import br.com.jogorpg.habilidades.Jogador;

public class Guerreiro extends Jogador{
    public Guerreiro(String nome) {
        super(nome, 100, 30, 20, "Guerreiro");
    }

    public void habilidadeEspecial() {
        System.out.println("Guerreiro usa habilidade especial!");
    }

    public void msgGuerreiro(){
        System.out.println("""
                ==================================================================================================
                          O Guerreiro é um combatente imponente, especializado no combate corpo a corpo.
                Com sua força e resistência, ele é capaz de desferir ataques poderosos e resistir a grandes danos.
                ==================================================================================================
                """);

    }
}
