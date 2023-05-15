import java.util.Objects;

public class Account {
    private int id;
    private int accountAmount;


    public Account(int id, int accountAmount) {
        this.id = id;
        this.accountAmount = accountAmount;
    }

    public Account(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account: " + id + ", amount of gold coins: " + accountAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
