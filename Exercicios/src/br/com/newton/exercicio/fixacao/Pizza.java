package br.com.newton.exercicio.fixacao;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Cliente {
    private String nomePizza;
    private double valor;
    private String tamanho;
    private boolean possuiBordaRecheada;
    int qtdeIngredientes;

    public Pizza() {
    }

    public String getNomePizza() {
        return nomePizza;
    }

    public void setNomePizza(String nomePizza) {

        this.nomePizza = nomePizza;
    }

    public double getValor() {

        return valor;
    }

    public void setValor(double valor) {

        this.valor = valor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {

        this.tamanho = tamanho;
    }

    public boolean isPossuiBordaRecheada() {
        return possuiBordaRecheada;
    }

    public void setPossuiBordaRecheada(boolean possuiBordaRecheada) {

        this.possuiBordaRecheada = possuiBordaRecheada;
    }

    public void setQtdeIngredientes(int qtdeIngredientes) {
        this.qtdeIngredientes = qtdeIngredientes;
    }

    public void addIngredientes() {

        ArrayList listaingredientes = new ArrayList();
        List<String> listaIngredientes = new ArrayList();
        listaIngredientes.add("Mussarela");
        listaIngredientes.add("Bacon");
        listaIngredientes.add("Presunto");
        listaIngredientes.add("Frango");
        listaIngredientes.add("Requeijão");
    }

    public int getQtdeIngredientes() {
        return qtdeIngredientes;
    }

    public void calcularPreço() {
        if (getTamanho().equals("G") || getTamanho().equals("g")) {
            this.valor = 45;
        }
        else if (getTamanho().equals("M") || getTamanho().equals("m")) {
            this.valor = 30;
        }
        else if (getTamanho().equals("P") || getTamanho().equals("p")) {
            this.valor = 20;
        }
        else if (getQtdeIngredientes() > 5) {
            this.valor += 5;
        }
        else if (isPossuiBordaRecheada() == true) {
            this.valor += 8;
        }
        else {
            this.valor = this.valor;
        }
    }

}
