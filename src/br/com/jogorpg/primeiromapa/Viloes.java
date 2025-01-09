package br.com.jogorpg.primeiromapa;

import java.util.Random;

public class Viloes {
    protected String nome;
    protected double saude;
    protected double ataque;
    protected double defesa;

    public Viloes(String nome, double saude, double ataque, double defesa) {
    }

    public void vilao(String nome, double saude, double ataque, double defesa){
        this.nome = nome;
        this.saude = saude;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public double getSaude() {
        return saude;
    }

    public void receberDano(double dano){
        double danoFinal = dano - defesa;

        if (danoFinal > 0){
            saude -= danoFinal;
            System.out.println(nome + " recebeu " + danoFinal + " de dano!");
        } else {
            System.out.println(nome + " se defendeu totalmente do dano!");
        }

        if (saude <= 0){
            saude = 0;
            System.out.println(nome + " foi derrotado!");
            // seguir para os proximos;=============================================
        }
    }

    public void defender(double dano){
        Random random = new Random();
        int chanceDefesa = random.nextInt(100); // irá gerar uma chance de 0 a 99;

        if (chanceDefesa < 50){
            System.out.println(nome + " se defendeu do ataque!");
        } else {
            receberDano(dano);
        }
    }
}
