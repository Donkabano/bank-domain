package by.ilyabychkovski.bank.domain;

import java.util.Arrays;
import java.util.Objects;

public class Client {

    private long id;
    private String firstName;
    private String surname;
    private Account[] accounts;

    public Client(long id, String firstName, String surname, Account... accounts) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.accounts = accounts;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account... accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Client client = (Client) o;
        return id == client.id && Objects.equals(firstName, client.firstName) && Objects.equals(surname, client.surname) && Arrays.equals(accounts, client.accounts);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, firstName, surname);
        result = 31 * result + Arrays.hashCode(accounts);
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
