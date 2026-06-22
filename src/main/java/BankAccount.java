

import java.util.List;

public class BankAccount {

    private String accountNumber;
    private String customerName;
    private double openingBalance;
    private List<Transaction> transactions;

    public BankAccount(String accountNumber,
                       String customerName,
                       double openingBalance,
                       List<Transaction> transactions) {

        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.openingBalance = openingBalance;
        this.transactions = transactions;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getOpeningBalance() {
        return openingBalance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}