package ui;

import core.Produto;

public class Main{
    public static void main(String args[]){
        Produto[] p = new Produto[3];
        p[0] = new Produto(1, "Bola", "Esporte", 100);
        p[1] = new Produto(1, "Bola", "Esporte", 150);
        p[2] = new Produto(1, "Bola", "Esporte", 150);

        System.out.printf("Preço do produto 1: %.2f",p[0].getPreco());
        //p[0].setPreco(2000);
        //System.out.print("Preço do produto 1 ATUALIZADO"+p[0].getPreco());

        //System.out.println("Preço do produto 2"+p[0].getPreco());
    }
}