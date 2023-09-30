package com.github.youssfbr.collections_java_api_2023.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private final List<Item> items = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade) {
        items.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {

        List<Item> itensASeremRemovidos = new ArrayList<>();

        if (!items.isEmpty()) {
            for (Item i : items) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensASeremRemovidos.add(i);
                }
            }
            items.removeAll(itensASeremRemovidos);
        }
        else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!items.isEmpty()) {
            for (Item item : items) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!items.isEmpty()) {
            System.out.println(this.items);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        carrinhoDeCompras.exibirItens();


        carrinhoDeCompras.removerItem("Lápis");

        System.out.println();
        carrinhoDeCompras.exibirItens();

        System.out.println();
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }

}
