package br.com.jogorpg.personagens;

import br.com.jogorpg.habilidades.Habilidades;

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
        criacaoPersonagem();
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

    public void criacaoPersonagem(){
        System.out.println("""
                Escolha a sua classe:
                     1 - Guerreiro
                     2 - Arqueiro
                     3 - Lanceiro
                """);

        while (true){
            int classeEscolhida = leitura.nextInt();
            switch (classeEscolhida){
                case 1:
                    Habilidades guerreiro = new Habilidades(10, 7.5, 8.5);
                    System.out.println("=============================================================");
                    System.out.println("Seja muito bem vindo " + getNickJogador() + ", Você escolheu a classe Guerreiro!");
                    System.out.println("=============================================================");
                    System.out.println("    Status:");
                    System.out.println("Vida: " + guerreiro.getSaude());
                    System.out.println("Ataque: " + guerreiro.getAtaque());
                    System.out.println("Defesa: " + guerreiro.getDefesa());
                    Guerreiro guerreiroGo = new Guerreiro();
                    guerreiroGo.msgGuerreiro();
                    break;
                case 2:
                    Habilidades arqueiro = new Habilidades(10, 8.5, 6.5);
                    arqueiro.ferramentas("Arco", 12);
                    System.out.println("=============================================================");
                    System.out.println("Seja muito bem vindo " + getNickJogador() + ", Você escolheu a classe Arqueiro!");
                    System.out.println("=============================================================");
                    System.out.println("    Status:");
                    System.out.println("Vida: " + arqueiro.getSaude());
                    System.out.println("Ataque: " + arqueiro.getAtaque());
                    System.out.println("Defesa: " + arqueiro.getDefesa());
                    System.out.println("Item de batalha: " + arqueiro.getArmaArqueiro() + " com " + arqueiro.getFlexas() + " flexas.");
                    Arqueiro arqueiroGo = new Arqueiro();
                    arqueiroGo.msgArqueiro();
                    break;
                case 3:
                    Habilidades lanceiro = new Habilidades(10, 6.5, 8);
                    System.out.println("=============================================================");
                    System.out.println("Seja muito bem vindo " + getNickJogador() + ", Você escolheu a classe Lanceiro!");
                    System.out.println("=============================================================");
                    System.out.println("    Status:");
                    System.out.println("Vida: " + lanceiro.getSaude());
                    System.out.println("Ataque: " + lanceiro.getAtaque());
                    System.out.println("Defesa: " + lanceiro.getDefesa());
                    Lanceiro lanceiroGo = new Lanceiro();
                    lanceiroGo.msgLanceiro();
                    break;
                default:
                    System.out.println("Escolha uma opção valida!");
            }
        }
    }
}
