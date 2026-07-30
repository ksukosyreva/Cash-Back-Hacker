import org.junit.Test;
import static org.junit.Assert.assertEquals;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateCashbackIfAmountLessThen1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 200;
        int actual = service.remain(800);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashbackIfAmountMoreThen1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(1500);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashbackIfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashbackIfAmount999() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);

        assertEquals(expected,actual);
    }

    @Test
    public void shouldCalculateCashbackIfAmount1001() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);

        assertEquals(expected,actual);
    }
}
