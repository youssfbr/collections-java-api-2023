package com.github.youssfbr.collections_java_api_2023.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private final List<Pessoa> pessoas = new ArrayList<>();

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasOrdenadasPorIdade = new ArrayList<>(pessoas);
        Collections.sort(pessoasOrdenadasPorIdade);
        return pessoasOrdenadasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasOrdenadasPorAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoasOrdenadasPorAltura, new ComparatorPorAltura());
        return pessoasOrdenadasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        System.out.println();
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}
