package view;

import service.InterfaceService;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInterface {
    public static void main(String[] args) throws IOException, InterruptedException {
        InterfaceService i = new InterfaceService();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("""
                -----------------------------------------------------
                  $   Seja bem-vindo(a) ao Conversor de Moedas   $
                -----------------------------------------------------
                """);
        while (opcao != 7) {
            System.out.println(i.menu());
            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Apenas números serão válidos.");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    try {
                        System.out.println(i.mensagemValorDesejado("Dólar", "Real"));
                        double valor = scanner.nextDouble();
                        double resultado = i.dolarParaReal(valor);
                        System.out.println("--------------------------------------------------------");
                        System.out.printf("O valor de %.2f [USD] convertido para [BRL] é: %.2f%n", valor, resultado);
                        System.out.println("--------------------------------------------------------");
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Digite um número.");
                        scanner.nextLine();
                    }
                    break;

                case 2:
                    try {
                        System.out.println(i.mensagemValorDesejado("Euro", "Dólar"));
                        double valor = scanner.nextDouble();
                        double resultado = i.euroParaDolar(valor);
                        System.out.println("--------------------------------------------------------");
                        System.out.printf("O valor de %.2f [EUR] convertido para [USD] é: %.2f%n", valor, resultado);
                        System.out.println("--------------------------------------------------------");
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Digite um número.");
                        scanner.nextLine();
                    }
                    break;

                case 3:
                    try {
                        System.out.println(i.mensagemValorDesejado("Real", "Yuan"));
                        double valor = scanner.nextDouble();
                        double resultado = i.realParaYuan(valor);
                        System.out.println("--------------------------------------------------------");
                        System.out.printf("O valor de %.2f [BRL] convertido para [CNY] é: %.2f%n", valor, resultado);
                        System.out.println("--------------------------------------------------------");
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Digite um número.");
                        scanner.nextLine();
                    }
                    break;

                case 4:
                    try {
                        System.out.println(i.mensagemValorDesejado("Real", "Wons"));
                        double valor = scanner.nextDouble();
                        double resultado = i.realParaWons(valor);
                        System.out.println("--------------------------------------------------------");
                        System.out.printf("O valor de %.2f [BRL] convertido para [KRW] é: %.2f%n", valor, resultado);
                        System.out.println("--------------------------------------------------------");
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Digite um número.");
                        scanner.nextLine();
                    }
                    break;

                case 5:
                    try {
                        System.out.println(i.mensagemValorDesejado("Real", "Iene"));
                        double valor = scanner.nextDouble();
                        double resultado = i.realParaIene(valor);
                        System.out.println("--------------------------------------------------------");
                        System.out.printf("O valor de %.2f [BRL] convertido para [JPY] é: %.2f%n", valor, resultado);
                        System.out.println("--------------------------------------------------------");
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Digite um número.");
                        scanner.nextLine();
                    }
                    break;

                    case 6:
                    try {
                        System.out.println(i.mensagemValorDesejado("Iene", "Yuan"));
                        double valor = scanner.nextDouble();
                        double resultado = i.ieneParaYuan(valor);
                        System.out.println("--------------------------------------------------------");
                        System.out.printf("O valor de %.2f [JPY] convertido para [CNY] é: %.2f%n", valor, resultado);
                        System.out.println("--------------------------------------------------------");
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Digite um número.");
                        scanner.nextLine();
                    }
                    break;

                case 7:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Selecione um numero de 1 a 7");
            }
        }
        scanner.close();
    }
}
