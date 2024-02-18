package org.example;

import java.util.ArrayList;

public class Restaurante {

    String nome;
    Integer avaliacao;
    ArrayList<Item> cardapio = new ArrayList<>();

    void getNome() {
        System.out.println("Nome" + this.nome);
    }

    void adicionaItem(Item item) {
        cardapio.add(item);
    }

    void imprimeCardapio() {
        for (Item produto : cardapio) {
            System.out.println(produto.nome + ": " + produto.preco);
        }
    }
}
