import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FutureTest {
    @Test
    public void testingThePriceOfFuture() {
        Stocks mockedStock = mock(Stocks.class);

        when(mockedStock.price("ID","PS",60,2020)).thenReturn(50.0);

        assertEquals(50.0,mockedStock.price("ID","PS",60,2020),"User cannot get future");

    }

}