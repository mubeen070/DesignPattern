public class AbstractAccount implements Account {
    double balance;
    boolean isOverDraftAvailable;

    public AbstractAccount(double d) {
        this.balance = d;
    }

    public void setOverDraftAvailable(boolean overDraft) {
        this.isOverDraftAvailable = overDraft;
    }

    @Override
    public String toString() {
        return "Balance: " + balance + "OverDraftAvailability: " + isOverDraftAvailable;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public boolean isOverDraftAvailable() {
        return isOverDraftAvailable;
    }

    @Override
    public void credit(double c) {
    }

}
