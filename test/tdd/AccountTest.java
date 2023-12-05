package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AccountTest {

    Account picasso = new Account();

    @Test
    public void testAccountCanPerformDeposit() {
        Account picasso = new Account();
        picasso.deposit(5000);
        assertEquals(5000,picasso.checkBalance());
    }

    @Test
    public void testAccountCanPerformDepositTwice() {
        Account picasso = new Account();
        picasso.deposit(3000);
        picasso.deposit(4000);
        picasso.deposit(7000);
        assertEquals(14000, picasso.checkBalance());
    }
    @Test
    public void testAccountCanPerformWithdrawal() {
        Account picasso = new Account();
        picasso.withdraw(6000);
        assertEquals(-6000 ,picasso.checkBalance());
    }
}


