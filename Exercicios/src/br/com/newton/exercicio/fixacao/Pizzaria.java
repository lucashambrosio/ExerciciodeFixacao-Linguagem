package br.com.newton.exercicio.fixacao;

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class Pizzaria {
	public static void main(String[] args) {

        int opcao;
        int opcaoTamanho;
        String nomeCliente;
        

        opcao=0;
        opcaoTamanho=0;

        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        Cliente cliente1 = new Cliente();
        Pizza pizza1 = new Pizza();
        Ingrediente ingrediente1 = new Ingrediente();
        Pedido pedido1 = new Pedido();

        System.out.println("Seja bem Vindo a Pizzaria Casa Nostra\nInforme o seu nome: ");
        nomeCliente=ler.nextLine();
        cliente1.setNomeCliente(nomeCliente);


        System.out.println("Escolha o tamanho da sua Pizza:|z\n" +
                    "1. Pequena (P)\n" +
                    "2. Média (M)\n" +
                    "3. Grande (G)\n");

        do
        {
            pedido1.getQtdePizza();
            opcaoTamanho=ler.nextInt();      	   
            
            switch (opcaoTamanho)
            {
                case 1:
                {
                    pizza1.setTamanho("P");
                    break;
                }
                case 2:
                {
                    pizza1.setTamanho("M");
                    break;
                }
                case 3:
                {
                    pizza1.setTamanho("G");
                    break;
                }
                
                case 4:
                {
                	System.out.println("Escolha a opção valida");
                }
                default:
                {
                    System.out.println("Opção Inválida");
                }  
             
            }
        }
        while(opcaoTamanho >= 4);
            	
            System.out.println("Digite o número do Ingrediente da pizza\n" +
                    "1. Mussarela\n" +
                    "2. Bacon\n" +
                    "3. Presunto\n" +
                    "4. Frango\n" +
                    "5. Requeijão\n" +
                    "6. Possui borda\n" +
                    "7. Deseja outra pizza?\n" +
                    "8. Finalizar");
            do {
            	opcao=ler.nextInt();            
            	switch (opcao) {
                       	
                case 1:{
                    pedido1.addIngredientes();
                    pedido1.getQtdeIngredientes();
                    break;
                }
                case 2:{
                    pedido1.addIngredientes();
                    pedido1.getQtdeIngredientes();
                    break;
                }
                case 3:{
                    pedido1.addIngredientes();
                    pedido1.getQtdeIngredientes();
                    break;
                }
                case 4:{
                    pedido1.addIngredientes();
                    pedido1.getQtdeIngredientes();
                    break;
                }
                case 5:{
                    pedido1.addIngredientes();
                    pedido1.getQtdeIngredientes();
                    break;
                }
                case 6:{
                    pizza1.isPossuiBordaRecheada();
                    break;
                }
                case 7:{
                    break;
                }
                
                case 8:
                {
                	
                	
                	System.out.println("Extrato do pedido" + pedido1.imprimePedido());
                }
            }
        }
        while(opcao!=8);
        }
	}

