public interface Account {

    public abstract double getBalance();

    public abstract boolean isOverDraftAvailable();

    public abstract void credit(double c);

}
