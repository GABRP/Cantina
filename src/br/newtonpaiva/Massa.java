package br.newtonpaiva;

import javax.swing.*;

class Massa {
    private String tipo;
    private double valor;

    public Massa(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public static String escolherTipo() {
        Object[] opcoes = {"Penne", "Espaguete", "Ravioli"};
        int opcao = JOptionPane.showOptionDialog(null, "Escolha o tipo de massa:", "Tipo de Massa", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        return (String) opcoes[opcao];
    }
}
