package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

class CashbackHackServiceTest {

    @Test
    void CashbackHackServiceRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }


}