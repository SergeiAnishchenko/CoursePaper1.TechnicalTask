public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String foolName, int department, double salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, закончилось место");
        }
        Employee newEmployee = new Employee(foolName, department, salary);
        employees[size++] = newEmployee;
    }

    public void printAllEmpoyees() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }

    public double getSummOfSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            sum += employee.getSalary();
        }
        return sum;
    }

    public void getEmployeeMinimumSalary() {
        Employee employee = employees[0];
        double minSalary = employee.getSalary();
        for (int i = 1; i < employees.length; i++) {
            employee = employees[i];
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        for (Employee anyEmployee : employees) {
            if (anyEmployee.getSalary() == minSalary) {
                System.out.println("Сотрудник с минимальной зарплатой: " + anyEmployee);
            }
        }
    }

    public void getEmployeeMaximumSalary() {
        Employee employee = employees[0];
        double maxSalary = employee.getSalary();
        for (int i = 1; i < employees.length; i++) {
            employee = employees[i];
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        for (Employee anyEmployee : employees) {
            if (anyEmployee.getSalary() == maxSalary) {
                System.out.println("Сотрудник с максимальной зарплатой: " + anyEmployee);
            }
        }
    }

    public void getAverageSalary() {
        double averageSalary;
        averageSalary = this.getSummOfSalary() / employees.length;
        System.out.println("Среднее значение зарплат составляет: " + averageSalary + " рублей.");
    }

    public void printAllFullNames() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getFoolName());
        }
    }

}



