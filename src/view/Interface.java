package view;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Interface {
    public static void main(String[] args) throws IOException, InterruptedException {
        InteracaoComUsuario i = new InteracaoComUsuario();
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
                        System.out.println(i.mensagemValorDesejado("dollar", "real"));
                        double valor = scanner.nextDouble();
                        double resultado = i.dollarParaReal(valor);
                        System.out.printf("O valor de %.2f [USD] convertido para [BRL] é: %.2f%n", valor, resultado);
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Digite um número.");
                        scanner.nextLine();
                    }
                    break;

                case 2:
                    try {
                        System.out.println(i.mensagemValorDesejado("Euro", "Dólar"));
                        double valor = scanner.nextDouble();
                        double resultado = i.euroParaDollar(valor);
                        System.out.printf("O valor de %.2f [EUR] convertido para [USD] é: %.2f%n", valor, resultado);
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Digite um número.");
                        scanner.nextLine();
                    }
                    break;

                case 3:
                    try {
                        System.out.println(i.mensagemValorDesejado("real", "yuan"));
                        double valor = scanner.nextDouble();
                        double resultado = i.realParaYuan(valor);
                        System.out.printf("O valor de %.2f [BRL] convertido para [Yuan] é: %.2f%n", valor, resultado);
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Digite um número.");
                        scanner.nextLine();
                    }
                    break;

                case 4:
                    try {
                        System.out.println(i.mensagemValorDesejado("real", "wones"));
                        double valor = scanner.nextDouble();
                        double resultado = i.realParaWones(valor);
                        System.out.printf("O valor de %.2f [BRL] convertido para [KRW] é: %.2f%n", valor, resultado);
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Digite um número.");
                        scanner.nextLine();
                    }
                    break;

                case 5:
                    try {
                        System.out.println(i.mensagemValorDesejado("real", "ienes"));
                        double valor = scanner.nextDouble();
                        double resultado = i.realParaIenes(valor);
                        System.out.printf("O valor de %.2f [BRW] convertido para [JPY] é: %.2f%n", valor, resultado);
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Digite um número.");
                        scanner.nextLine();
                    }
                    break;

                    case 6:
                    try {
                        System.out.println(i.mensagemValorDesejado("ienes", "Renminbi"));
                        double valor = scanner.nextDouble();
                        double resultado = i.ienesParaYuan(valor);
                        System.out.printf("O valor de %.2f [JPY] convertido para [CNY] é: %.2f%n", valor, resultado);
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Digite um número.");
                        scanner.nextLine();
                    }
                    break;

                case 7:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
