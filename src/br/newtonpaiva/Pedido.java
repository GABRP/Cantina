package br.newtonpaiva;

import java.util.ArrayList;
import java.util.List;

class Pedido {
    private Massa massa;
    private Cliente cliente;
    private List<Ingrediente> ingredientes;

    public Pedido(Massa massa, Cliente cliente) {
        this.massa = massa;
        this.cliente = cliente;
        this.ingredientes = new ArrayList<>();
    }

    public void adicionarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public double calcularValor() {
        return massa.getValor() + ingredientes.size() * 2.0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido feito para ").append(cliente.getNome()).append("\n");
        sb.append(massa.getTipo());
        for (int i = 0; i < ingredientes.size(); i++) {
            Ingrediente ingrediente = ingredientes.get(i);
            if (i == 0) {
                sb.append(" com ");
            } else if (i == ingredientes.size() - 1) {
                sb.append(" e ");
            } else {
                sb.append(" com ");
            }
            sb.append(ingrediente.getNome());
        }
        sb.append("\nValor: R$").append(String.format("%.2f", calcularValor()));
        return sb.toString();
    }
}
