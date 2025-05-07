package model;

public class Moedas {
    private double BRL;
    private double USD;
    private double EUR;
    private double ARS;
    private double CNY;
    private double JPY;

    public double getBRL() { return BRL; }
    public void setBRL(double BRL) { this.BRL = BRL; }

    public double getUSD() { return USD; }
    public void setUSD(double USD) { this.USD = USD; }

    public double getEUR() { return EUR; }
    public void setEUR(double EUR) { this.EUR = EUR; }

    public double getARS() { return ARS; }
    public void setARS(double ARS) { this.ARS = ARS; }

    public double getCNY() { return CNY; }
    public void setCNY(double CNY) { this.CNY = CNY; }

    public double getJPY() { return JPY; }
    public void setJPY(double JPY) { this.JPY = JPY; }

    @Override
    public String toString() {
        return String.format("""
                Moedas:
                BRL: %.2f
                USD: %.2f
                EUR: %.2f
                ARS: %.2f
                CNY: %.2f
                JPY: %.2f
                """, BRL, USD, EUR, ARS, CNY, JPY);
    }
}
