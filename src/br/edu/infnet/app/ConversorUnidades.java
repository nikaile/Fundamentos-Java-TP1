package br.edu.infnet.app;

public class ConversorUnidades {
    public static void main(String[] args) { 
         System.out.println("==== Conversão Temperatura ====");       
        double valorReferencia = 77;
        // Entrada      
        int tempCelsius = 25;
        // Regra Conversão Temperatura
        double tempConvertida = (tempCelsius * 1.8) + 32;
        System.out.println("A temperatura convertida para Fahrenheit é: " + tempConvertida);
        // Saída condição atendendida
        if(tempConvertida > valorReferencia){
            System.out.println("Temperatura Quente");

        } else if(tempConvertida < valorReferencia) {
            System.out.println("Temperatura ameno ou fria");
            
        } else {
            System.out.println("Temperatura equivalente");

        }
        // Conversão Quilotmetros
        System.out.println("==== Conversão Quilômetros ====");
        // Entrada
        int km = 90;
        // Regra processamento
        double kmConvertido = km * 0.621371;
        // Saída
        System.out.println("O Km  convertido para Milhas é: " + kmConvertido);        
    }

}
