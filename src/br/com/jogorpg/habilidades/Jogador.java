package br.com.jogorpg.habilidades;

import br.com.jogorpg.personagens.Inicial;

public class Jogador{
    protected double saude;
    protected double ataque;
    protected double defesa;


    public Jogador(double saude, double ataque, double defesa){
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

    public void receberDano() {
        double porcentagemDano = 25;
        // Calcula o dano que o personagem vai receber com base na porcentagem do ataque do inimigo;
        double dano = (porcentagemDano / 100) * ataque; // Dano proporcional ao ataque do inimigo;

        // Considera a defesa do personagem para reduzir o dano;
        dano -= (dano * defesa / 100); // Reduz dano com base na defesa;
        if (dano < 0){
            dano = 0;
        }
        saude -= dano; // Subtrai o dano de saúde do persongem;

        if (saude < 0){ // Garante que a saúde não fique negativa;
            saude = 0;
        }
        System.out.println("Você recebeu " + dano + " de dano. Saúde restante: " + getSaude());
    }


}
