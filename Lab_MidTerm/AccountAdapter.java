public class AccountAdapter extends AbstractAccount {

    @SuppressWarnings("unused")
    private OffshoreAccount offshoreAccount;

    public AccountAdapter(double d, OffshoreAccount offshoreAccount) {
        super(d);
        this.offshoreAccount = offshoreAccount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public boolean isOverDraftAvailable() {
        return false;
    }

    @Override
    public void credit(double c) {

    }

}
