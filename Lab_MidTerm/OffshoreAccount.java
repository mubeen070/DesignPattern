public class OffshoreAccount {
    double balance;
    double TAX_RATE = 2;

    public OffshoreAccount(double b) {
        this.balance = b;
    }

    public double getTaxRate() {
        return TAX_RATE;
    }

    public double getOffshoreBalance() {
        return balance;
    }

    public void debit(double d) {

    }

    public void credit(double c) {

    }

}
