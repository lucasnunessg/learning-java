package com.betrybe.helloworld;

import java.util.HashMap;

public class Map {
    HashMap<String, String> estudantes = new HashMap<String, String>();
    public Map() {
        estudantes.put("x038702", "João");
        estudantes.put("x78424", "Maria");
        estudantes.put("x10522", "Joana");
    }

    public static void main(String[] args) {
        Map map = new Map();
        System.out.println(map);
    }

}
