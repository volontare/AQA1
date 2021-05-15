package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldTestRemainForAmount0() {
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldTestRemainForAmount1000() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldTestRemainFor1780() {
        int actual = service.remain(1780);
        int expected = 220;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldTestRemainForAmountLowerO() {
        int actual = service.remain(-100);
        int expected = 1000;

        assertEquals(actual, expected);
    }
}
