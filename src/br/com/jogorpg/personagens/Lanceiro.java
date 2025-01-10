package br.com.jogorpg.personagens;

import br.com.jogorpg.habilidades.Jogador;
import br.com.jogorpg.primeiromapa.PrimeiroMapa;

public class Lanceiro extends Jogador {
    PrimeiroMapa primeiroMapa = new PrimeiroMapa();
    protected double saude;
    protected double ataque;
    protected double defesa;


    public void lanceiroScore(double saude, double ataque, double defesa){
        this.saude = saude;
        this.ataque = ataque;
        this.defesa = defesa;
    }
    public double getSaude() {
        return saude;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getDefesa() {
        return defesa;
    }

    public void msgLanceiro(){
        System.out.println("""
                ====================================================================================================
                       O Lanceiro é um combatente que usa sua lança para atacar de uma distância intermediária.
                Ele é especializado em ataques rápidos e precisos e é capaz de atacar vários inimigos de uma só vez.
                ====================================================================================================
                """);
        primeiroMapa.msgComeco();
    }
}
