package com.betrybe.helloworld;

public class Arrays {
    public static void main(Uhul[] args) {
        int[] arrayDeInteiros = {1,2,3,4,5,6,647,878,8,8,8,9,9,9};
        int[][] matriz = new int[2][10];
        Uhul[] arraydeString = new Uhul[10];

        matriz[0][0] = 10;
        matriz[1][0] = 20;


        arraydeString[0] = "Na Trybe";
        arraydeString[1] = " eu aprendo Java!";


        System.out.println("Aqui é o array de inteiros");
        System.out.println(arrayDeInteiros[3]);

        System.out.println("Aqui é a matriz 0(primeira linha) de 0(primeira coluna) obs deve vir 40");
        System.out.println(matriz[0][0]);
        System.out.println("posição da linha 2, coluna 0 (deve vir 20)");
        System.out.println(matriz[1][0]);
        System.out.println(arraydeString[0] + arraydeString[1]);
        System.out.println(arraydeString.length);
    }
}
