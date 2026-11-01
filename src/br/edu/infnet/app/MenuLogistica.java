/*
 * Uso de IA Generativa:
 * A IA foi utilizada para me auxiliar na compreensão de avisos do VS Code (resource leak)
 * do ClassiFicador de pedido, a IA orientou utilizar break e mantive return. Essa decisão
 * afetou o fechamento para 'Scanner tecla' usando tecla.close();
 * e para visualizar como integrar os exercícios anteriores dentro do switch/case do menu.
 * Pois confesso que o exercício 9 até agora não entendi essa consolidação somente da lógica.
 * Nos demais , não teve utilização para evitar cair em uma 'cilada' acidental onde poderia 
 * acabar terceirizando o racicionío . 
 */
package br.edu.infnet.app;

import java.util.Scanner;

public class MenuLogistica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("==== Menu de opções ==== ");
            System.out.println("1 - Converter Temperatura");
            System.out.println("2 - Converter Distância");
            System.out.println("3 - Classificar Pedido");
            System.out.println("4 - Sobre");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção desejada: ");
            
            opcao = in.nextInt();
            System.out.println();
        switch (opcao) {
                case 1:
                    double valorReferencia = 77;
                    int tempCelsius = 25;
                    double tempConvertida = (tempCelsius * 1.8) + 32;
                    System.out.println("Temperatura convertida: " + tempConvertida + " °F");
                    
                    if(tempConvertida > valorReferencia){
                        System.out.println("Temperatura Quente");
                    } else if(tempConvertida < valorReferencia) {
                        System.out.println("Temperatura amena ou fria");
                    } else {
                        System.out.println("Temperatura equivalente");
                    }
                    System.out.println();
                    break;

                case 2:
                    int km = 90;
                    double kmConvertido = km * 0.621371;
                    System.out.println("O Km convertido para Milhas é: " + kmConvertido);
                    System.out.println();
                    break;

                case 3:
                    int qtdLeve = 0;
                    int qtdPadrao = 0;
                    int qtdUrgente = 0;
                    
                    int pacotePeso = 0;
                    while (pacotePeso >= 0) {
                        System.out.print("Informe o peso kg (ou -1 para sair): ");
                        pacotePeso = in.nextInt();

                        if(pacotePeso < 0) {
                            break;
                        }
                        
                        if(pacotePeso < 11) {
                            System.out.println("Pacote " + pacotePeso + "kg Leve");
                            qtdLeve++;
                        } else if(pacotePeso < 16) {
                            System.out.println("Pacote: " + pacotePeso + "kg Padrão");
                            qtdPadrao++;
                        } else {
                            System.out.println("Pacote: " + pacotePeso + "kg Urgênte");
                            qtdUrgente++;
                        }
                    }
                    System.out.println("Total Leve: " + qtdLeve + " | Padrão: " + qtdPadrao + " | Urgente: " + qtdUrgente);
                    System.out.println();
                    break;

                case 4:
                    String JavaVersao = System.getProperty("java.specification.version");
                    System.out.println("Versão do Java: " + JavaVersao);
                    System.out.println("O Java roda em qualquer máquina porque a JVM traduz o Bytecode para o sistema operacional.");
                    System.out.println();
                    break;

                case 0:
                    System.out.println("Saída");                
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            } while (opcao != 0);

            in.close();
    }
}
