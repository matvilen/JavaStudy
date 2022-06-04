package laba_3.task2.employee;

public class Ruler extends Engineer{

    public Ruler() {
    }

    public Ruler(String name, String position, String organization, String department) {
        super(name, position, organization, department);
    }

    @Override
    public String introduce() {
        return super.introduce() + ", I am head of this department";
    }
}