package com.betrybe.maps;

import java.util.HashMap;

public class Map {
    HashMap<String, String> estudantes = new HashMap<String, String>();

    public Map() {
        estudantes.put("x038702","João");
        estudantes.put("x784244","Maria");
        estudantes.put("x105852","Joana");
    }


    public String addMap (){
        String valorAnterior = estudantes.put("x038702","José");
        return valorAnterior;

    }

    public String addTwoMap() {
        String valorNovo = estudantes.put("x784244","Lucas");
        return valorNovo;
    }

    public String adddMap() {
        String valorrAnterior = estudantes.put("x105852", "Luquinhas");
        return valorrAnterior;
    }


    public static void main(String[] args) {
        Map map = new Map();
        String valorAnterior = map.addMap();
        String valorNovo = map.addTwoMap();
        String valorrAnterior = map.adddMap();

        System.out.println("Aqui deve aparecer João: " + valorAnterior);
        System.out.println("Aqui deve aparecer Joana: " + valorrAnterior);
        System.out.println("Oiiiiiiiiiii " + valorNovo);
        System.out.println("Aqui com os valores novos de José, Lucas e Luquinhas: " + map.estudantes);
    }
}

//////// no hash map, toda vez q vc for adicionar um novo valor, o que for passado na "key", sera substituido pelo Value.