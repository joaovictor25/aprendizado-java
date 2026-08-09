package ProjetoUniversidade.src.ui;

import ProjetoUniversidade.src.core.Questao;
7 import ProjetoUniversidade.src.core.QuestaoComDica;

import java.util.Scanner;

public class Simulado {
    public static void main(String args[]){
        int pontos = 0;
        Scanner teclado = new Scanner(System.in);
        Questao[] q = new Questao[2];
        q[0] = new QuestaoComDica("Minha idade?", "28","Minha idade");
        q[1] = new Questao("Qual tamanho da população do Brasil?", "200 milhões");

        //QuestaoComDica qd = new QuestaoComDica("aa", "bbb1", "cccc");

        for(int i = 0; i < 2; i++){
            System.out.println(q[i].aplicarQuestao());
            String resp = teclado.nextLine();
            if(q[i].corrigirQuestao(resp)){
                System.out.println("Acertou!!!"); 
                pontos +=1;
            }else{
                System.out.println("Errou!!!");
            }
        }

        System.out.println("Total de acertos: "+pontos+" de "+q.length);

    }
}
