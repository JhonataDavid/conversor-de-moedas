package view;

import model.ApiClient;
import model.Moedas;

import java.io.IOException;

public class InteracaoComUsuario {
    private final ApiClient apiClient = new ApiClient();


    public String mensagemValorDesejado(String de, String para) {
        return "Digite o valor em " + de + " para converter em " + para + ":";
    }

    public String menu() {
        return """
                1) Dólar => Real brasileiro
                2) Euro => Dólar
                3) Real brasileiro => Renminbi
                4) Real brasileiro => Wones
                5) Real brasileiro => Ienes
                6) Ienes => Renminbi
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

    public double realParaWones(double valorParaConverter) throws IOException, InterruptedException {
        Moedas moedas = apiClient.buscaApi("BRL");
        return valorParaConverter * moedas.getKRW();
    }

    public double realParaIenes(double valorParaConverter) throws IOException, InterruptedException {
        Moedas moedas = apiClient.buscaApi("BRL");
        return valorParaConverter * moedas.getJPY();
    }

    public double ienesParaYuan(double valorParaConverter) throws IOException, InterruptedException {
        Moedas moedas = apiClient.buscaApi("JPY");
        return valorParaConverter * moedas.getCNY();
    }


}
