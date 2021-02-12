public class Future extends Product implements ProductPricingService{
    private String exchange;
    private String contractCode;
    private int year;
    private int month;

    public Future(String productId,String exchange, String contractCode, int year,int month) {
        super(productId);
        this.exchange = exchange;
        this.contractCode=contractCode;
        this.month = month;
        this.year = year;
        this.month = month;

    }

    @Override
    public double price(String exchange, String ticker) {
        return 0;
    }

    @Override
    public double price(String exchange, String contractCode, int month, int year) {
        return 50.0;
    }
}
