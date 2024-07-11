import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;
import static org.testng.Assert.assertEquals;


public class TestCashbackHackService {

    @Test
    public void test() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }
}
