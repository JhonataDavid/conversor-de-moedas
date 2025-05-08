package service;

import model.ApiClient;
import model.Moedas;

import java.io.IOException;

public class InterfaceService {
    private final ApiClient apiClient = new ApiClient();


    public String mensagemValorDesejado(String de, String para) {
        return "Digite o valor em " + de + " para converter em " + para + ":";
    }

    public String menu() {
        return """
                1) Dólar americano → Real brasileiro
                2) Euro → Dólar americano
                3) Real brasileiro → Yuan chinês
                4) Real brasileiro → Won sul-coreano
                5) Real brasileiro → Iene japonês
                6) Iene japonês → Yuan chinês
                7) Sair
                Escolha uma opção válida:
                """;
    }

    public double dolarParaReal(double valorParaConverter) throws IOException, InterruptedException {
        Moedas moedas = apiClient.buscaApi("USD");
        return valorParaConverter * moedas.getBRL();
    }

    public double euroParaDolar(double valorParaConverter) throws IOException, InterruptedException {
        Moedas moedas = apiClient.buscaApi("EUR");
        return valorParaConverter * moedas.getUSD();
    }

    public double realParaYuan(double valorParaConverter) throws IOException, InterruptedException {
        Moedas moedas = apiClient.buscaApi("BRL");
        return valorParaConverter * moedas.getCNY();
    }

    public double realParaWons(double valorParaConverter) throws IOException, InterruptedException {
        Moedas moedas = apiClient.buscaApi("BRL");
        return valorParaConverter * moedas.getKRW();
    }

    public double realParaIene(double valorParaConverter) throws IOException, InterruptedException {
        Moedas moedas = apiClient.buscaApi("BRL");
        return valorParaConverter * moedas.getJPY();
    }

    public double ieneParaYuan(double valorParaConverter) throws IOException, InterruptedException {
        Moedas moedas = apiClient.buscaApi("JPY");
        return valorParaConverter * moedas.getCNY();
    }

}
