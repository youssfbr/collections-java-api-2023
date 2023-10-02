package com.github.youssfbr.collections_java_api_2023.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    
    private final Map<String, Integer> agendaContatoMap = new HashMap<>();

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisaPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Alisson", 123456);
        agendaContatos.adicionarContato("Alisson", 5665);
        agendaContatos.adicionarContato("Alisson Youssf", 1111111);
        agendaContatos.adicionarContato("Alisson DIO", 654987);
        agendaContatos.adicionarContato("Lilica", 1111111);
        agendaContatos.adicionarContato("Alisson", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Alisson DIO");

        System.out.println();
        agendaContatos.exibirContatos();

        System.out.println();
        System.out.println("O número é: " + agendaContatos.pesquisaPorNome("Lilica"));
    }


}
