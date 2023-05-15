import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Bank {
    private final HashMap<Client, ArrayList<Account>> allCustomerAccounts = new HashMap<>();
    private final HashMap<Account, Client> findClient = new HashMap<>();

    public void clientCard(Client client, ArrayList<Account> accounts){
        allCustomerAccounts.put(client,accounts);
        for(Account ac : accounts){
            findClient.put(ac,client);
        }
    }

    public Client customerSearch(Account account){
        return findClient.get(account);
    }

    public ArrayList<Account> searchAllAccounts(Client client){
        return allCustomerAccounts.get(client);
    }

    public void info(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя клиента или номер счета: ");
        if (sc.hasNextInt()){
            int id = sc.nextInt();
            Account account = new Account(id);
            System.out.println(customerSearch(account));
        }else {
            String name = sc.next();
            System.out.println("Введите возраст клиента: ");
            int age = sc.nextInt();
            Client client = new Client(name, age);
            for (Account account : searchAllAccounts(client)) {
                System.out.println(account);
            }
        }
    }
}
