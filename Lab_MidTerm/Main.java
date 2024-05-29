public class Main {
    public static void main(String[] args) {

        Account StandardAccount = new StandardAccount(23);
        Account PlatinumAccount = new StandardAccount(53);

        System.out.println("Balance: " + StandardAccount.getBalance());
        System.out.println("Balance: " + PlatinumAccount.getBalance());

        OffshoreAccount offshoreAccount = new OffshoreAccount(42);
        System.out.println(offshoreAccount.getTaxRate());

        AccountAdapter adapter = new AccountAdapter(50, offshoreAccount);

        System.out.println(adapter.getBalance());
    }

}
