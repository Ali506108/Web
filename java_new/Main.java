import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> info = new HashSet<>();

        info.add("Math");

        info.add("Basic programing");

        info.add("Electronic");

        info.add("Networkng");

        info.add("OOP");

        Student first = new Student("Ali", "Duisen", 18, "CS-24", info);

        first.listCourse();
    }
}