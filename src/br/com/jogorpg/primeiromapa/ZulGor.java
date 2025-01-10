package br.com.jogorpg.primeiromapa;

import br.com.jogorpg.habilidades.Jogador;

public class ZulGor{
    private int saude;
    private int ataque;
    private int defesa;

    public ZulGor() {
        this.saude = 150;
        this.ataque = 30;
        this.defesa = 20;
    }

    public void atacar(Jogador jogador) {  // método para atacar o jogador;
        int dano = ataque - jogador.getDefesa();
        if (dano > 0) {
            jogador.setSaude(jogador.getSaude() - dano);
            System.out.println("Zul'Gor atacou você e causou " + dano + " de dano.");
        } else {
            System.out.println("Zul'Gor tentou atacar, mas sua defesa é muito forte!");
        }
    }

    public boolean estaVivo(){ // método para verificar se o vilão está vivo;
        return saude > 0;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
