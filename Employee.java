public class Employee extends Worker{

    private long employeeId;
    private String hireDate;

    public Employee() {
    }

    public Employee(String name, String birthDate) {
        super(name, birthDate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
