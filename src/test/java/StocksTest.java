import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StocksTest {


    @Test
    public void testingThePriceOfStock() {
        Stocks mockedStock = mock(Stocks.class);

       when(mockedStock.price("ID","PS")).thenReturn(50.0);

        assertEquals(50.0,mockedStock.price("ID","PS"),"User cannot get stock quantity");

    }
}