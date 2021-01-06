package assignment1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MyAccountTest {
	MyAccount my = new MyAccount();

    @Test
    public void testSetBalance() {
        my.setBalance(200);
        assertEquals("Wrong balance", 200, my.getBalance());
    }

    @Test
    public void testDebit() {
        my.setBalance(200);
        assertEquals("Wrong debit", 100, my.debit(100));
    }

    @Test
    public void testCredit() {
        my.setBalance(200);
        assertEquals("Wrong credit", 300, my.credit(100));
    }
}
