package br.com.jogorpg.personagens;

import br.com.jogorpg.habilidades.Jogador;
import br.com.jogorpg.primeiromapa.PrimeiroMapa;

public class Arqueiro extends Jogador {
    PrimeiroMapa primeiroMapa = new PrimeiroMapa();

    private String armaArqueiro;
    private int flechas;
    protected double saude;
    protected double ataque;
    protected double defesa;


    public void arqueiroScore(double saude, double ataque, double defesa){
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

    public void msgArqueiro(){
        System.out.println("""
                ===============================================================================================
                O Arqueiro é mestre no combate à distância, utilizando seu arco para atingir inimigos de longe.
                Ele é ágil e pode se mover rapidamente para evitar ataques, além de ter um grande alcance.
                ===============================================================================================
                """);
        primeiroMapa.msgComeco();
    }



}
