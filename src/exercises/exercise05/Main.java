package exercises.exercise05;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "Ezequias";
        employee.department = "Backend";
        employee.adminAccess = true;

        System.out.println("Name: " + employee.name);
        System.out.println("Department: " + employee.department);
        System.out.println("Admin panel access: " + employee.canAccessAdminPanel());
    }
}
