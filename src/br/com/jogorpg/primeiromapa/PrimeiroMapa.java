package br.com.jogorpg.primeiromapa;

public class PrimeiroMapa { // cada mapa terá um começo, meio e final com um boss.
    public void msgComeco(){
        System.out.println("""
                                        ========================================
                                        Sua jornada iniciará na Vila de Gar’Zhul
                                        ========================================
                """);
        System.out.println("""
                ================================================================================================
                A Vila de Gar’Zhul era uma próspera aldeia, mas agora está em ruínas, tomada por orcs violentos.
                    Casas destruídas, mercados abandonados, e o som constante de tambores de guerra e gritos 
                             de batalha preenche o ar. Os orcs patrulham as ruas e aterrorizam os 
                                   habitantes, enquanto a destruição se espalha pela vila.
                ================================================================================================
                """);
        System.out.println("""
                ==================================================================================================
                No centro, Grum’Thar, o Despedaçador, um orc colossal e brutal, governa com punho de ferro. Ele é
                       acompanhado por uma guarda de elite composta por guerreiros e xamãs, que utilizam 
                              magia negra para espalhar ainda mais o caos. A vila está corrompida, 
                                 com árvores morrendo e a terra envenenada pela magia sombria de 
                                                        Grum’Thar
                ==================================================================================================
                """);

        System.out.println("""
                ============================================================================================
                Seu objetivo é derrotar Grum’Thar e libertar a vila, enfrentando orcs, superando armadilhas
                            e finalmente confrontando o chefão na fortaleza no centro da vila.
                ============================================================================================
                """);
        System.out.println("""
                ============================================================================================
                      Durante a sua jornada pela vila, encontrará recursos para ajudar em sua batalha!
                ============================================================================================
                """);

        primeiroVilao();
    }

    public void primeiroVilao(){
        ZulGor zulGor = new ZulGor("ZulGor", 50, 12, 3);

        System.out.println("""
                ============================================================================================
                Você entra na Vila de Gar'Zhul, onde o silêncio é quebrado apenas pelos ecos de passos e o 
                   som distante de tambores de guerra. Uma figura imponente surge das sombras. Zul'Gor, 
                       o Feiticeiro Sombrio, com seu manto negro e bastão misterioso exalam poder.
                         Com um sorriso ameaçador, ele ergue seu bastão e uma aura de magia 
                               negra envolve o ambiente. "Prepare-se, pois o que você  
                                   enfrentará aqui não é apenas um vilão, mas a 
                                        própria escuridão que consome tudo 
                                                  ao seu redor."
                ============================================================================================
                                            A batalha com Zul'Gor começa!
                ============================================================================================
                """);
    }
}
