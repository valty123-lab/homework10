import java.util.Random;

public class Main {
    private final static Random RANDOM = new Random();
    private final static String[] NAMES = {"Иван", "Петр", "Андрей", "Михаил", "Павел", "Андрей"};
    private final static String[] SURNAMES = new String[]{"Иванов", "Петров", "Андреев", "Михайлов", "Павлов", "Андреев"};
    private final static String[] PATRONYMIC_NAMES = new String[]{"Иванович", "Петрович", "Андреевич", "Михайлов", "Павлович", "Андреевич"};
    private final static Employee[] EMPLOYEES = new Employee[10];

    private static void initEmployees() {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            String fullNAme = SURNAMES[RANDOM.nextInt(0, SURNAMES.length)]
                    + NAMES[RANDOM.nextInt(0, NAMES.length)] + " "
                    + PATRONYMIC_NAMES[RANDOM.nextInt(0, PATRONYMIC_NAMES.length)];
            EMPLOYEES[i] = new Employee(fullNAme, RANDOM.nextInt(1, 6), RANDOM.nextInt(50_0000, 100_000));

        }

    }

    public static void main(String[] args) {
        initEmployees();
        print();
        System.out.println("Cумма ЗП сотрудников: "+ calculateSumOfSalaries());
        System.out.println("Cумма ЗП сотрудников c мин ЗП: "+ findEmployeeWithMinSalary());
        System.out.println("Cумма ЗП  с максимальной ЗП: "+ findEmployeeWithMaxSalary());
        System.out.println("Cредняя ЗП: "+ calculateAverageOfSalaries());
    }

    private static void print() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    private static int calculateSumOfSalaries() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum+=employee.getSalary();
        } return sum;
    }
    private static Employee findEmployeeWithMinSalary(){
        Employee employeeWithMinSaLary=null;
        for (Employee employee : EMPLOYEES) {
            if ( employeeWithMinSaLary==null|| employee.getSalary()<employeeWithMinSaLary.getSalary()){
                employeeWithMinSaLary=employee;
            }
        }
        return employeeWithMinSaLary;
    }
    private static Employee findEmployeeWithMaxSalary(){
        Employee employeeWithMaxSaLary=null;
        for (Employee employee : EMPLOYEES) {
            if ( employeeWithMaxSaLary==null|| employee.getSalary()>employeeWithMaxSaLary.getSalary()){
                employeeWithMaxSaLary=employee;
            }
        }
        return employeeWithMaxSaLary;
    }
    private static double calculateAverageOfSalaries() {
        return (double) calculateSumOfSalaries()/EMPLOYEES.length;
    }

}