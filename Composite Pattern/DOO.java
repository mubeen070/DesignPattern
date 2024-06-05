public class DOO extends BaseEmployee {
    private String rank;

    public DOO(String name, int salary, String rank) {
        super(name, salary);
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "DOO: [Name: " + name + ", Salary: " + salary + ", Rank: " + rank + "]";
    }
}
