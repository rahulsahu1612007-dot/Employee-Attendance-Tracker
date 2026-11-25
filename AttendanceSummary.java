import java.util.*;

public class AttendanceSummary {

    public static void main(String[] args) {

        String[] names = {
            "Rahul", "Amit", "Ravi",
            "Neha", "Priya", "Raj"
        };

        String[] status = {
            "Present", "Absent", "Present",
            "Leave", "Present", "Absent"
        };

        HashMap<String, Integer> count = new HashMap<>();

        for (String s : status) {
            count.put(s, count.getOrDefault(s, 0) + 1);
        }

        System.out.println("ATTENDANCE REPORT");

        for (int i = 0; i < names.length; i++) {
            System.out.println(
                names[i] + " : " + status[i]
            );
        }

        System.out.println("\nTOTAL SUMMARY");

        System.out.println("Present: " +
            count.getOrDefault("Present", 0));

        System.out.println("Absent: " +
            count.getOrDefault("Absent", 0));

        System.out.println("Leave: " +
            count.getOrDefault("Leave", 0));
    }
}
