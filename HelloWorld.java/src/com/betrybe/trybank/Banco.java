package com.betrybe.trybank;

public class Banco {
    public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria();

    conta.mostraMensagem();
    conta.depositar(500);

    double valorConvertido = conta.converteMoeda(30, 5);
        System.out.println(valorConvertido);
    }

}
