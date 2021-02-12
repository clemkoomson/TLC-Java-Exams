import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ProductTest {
    int quantity = (int) (Math.random() *50) +1;
    @Test
    public void addingProductToProductList() throws ProductAlreadyRegisteredException {
        Product product = new Product("ID");
        product.addNewProduct(product,quantity);

        assertTrue(product.getProducts().size() > 0);
    }
    @Test
    public void testingAddingDifferentProduct() throws ProductAlreadyRegisteredException {
        Product product = new Product("AM");
        Product product2 = new Product("MS");
        product.addNewProduct(product,quantity);
        product.addNewProduct(product2,quantity);

        assertTrue(product.getProducts().size() > 1);
    }
    @Test
    public void testingDuplicateProduct() throws ProductAlreadyRegisteredException {
        Product product = new Product("yo");
        product.addNewProduct(product,quantity);
        product.addNewProduct(product,quantity);
        product.addNewProduct(product,quantity);

        System.out.println(product.getProducts().contains(product));
        assertThrows(ProductAlreadyRegisteredException.class,()->{
            product.addNewProduct(product,quantity);
        },"Adding duplicate product did not throw an exception");
    }

    @Test
    public void testingTotalQuantity(){
        Product product = mock(Product.class);

        when(product.totalTradeQuantityForDay()).thenReturn(100);

        assertEquals(100,product.totalTradeQuantityForDay());
    }
}