package model;

public class ApiResponse{
    private String base_code;
    private Moedas conversion_rates;

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public Moedas getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(Moedas conversion_rates) {
        this.conversion_rates = conversion_rates;
    }
}


