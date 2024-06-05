import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HOD extends BaseEmployee {
    private String department;
    private List<IEmployee> subordinates;

    public HOD(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
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
        StringBuilder builder = new StringBuilder();
        builder.append("HOD: [Name: ").append(name).append(", Salary: ").append(salary).append(", Department: ")
                .append(department).append("]\n");
        for (IEmployee employee : subordinates) {
            builder.append("\t").append(employee.toString()).append("\n");
        }
        return builder.toString();
    }

    public Iterator<IEmployee> iterator() {
        return subordinates.iterator();
    }
}
