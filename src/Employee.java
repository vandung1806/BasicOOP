public class Employee {
    String employeeName;
    int employeeAge;
    double employeeSalary;
    boolean maritalStatus;

    void displayEmployeeDetails() {
        System.out.println("Employee Details");
        System.out.println("===============");
        System.out.println("EmpoloyeeName: " + employeeName);
        System.out.println("EmployeeAge: " + employeeAge);
        System.out.println("EmployeeSalary: "+ employeeSalary);
        System.out.println("EmployeeMaritalStatus: " + maritalStatus);
    }
}
