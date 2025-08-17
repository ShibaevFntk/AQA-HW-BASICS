package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void CashbackHackServiceRemainMax() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void CashbackHackServiceRemainMin() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void CashbackHackServiceRemainEqual() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}