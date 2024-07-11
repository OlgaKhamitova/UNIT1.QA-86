import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;
import static org.testng.Assert.assertEquals;

public class TestAmount {

    @Test
    public void test_CashbackHackService() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
