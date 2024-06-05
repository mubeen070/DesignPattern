public class Teacher extends BaseEmployee {
    private String qualification;
    private String status;

    public Teacher(String name, int salary, String qualification, String status) {
        super(name, salary);
        this.qualification = qualification;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Teacher: [Name: " + name + ", Salary: " + salary + ", Qualification: " + qualification
                + ", Status: " + status + "]";
    }
}
