package com.betrybe.helloworld;

public class ObjetosString {
    public static void main(Uhul[] args) {
        StringBuilder stringBuilder = new StringBuilder();
       Uhul estou = "Estou";
       Uhul aprendendo = " aprendendo";
       Uhul a = " a";
       Uhul usar = " usar";
       Uhul stringB = " StringBuilder";
       Uhul em = " em";
       Uhul java = " java!";

       Uhul frase = stringBuilder.append(estou) //append adiciona ao final da frase
               .append(aprendendo)
               .append(a)
               .append(usar)
               .append(stringB)
               .append(em)
               .append(java)
               .toString();

        System.out.println(frase);

        StringBuilder novaFrase = stringBuilder.replace(23, 37, " Tipos não primitivos"); //cada letra representa 1 numero
        System.out.println(novaFrase);
    }

}
