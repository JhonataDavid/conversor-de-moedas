package model;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {
    private final HttpClient client = HttpClient.newHttpClient();
    private String endereco;

    public String jsonDaApi() throws IOException, InterruptedException {
        this.endereco = "https://v6.exchangerate-api.com/v6/YOU_API_KEY/latest/EUR";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(this.endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public Moedas buscaApi(String moeda) {
        try {
            this.endereco = "https://v6.exchangerate-api.com/v6/YOU_API_KEY/" + moeda.toUpperCase();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(this.endereco))
                    .build();
            HttpResponse<String> response = this.client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            ApiResponse apiResponse = gson.fromJson(response.body(), ApiResponse.class);

            return apiResponse.getConversion_rates();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao acessar a api! " + e.getMessage());
        }
    }
}