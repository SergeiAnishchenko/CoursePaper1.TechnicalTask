public class Employee {
    private final String foolName;
    private int department;
    private double salary;
    private int id;
    public static int counter = 1;

    public Employee(String foolName, int department, double salary) {
        this.foolName = foolName;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    public void setDepartment(int department) {
        if (department > 0) {
            this.department = department;
        } else System.out.println("Ошибка! Номер отдела должен быть положительным числом!");
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else System.out.println("Ошибка! Зарплата должна быть положительным числом!");
    }

    public String getFoolName() {
        return foolName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ФИО сотрудника: " + foolName + ". Отдел №" + department +
                ". Зарплата: " + salary + ". Идентификационный номер: " + id + ".";
    }
}


