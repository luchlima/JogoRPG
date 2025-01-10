package br.com.jogorpg.habilidades;

import br.com.jogorpg.personagens.Inicial;


public class Jogador extends Inicial {
    protected double saude;
    protected double ataque;
    protected double defesa;

    public double getSaude() {
        return saude;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getDefesa() {
        return defesa;
    }

    public boolean estaVivo(){
        return saude > 0;
    }


}
