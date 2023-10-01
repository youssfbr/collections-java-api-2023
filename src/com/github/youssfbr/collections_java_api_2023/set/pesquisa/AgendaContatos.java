package com.github.youssfbr.collections_java_api_2023.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private final Set<Contato> contatos = new HashSet<>();

    public void adicionarContato(String nome, int numero) {
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {

        Set<Contato> contatosPorNome = new HashSet<>();

        for (Contato c : contatos) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {

        Contato contatoAtualizado = null;

        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila",123456);
        agendaContatos.adicionarContato("Camila",0);
        agendaContatos.adicionarContato("Camila Cavalcanti",1111111);
        agendaContatos.adicionarContato("Camila DIO",654987);
        agendaContatos.adicionarContato("Maria Silva",1111111);


        System.out.println();
        agendaContatos.exibirContatos();

        System.out.println();
        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println();
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 5555));
    }

}
