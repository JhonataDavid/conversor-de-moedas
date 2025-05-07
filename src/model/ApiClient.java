package model;

import com.google.gson.Gson;
import exceptions.ErroAoPesquisarEnderecoException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {
    private final HttpClient client = HttpClient.newHttpClient();
    private String endereco;

    public String jsonDaApi() throws IOException, InterruptedException {
        this.endereco = "https://v6.exchangerate-api.com/v6/***REMOVED***/latest/USD";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(this.endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public Moedas buscaApi(String moeda) throws IOException, InterruptedException {
        //Retorna uma api serilializada em Moedas
        try {
            this.endereco = "https://v6.exchangerate-api.com/v6/***REMOVED***/latest/" + moeda.toUpperCase();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(this.endereco))
                    .build();
            HttpResponse<String> response = this.client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            ApiResponse apiResponse = gson.fromJson(response.body(), ApiResponse.class);

            return apiResponse.getConversion_rates();

        } catch (ErroAoPesquisarEnderecoException e) {
            throw new ErroAoPesquisarEnderecoException("Erro no endereço solicitado! Verifique e tente novamente.");
        }
    }
}