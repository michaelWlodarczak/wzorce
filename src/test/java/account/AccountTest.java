package account;

//        Praca domowa. Napisz testy do zadania z aplikacja bankowa:
//        Przykladowe scenariusze testowe
//        void should_return_zero_balance_for_new_account() -done
//        void should_return_balance_of_100_after_deposit_of_100() -done
//        void should_return_balance_minus_withdraw() -done
//        void should_return_balance_minus_withdraw_including_maximum_debit_of_1000() -done
//   ->?? void should_not_complete_transaction_exceeding_maximum_debit_of_1000() -done
//        void should_not_complete_withdraw_transaction_with_negative_amount() -done
//        void should_not_complete_deposit_transaction_with_negative_amount() -done
//     ?? void should_transfer_money_between_accounts() -done
//   ->?? void should_not_transfer_money_between_accounts_if_exceeding_maximum_debit_of_1000() -done
//        void should_not_transfer_money_between_accounts_if_amount_is_negative() -done
//        void should_return_null_name_for_new_account() -done
//        void should_return_name_of_account()
//        void should_contains_account_balance()

import org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {
    Account account1;

//    @Test
//    void getName(){
//     //arrange
//        final Account account = new Account();
//        //act
//        account.setName("premium");
//        //assert
//        assertEquals("premium",account.getName());
//    }

    @BeforeEach
    void beforeEachMethod() {
        account1 = new Account();
    }

    @Test
    void should_return_zero_balance_for_new_account() {
        //Given
        account1.getBalance();
        //When
        int expectedBalance = 1;
        //Then
        assertEquals(expectedBalance, account1.getBalance(),"expected balance " + expectedBalance);
    }

    @Test
    void should_return_balance_of_100_after_deposit_of_100(){
        //Given
        account1.deposit(100);
        //When
        int expectedBalance = 100;  // int expectedBalance = 150; test nie przechodzi
        //Then
        assertEquals(expectedBalance, account1.getBalance());
    }

    @Test
    void should_return_balance_minus_withdraw(){
        //Given
   //     account1.setBalance(10);  //na potrzeby tego testu w klasie Account stworzylem setBalance
        account1.withdraw(10);
        //When
        int expectedBalance = -10;
        //Then
        assertEquals(expectedBalance, account1.getBalance());
    }

    @Test
    void should_return_balance_minus_withdraw_including_maximum_debit_of_1000(){
        //Given
        account1.setMaxDebit(-1000);
        account1.setBalance(0);
        account1.withdraw(1000);
        //When
        int expectedBalance = -1000;  //int expectedBalance = 0;  test nie przechodzi
        //Then
        assertEquals(expectedBalance, account1.getBalance());

    }

    @Test
    void should_not_complete_transaction_exceeding_maximum_debit_of_1000(){   //??
        //Given
        Account account2 = new Account();
        account1.setBalance(0);
        account1.setMaxDebit(-1000);
        account2.setBalance(0);
        //When
        int amountOfTransfer = 2000;
        account1.transfer(account2,amountOfTransfer);
        int expectedBalance = 0; // int expectedBalance = -2000; test nie przejdzie
        //Then
        assertEquals(expectedBalance, account1.getBalance());
    }

    @Test
    void should_not_complete_withdraw_transaction_with_negative_amount(){
        //Given
        account1.withdraw(-100);
        //When
        int expectedBalance = 0; // int expectedBalance = -100; test nie przejdzie
        //Then
        assertEquals(expectedBalance, account1.getBalance());
    }

    @Test
    void should_not_complete_deposit_transaction_with_negative_amount(){
        //Given
        account1.deposit(-100);
        //When
        int expectedBalance = 0; //int expectedBalance = -100; test nie przejdzie
        //Then
        assertEquals(expectedBalance,account1.getBalance());
    }

    @Test
    void should_transfer_money_between_accounts(){
        //Given
        Account account2 = new Account();
        account1.transfer(account2,100);
        //When
        int expectedBalance1 = -100;
        //int expectedBalance2 = 100;
        //Then
        assertEquals(expectedBalance1,account1.getBalance());
        //Assertions.assertEquals(expectedBalance2,account2.getBalance());
    }

    @Test
    void should_not_transfer_money_between_accounts_if_exceeding_maximum_debit_of_1000(){
        //Given
        Account account2 = new Account();
        //account1.setBalance(0);
       // account1.setMaxDebit(-1000); nie trzeba tego pisac
        //account2.setBalance(0);
        //When
        int amountOfTransfer = 2000;
        account1.transfer(account2,amountOfTransfer);
        int expectedBalance = 0; // int expectedBalance = -2000; test nie przejdzie
        //Then
        assertEquals(expectedBalance, account1.getBalance());
        assertEquals(expectedBalance,account2.getBalance());
    }

    @Test
    void should_not_transfer_money_between_accounts_if_amount_is_negative(){
         //Given
        Account account2 = new Account();
        account1.transfer(account2,-100);
        //Then
        int expectedBalance = 0; //int expectedBalance = -100; test nie przejdzie
        //When
        assertEquals(expectedBalance, account1.getBalance());
    }

    @Test
    void should_return_null_name_for_new_account(){
        //Given
        account1.setName(null);
        //When
        String expectedName = null; //String expectedName = "Konto Premium";
        //Then
        assertEquals(expectedName,account1.getName());
    }
    //TODO
    @Test
    void should_return_name_of_account(){
        //Given
        account1.setName("Konto premium");
        //When
        String expectedName = "Konto Premium";
        //String expectedName = null;
        //Then
        assertEquals(expectedName,account1.getName());
    }
    //TODO
    void should_contains_account_balance(){

    }
}
