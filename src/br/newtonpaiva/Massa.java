package br.newtonpaiva;

import javax.swing.*;
import java.awt.*;

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
        final String[] opcaoSelecionada = {null};
        final JDialog dialog = new JDialog();
        dialog.setModal(true);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setLayout(new BorderLayout());
        dialog.setTitle("Tipo de Massa");

        JLabel label = new JLabel("Escolha o tipo de massa:");
        label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        dialog.add(label, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        String[] opcoes = {"Penne", "Espaguete", "Ravioli"};
        for (String opcao : opcoes) {
            JButton button = new JButton(opcao);
            button.addActionListener(e -> {
                opcaoSelecionada[0] = opcao;
                dialog.dispose();
            });
            buttonPanel.add(button);
        }

        dialog.add(buttonPanel, BorderLayout.CENTER);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);

        return opcaoSelecionada[0];
    }
}
