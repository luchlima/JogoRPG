package br.com.jogorpg.primeiromapa;

import java.util.Random;

public class GrumThar extends Viloes{

    public GrumThar(String nome, double saude, double ataque, double defesa) {
        super(nome, saude, ataque, defesa);
    }

    @Override
    public void receberDano(double dano) {
        super.receberDano(dano);
    }
    @Override
    public void defender(double dano) {
        Random random = new Random();
        int chanceDefesa = random.nextInt(100);

        if (chanceDefesa < 50){
            System.out.println(nome + " conjura um feitiço defensivo e se defende do ataque!");
        } else {
            super.defender(dano);
        }
    }
}
