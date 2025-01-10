package br.com.jogorpg.primeiromapa;

public class ZulGor{
    private String nome;
    private double saude;
    private double ataque;
    private double defesa;

    public ZulGor(String nome, double saude, double ataque, double defesa){
       this.nome = nome;
       this.saude = saude;
       this.ataque = ataque;
       this.defesa =defesa;
    }


    public boolean estaVivo(){
        return saude > 0;
    }
}
