package bank;

public class CreditCard {
    private int id;
    private String accountNumber;
    private double sumOnAccount;

    public CreditCard(int id, String accountNumber, double sumOnAccount) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.sumOnAccount = sumOnAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getSumOnAccount() {
        return sumOnAccount;
    }

    public void setSumOnAccount(double sumOnAccount) {
        this.sumOnAccount = sumOnAccount;
    }
    public void accrualAmount(double accrual){
        sumOnAccount += accrual;
        System.out.println("Сумма на карте: " +sumOnAccount);
    }
    public void withdrawalAmount(double withdrawal) {
        if (sumOnAccount < withdrawal){
            System.out.println("Недостаточно средств!");
        return;
    } else {
            sumOnAccount -= withdrawal;
            System.out.println("Сумма на карте после снятия: " +sumOnAccount);
        }
    }
    public void statusOfAccount(){
        System.out.println("В данный момент баланс на карте с ID: " + id + " и номером: " +accountNumber+", " + " составляет - " + sumOnAccount);
    }
}
