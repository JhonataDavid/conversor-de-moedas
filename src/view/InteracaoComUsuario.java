package view;

import model.ApiClient;
import model.Moedas;

import java.io.IOException;

public class InteracaoComUsuario {
    private final ApiClient apiClient = new ApiClient();

    public String mensagemValorDesejado() {
        return "Qual valor deseja converter?";
    }

    public String mensagemValorDesejado(String de, String para) {
        return "Digite o valor em " + de + " para converter em " + para + ":";
    }

    public String mensagemSaudacoes() {
        return """
                1) Dólar => Real brasileiro
                2) Euro => Dólar
                3) Real brasileiro => Moeda chinesa
                4) Real brasileiro => Dólar
                5) Dólar => Peso colombiano
                6) Peso colombiano => Dólar
                7) Sair
                Escolha uma opção válida:
                """;
    }

    public double dollarParaReal(double valorParaConverter) throws IOException, InterruptedException {
        Moedas moedas = apiClient.buscaApi("USD");
        return valorParaConverter * moedas.getBRL();
    }

    public double euroParaDollar(double valorParaConverter) throws IOException, InterruptedException {
        Moedas moedas = apiClient.buscaApi("EUR");
        return valorParaConverter * moedas.getUSD();
    }
    public double realParaYuan(double valorParaConverter) throws IOException, InterruptedException {
        Moedas moedas = apiClient.buscaApi("BRL");
        return valorParaConverter * moedas.getCNY();
    }
}
