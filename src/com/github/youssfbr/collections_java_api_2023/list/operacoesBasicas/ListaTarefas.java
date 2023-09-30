package com.github.youssfbr.collections_java_api_2023.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private final List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasASeremRemovidas = new ArrayList<>();
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasASeremRemovidas.add(t);
            }
        }
        tarefas.removeAll(tarefasASeremRemovidas);
    }

    public int obterNumeroTotalTarefas() {
        return tarefas.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefas);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        // listaTarefa.removerTarefa("Tarefa 1");
        listaTarefa.removerTarefa("Tarefa 2");

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        System.out.println();

        listaTarefa.obterDescricoesTarefas();
    }

}
