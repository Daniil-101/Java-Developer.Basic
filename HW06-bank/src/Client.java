import java.util.ArrayList;
import java.util.Objects;

public class Client {
    private int age;
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }



    @Override
    public String toString() {
        return "Client " + name + ", " + age + " years old";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
