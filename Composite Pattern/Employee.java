public class Employee {
    private Director director;

    public void generateOrganogram() {
        director = new Director("Asim Muneer", 16);

        HOD headCS = new HOD("Mazhar Iqbal", 10, "Computer Science");
        HOD headEE = new HOD("Umar Farid", 5, "Electrical Engineering");

        Teacher teacher1 = new Teacher("Mukhtiar Zamin", 15, "PhD", "Permanent");
        Teacher teacher2 = new Teacher("Kashif Bilal", 6, "PhD", "Permanent");

        DOO doo1 = new DOO("Qamar Javed", 7, "DOO");
        DOO doo2 = new DOO("Iqbal", 5, "DOO");

        director.addSubordinate(headCS);
        director.addSubordinate(headEE);

        headCS.addSubordinate(teacher1);
        headCS.addSubordinate(doo1);

        headEE.addSubordinate(teacher2);
        headEE.addSubordinate(doo2);
    }

    public void bonuses(String bonusType, int percentageOfBonus) {
        if (director != null) {
            director.giveBonus(percentageOfBonus);
        }
    }

    public void printDetails() {
        if (director != null) {
            System.out.println(director);
        }
    }
}
