package exercises.exercise05;

public class Employee {
    String name;
    String department;
    boolean adminAccess;

    public boolean canAccessAdminPanel() {
        return adminAccess;
    }
}
