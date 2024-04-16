import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    public void testChange1(){
        assertEquals(28.3f, Money.change(TipoMoneda.EUR, TipoMoneda.USD, 28.37f));
    }

    @Test
    public void testChange2() {
        assertEquals(1165.83f, Money.change(TipoMoneda.GBP, TipoMoneda.EUR,1165.83f));
    }

    @Test
    public void testChange3() {
        assertEquals(201.21f, Money.change(TipoMoneda.EUR, TipoMoneda.GBP,201.21f));
    }

    @Test
    public void testChange4() {
        assertEquals(37.51f, Money.change(TipoMoneda.USD, TipoMoneda.EUR, 37.51f));
    }

    @Test
    public void testChange5() {
        assertEquals(138.49f, Money.change(TipoMoneda.GBP, TipoMoneda.USD, 100.0f));

    }

    @Test
    public void testChange6() {
        assertEquals(722.14f, Money.change(TipoMoneda.USD, TipoMoneda.GBP, 100.0f));

    }

    @Test
    public void testChange7() {
        assertEquals(-1f, Money.change(TipoMoneda.PTS, TipoMoneda.EUR, 100.0f));

    }

    @Test
    public void testChange8() {
        assertEquals(-1f, Money.change(TipoMoneda.EUR, TipoMoneda.PTS, 123.3f));

    }
    @Test
    public void testChange9() {
        assertEquals(-1f, Money.change(TipoMoneda.USD, TipoMoneda.EUR, -167.34f));

    }
}