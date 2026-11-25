import java.util.*;

class Employee {
    int id;
    String name;
    String status;

    Employee(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    void display() {
        System.out.println(id + "  " + name + "  " + status);
    }
}

public class AttendanceManagement {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Rahul", "Present"));
        list.add(new Employee(102, "Amit", "Absent"));
        list.add(new Employee(103, "Ravi", "Present"));
        list.add(new Employee(104, "Neha", "Leave"));

        System.out.println("EMPLOYEE ATTENDANCE");
        System.out.println("ID   Name   Status");

        for (Employee e : list) {
            e.display();
        }

        // Search Employee
        int searchId = 102;
        boolean found = false;

        for (Employee e : list) {
            if (e.id == searchId) {
                System.out.println("\nEmployee Found:");
                e.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee Not Found");
        }
    }
}