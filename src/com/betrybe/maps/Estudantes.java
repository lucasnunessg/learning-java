package com.betrybe.maps;

import java.util.ArrayList;
import java.util.List;

public class Estudantes {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Lucas");
        nomes.add("João");
        nomes.add("Cristian");
        nomes.add("Julia");
        nomes.add("Eloisa");
        nomes.add("Fernando");
        nomes.add("Carol");
        System.out.println(nomes);

        List<String> nomesFiltrados = nomes.stream()
                .filter(nome -> nome.startsWith("J"))
                .map(String::toUpperCase)
                .toList();

                new ArrayList<>();


//        for (String nome : nomes) {
//            if (nome.startsWith("L")) {
//                nomesFiltrados.add(nome);
//            }
//        }
        nomesFiltrados.forEach(System.out::println);
//        for (String nomeFiltrado : nomesFiltrados) {
//            System.out.println(nomeFiltrado);
//        }
    }



}
