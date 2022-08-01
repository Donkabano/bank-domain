package by.ilyabychkovski.bank;

import by.ilyabychkovski.bank.domain.Account;
import by.ilyabychkovski.bank.domain.Client;
import by.ilyabychkovski.bank.domain.Currency;

public class Main {

    public static void main(String[] args) {

        Client client = new Client(345, "Ilya", "Bychkovski");
        Account account = new Account(235L, 340_000, Currency.USD);
        Account account1 = new Account(366L, 564, Currency.BYN);
        
        client.setAccounts(account, account1);
        account.getId();
        account.setAmount(account.getAmount() - 100_000);

    }
}
