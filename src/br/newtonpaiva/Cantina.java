package br.newtonpaiva;

import javax.swing.*;

public class Cantina {

    public static void main(String[] args) {

        String nomeCliente = JOptionPane.showInputDialog("Informe o nome do cliente:");
        Cliente cliente = new Cliente(nomeCliente);

        String tipoMassa = Massa.escolherTipo();
        double valorMassa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da massa:"));
        Massa massa = new Massa(tipoMassa, valorMassa);

        Pedido pedido = new Pedido(massa, cliente);

        int opcao = 0;
        while (opcao != 5) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe os ingredientes escolhidos:\n1-Bacon\n2-Mussarela\n3-Tomate\n4-Queijo\n5-Sair"));
            switch (opcao) {
                case 1:
                    pedido.adicionarIngrediente(new Ingrediente("Bacon"));
                    break;
                case 2:
                    pedido.adicionarIngrediente(new Ingrediente("Mussarela"));
                    break;
                case 3:
                    pedido.adicionarIngrediente(new Ingrediente("Tomate"));
                    break;
                case 4:
                    pedido.adicionarIngrediente(new Ingrediente("Queijo"));
                    break;
            }
        }

        JOptionPane.showMessageDialog(null, pedido.toString());
    }
}