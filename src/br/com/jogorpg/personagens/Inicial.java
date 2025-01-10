package br.com.jogorpg.personagens;
import br.com.jogorpg.habilidades.Jogador;
import br.com.jogorpg.primeiromapa.PrimeiroMapa;

import java.util.Scanner;

public class Inicial{
    Scanner leitura = new Scanner(System.in);
    private String nickJogador;

    public void setNickJogador(String nickJogador) {
        this.nickJogador = nickJogador;
    }

    public String getNickJogador() {
        return nickJogador;
    }

    public void escolhaNick(){
        System.out.println("Primeiramente, digite o nome do personagem:");
        leitura.nextLine();
        setNickJogador(leitura.nextLine());
        System.out.println("Vamos começar nossa jornada, " + getNickJogador() + "!");
        opcaoPersonagem();
    }
    public void msgInicial(){
        System.out.println("""
                ==========================================
                           Seja Bem vindo ao Game
                ==========================================
                            1 - Iniciar Jornada
                            2 - Sair
                ==========================================
                """);

        while (true){
            int opcaoInicial = leitura.nextInt();
            switch (opcaoInicial){
                case 1:
                    escolhaNick();
                    break;
                case 2:
                    System.out.println("Saindo do jogo....");
                    return;
                default:
                    System.out.println("Opção Invalida, tente novamente!");
                    break;
            }
        }
    }

    public void opcaoPersonagem() {
        System.out.println("""
                Escolha a sua classe:
                     1 - Guerreiro
                     2 - Arqueiro
                     3 - Lanceiro
                """);
        criacaoPersonagem();
    }
    public void criacaoPersonagem(){
        int classeEscolhida = leitura.nextInt();
        String nomeJogador = getNickJogador();

        Jogador jogador = null;

        while (true){
            switch (classeEscolhida){
                case 1:
                    jogador = new Guerreiro(nomeJogador);
                    break;
                case 2:
                    jogador = new Arqueiro(nomeJogador);
                    break;
                case 3:
                    jogador = new Lanceiro(nomeJogador);
                    break;
                default:
                    System.out.println("Escolha uma opção valida!");
                    continue;
            }
            PrimeiroMapa mapa = new PrimeiroMapa(jogador);
            mapa.iniciarMapa();
            break;
        }
    }

}
