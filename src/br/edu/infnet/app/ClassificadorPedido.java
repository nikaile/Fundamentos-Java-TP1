package br.edu.infnet.app;

import java.util.Scanner;

public class ClassificadorPedido {
    public static void main(String[] args) {
        /* Scanner tecla - Exibe a solicitação para usuário
         *  com nextInt e captura a entrada
         */
        Scanner tecla = new Scanner(System.in);
        // Controle fluxo de repetição com estrutura while.
        int pacotePeso = 0;
        while (pacotePeso >= 0) {
            System.out.print("Informe o peso do pacote kg: ");
            pacotePeso = tecla.nextInt();

        /*
         * err trata a entrada quando não atende o critério e exibe na tela a mensagem de peso inválido.
         * Estrutura if, else if e else processa a entrada e compara com a regra definida
         * exibe a condição atendida
         * Pacote 0 a 10 kg "leve"
         * Pacote 11 a 15 kg "padrão"
         * Pacote acima de 16 kd "urgente"
         */
        
            if(pacotePeso < 0) {
                System.err.println("O peso " + pacotePeso + "kg está inválido! O valor precisa ser positivo.");
                return;

            }

            if(pacotePeso < 11) {
                System.out.println("Pacote " + pacotePeso + "kg Leve");

            } else if(pacotePeso < 16) {
                System.out.println("Pacote: " + pacotePeso + "kg Padrão");

            } else {
                System.out.println("Pacote: " + pacotePeso + "kg Urgênte");

            }  
            

        }

    }

}
