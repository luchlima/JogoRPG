package br.com.jogorpg.personagens;

import br.com.jogorpg.habilidades.Jogador;

public class Lanceiro extends Jogador{
    public Lanceiro(String nome) {
        super(nome, 90, 28, 18, "Lanceiro");
    }

    public void ataqueLongo() {
        System.out.println("Lanceiro realiza um ataque à distância!");
    }

    public void msgLanceiro(){
        System.out.println("""
                ====================================================================================================
                       O Lanceiro é um combatente que usa sua lança para atacar de uma distância intermediária.
                Ele é especializado em ataques rápidos e precisos e é capaz de atacar vários inimigos de uma só vez.
                ====================================================================================================
                """);
    }
}
