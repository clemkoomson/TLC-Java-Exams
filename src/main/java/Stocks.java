public class Stocks extends Product implements ProductPricingService{
    private String exchange;
    private String ticker;

    ProductPricingService prod;

    public Stocks(String productId,String exchange, String ticker) {
        super(productId);
        this.exchange = exchange;
        this.ticker = ticker;
    }

    @Override
    public double getValue() {
        return super.getValue();
    }


    @Override
    public double price(String exchange, String ticker) {
        super.setValue(40);
        return 40;
    }

    @Override
    public double price(String exchange, String contractCode, int month, int year) {
        return 0;
    }
}
