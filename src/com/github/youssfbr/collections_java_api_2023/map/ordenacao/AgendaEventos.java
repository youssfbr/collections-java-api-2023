package com.github.youssfbr.collections_java_api_2023.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private final Map<LocalDate, Evento> eventosMap = new HashMap<>();

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
//        Set<LocalDate> dateSet = eventosMap.keySet();
//        Collection<Evento> values = eventosMap.values();
//        eventosMap.get();
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " contecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "atracao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JANUARY, 10), "Evento 4", "atracao 4");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY, 14), "Evento 5", "atracao 5");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 14), "Evento 6", "atracao 6");

        System.out.println();
        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }

}
