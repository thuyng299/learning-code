public class Stock {
private String symbol;

private Double sharePrice;

    public Stock(String symbol, Double sharePrice) {
        this.symbol = symbol;
        this.sharePrice = sharePrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(Double sharePrice) {
        this.sharePrice = sharePrice;
    }

    @Override
    public String toString() {
        return "Symbol: " + symbol + "\nShare price: " + sharePrice;
    }
}
