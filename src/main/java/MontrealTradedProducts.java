public interface MontrealTradedProducts {
    void addNewProduct(Product product, int quantity) throws ProductAlreadyRegisteredException;
    int totalTradeQuantityForDay();
    void trade(Product product, int quantity);

}
