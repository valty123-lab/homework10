public class Employee {
    private static int idGenerator=1;

    private final int id;
    private final String fullName;
    private int salary;
    private int department;

    public Employee(String fullName, int department, int salary){
        id = idGenerator++;
        this.fullName=fullName;
        this.department=department;
        this.salary=salary;
    }

    public static int getIdGenerator() {
        return idGenerator;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", department=" + department;
    }
}
