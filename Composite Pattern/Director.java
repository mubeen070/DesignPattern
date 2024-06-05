import java.util.ArrayList;
import java.util.List;

public class Director extends BaseEmployee {
    private List<IEmployee> subordinates;

    public Director(String name, int salary) {
        super(name, salary);
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(IEmployee employee) {
        subordinates.add(employee);
    }

    public void removeSubordinate(IEmployee employee) {
        subordinates.remove(employee);
    }

    public List<IEmployee> getSubordinates() {
        return subordinates;
    }

    @Override
    public void giveBonus(int bonusPercentage) {
        super.giveBonus(bonusPercentage);
        for (IEmployee employee : subordinates) {
            employee.giveBonus(bonusPercentage);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Director [Name: ").append(name).append(", Salary: ").append(salary).append("]\n");
        for (IEmployee employee : subordinates) {
            sb.append("\t").append(employee.toString()).append("\n");
        }
        return sb.toString();
    }
}
