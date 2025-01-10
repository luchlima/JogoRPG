package br.com.jogorpg.habilidades;

public class Jogador{
    private String nome;
    private int saude;
    private int ataque;
    private int defesa;
    private String classe;


    public Jogador(String nome, int saude, int ataque, int defesa, String classe) {
        this.nome = nome;
        this.saude = saude;
        this.ataque = ataque;
        this.defesa = defesa;
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void mostrarStatus() {
        System.out.println("============================================================================================");
        System.out.println("Classe: " + classe);
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + saude);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defesa: " + defesa);
        System.out.println("============================================================================================");
    }

    public boolean estaVivo(){ // método para verificar se o personagem está vivo;
        return saude > 0;
    }
}