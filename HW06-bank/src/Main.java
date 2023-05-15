import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Client vladimir = new Client("vladimir", 57);
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account(123456, 501));
        accounts.add(new Account(123555, 4023));

        Client andrey = new Client("andrey", 31);
        ArrayList<Account> accounts1 = new ArrayList<>();
        accounts1.add(new Account(111111, 1));
        accounts1.add(new Account(222222, 23));
        accounts1.add(new Account(333333, 456));

        Client pety = new Client("pety", 20);
        ArrayList<Account> accounts2 = new ArrayList<>();
        accounts2.add(new Account(444444, 0));
        accounts2.add(new Account(555555, 13));
        accounts2.add(new Account(666666, 56));

        bank.clientCard(vladimir, accounts);
        bank.clientCard(andrey, accounts1);
        bank.clientCard(pety, accounts2);

        bank.info();
    }
}