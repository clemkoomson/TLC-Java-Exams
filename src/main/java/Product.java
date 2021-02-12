import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product implements MontrealTradedProducts {
    private List<Product> products = new ArrayList<>();
    private int quantity;
    private String productId;
    private double value;
    private int totalQuantity=0;

    public Product(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    public List<Product> getProducts(){
        return products;
    }

    @Override
    public void addNewProduct(Product product,int quantity) throws ProductAlreadyRegisteredException {
        List<Product> produ = products
                .stream()
                .filter(p-> p.getProducts().hashCode() == product.hashCode() )
                .collect(Collectors.toList());

        if (produ.contains(product)){
            throw new ProductAlreadyRegisteredException("Stock with "+product.getProductId()+"already exist");
        }else{
            products.add(product);
            this.quantity = 0;
        }
    }

    @Override
    public void trade(Product product, int quantity) {
        product.quantity = quantity;
        this.totalQuantity += quantity;
        totalTradeQuantityForDay();
    }

    @Override
    public int totalTradeQuantityForDay() {
        return this.totalQuantity;
    }

}
