package br.com.jogorpg.personagens;

import br.com.jogorpg.habilidades.Jogador;
import br.com.jogorpg.primeiromapa.PrimeiroMapa;

public class Guerreiro extends Jogador {
    protected double saude;
    protected double ataque;
    protected double defesa;


    public void guerreiroScore(double saude, double ataque, double defesa){
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

    PrimeiroMapa primeiroMapa = new PrimeiroMapa();
    public void msgGuerreiro(){
        System.out.println("""
                ==================================================================================================
                          O Guerreiro é um combatente imponente, especializado no combate corpo a corpo.
                Com sua força e resistência, ele é capaz de desferir ataques poderosos e resistir a grandes danos.
                ==================================================================================================
                """);
        primeiroMapa.msgComeco();
    }
}
