public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Иванов Иван Иванович", 1, 59000);
        employeeBook.addEmployee("Петров Петр Петрович", 2, 76000);
        employeeBook.addEmployee("Сидоров Семен Семенович", 4, 58000);
        employeeBook.addEmployee("Борисов Борис Борисович", 1, 187_000);
        employeeBook.addEmployee("Алексеев Алексей Алесеевич", 2, 265_000);
        employeeBook.addEmployee("Николаев Николай Николаевич", 5, 88000);
        employeeBook.addEmployee("Ильин Илья Ильич", 1, 77000);
        employeeBook.addEmployee("Федоров Федор Федорович", 1, 120_000);
        employeeBook.addEmployee("Андреев Андрей Андреевич", 2, 123_000);
        employeeBook.addEmployee("Михайлов Михаил Михайлович", 3, 104_000);

        employeeBook.printAllEmpoyees();
        System.out.println();

        employeeBook.getSummOfSalary();
        System.out.println();

        employeeBook.getEmployeeMinimumSalary();
        System.out.println();

        employeeBook.getEmployeeMaximumSalary();
        System.out.println();

        employeeBook.getAverageSalary();
        System.out.println();

        employeeBook.printAllFullNames();
        System.out.println();

    }
}