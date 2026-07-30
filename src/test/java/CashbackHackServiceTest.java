import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import ru.netology.service.CashbackHackService;



public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateIfAmountLessThen1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 200;
        int actual = service.remain(800);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateIfAmountMoreThen1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(1500);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateIfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }
}
