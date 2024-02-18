package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Restaurante> listaRestaurantes = new ArrayList<>();

        while (true) {
            System.out.println("Menu Principal:");
            System.out.println("1. Cadastrar restaurante");
            System.out.println("2. Listar restaurantes");
            System.out.println("3. Cadastrar item no menu de um restaurante");
            System.out.println("4. Sair");
            System.out.println(" ");

            System.out.println("Escolha uma opção: ");
            String opcao = scanner.next();
            System.out.println(" ");

            if (opcao.equals("1")) {
                System.out.println("Digite o nome do restaurante: ");
                String nomeRestaurante = scanner.next();
                System.out.println("Digite a avaliacao do restaurante: ");
                Integer avaliacaoRestaurante = scanner.nextInt();

                Restaurante restaurante = new Restaurante();
                restaurante.nome = nomeRestaurante;
                restaurante.avaliacao = avaliacaoRestaurante;

                listaRestaurantes.add(restaurante);

                System.out.println("Restaurante " + nomeRestaurante + " cadastrado com sucesso!");
                System.out.println(" ");
            }

            else if (opcao.equals("2")) {

                System.out.println("Restaurantes cadastrados:");
                for (int i = 0; i < listaRestaurantes.size(); i++) {
                    Restaurante restaurante = listaRestaurantes.get(i);
                    System.out.println((i + 1) + " - " + restaurante.nome);
                    System.out.println(" ");
                    restaurante.imprimeCardapio();
                    System.out.println(" ");
                }
                System.out.println(" ");
            }

            else if (opcao.equals("3")) {
                System.out.println("Escolha o número do restaurante para adicionar um item ao menu: ");
                Integer escolha = scanner.nextInt();
                Restaurante restauranteEscolhido = listaRestaurantes.get((escolha - 1));

                System.out.println("Digite o nome do item: ");
                String nomeItem = scanner.next();
                System.out.println("Digite o preço do item: ");
                Float precoItem = scanner.nextFloat();

                Item item = new Item();
                item.nome = nomeItem;
                item.preco = precoItem;

                restauranteEscolhido.adicionaItem(item);

                System.out.println("Item " + nomeItem + " adicionado ao cardápio do restaurante " + restauranteEscolhido.nome + "!");
                System.out.println(" ");
            }

            else if (opcao.equals("4")) {
                System.out.println("Obrigado por utilizar o sistema de cadastro de restaurantes!");
                break;
            }

            else {
                System.out.println("Opção inválida!");
            }
        }

    }
}