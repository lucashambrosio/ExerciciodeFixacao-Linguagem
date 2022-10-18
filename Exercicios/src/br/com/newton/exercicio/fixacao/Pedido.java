package br.com.newton.exercicio.fixacao;

import java.util.List;

public class Pedido extends Pizza {

    private int numPedido;
    private String data;
    private int qtdePizza;

    public Pedido() {
    }

    public int getNumPedido() {

        return numPedido;
    }

    public void setNumPedido(int numPedido) {

        this.numPedido = numPedido;
    }

    public String getData() {

        return data;
    }

    public void setData(String data) {

        this.data = data;
    }

    public int getQtdePizza() {
        return qtdePizza;
    }

    public void setQtdePizza(int qtdePizza) {

        this.qtdePizza = qtdePizza;
    }

    public String imprimePedido() {
        return "\nPedido: " + this.numPedido + "\nCliente: " + getNomeCliente() + "\nQuantidade de Pizzas " + this.qtdePizza + "\nValor Total do Pedido " ;
    }


}
