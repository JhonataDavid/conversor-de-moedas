package model;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {

    private final HttpClient client = HttpClient.newHttpClient();
    private final Gson gson = new Gson();
    private final String urlBase = "https://v6.exchangerate-api.com/v6/";
    private final String apiKey = "YOU_API_KEY";

    public String jsonDaApi() throws IOException, InterruptedException {
        String url = urlBase + apiKey + "/latest/USD";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public Moedas buscaApi(String moeda) {
        try {
            String url = urlBase + apiKey + "/latest/" + moeda.toUpperCase();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ApiResponse apiResponse = gson.fromJson(response.body(), ApiResponse.class);

            return apiResponse.getConversion_rates();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao acessar a API: " + e.getMessage());
        }
    }
}
