import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount("ACC101", "Yogesh", 10000, List.of(new Transaction("T101", "DEPOSIT", 5000), new Transaction("T102", "WITHDRAW", 2000))));
        accounts.add(new BankAccount("ACC102", "Rahul", 15000, List.of(new Transaction("T103", "DEPOSIT", 3000), new Transaction("T104", "WITHDRAW", 1000))));
        accounts.add(new BankAccount("ACC103", "Amit", 20000, List.of(new Transaction("T105", "WITHDRAW", 4000), new Transaction("T106", "DEPOSIT", 7000))));

        ExecutorService executor = Executors.newFixedThreadPool(3);


        List<Future<String>> futures = new ArrayList<>();

        for(BankAccount account : accounts)
        {
            StatementGenerator statement = new StatementGenerator(account);
            Future<String> future = executor.submit(statement);
            futures.add(future);

        }

        for (Future<String> future : futures) {

            String statement = future.get();

            System.out.println(statement);
        }

        executor.shutdown();

        System.out.println("\nAll Statements Generated Successfully");

    }
}
