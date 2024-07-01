org.junit.Test;
org.junit.Assert;

public class CashbackHackServiceTest {
    @Test
    public void test_CashbackHackService (){
        CashbackHackServiceTest service = new CashbackHackServiceTest();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
