import java.util.List;

public class Teacher extends Accaount {

    private String teach;
    private List<Student> students;

    public Teacher(String name, String surname, int age, String teach, List<Student> students) {
        super(name, surname, age);
        this.teach = teach;
        this.students = students;

    }

    public void AllStudents() {
        System.out.println("Teacher " + name + "\nSpecalizeitet " + teach);
        System.out.println("Teaching: " + students);

        for (Student stu : students) {
            System.out.println("  " + Accaount.getName() + " " + Student.getSurname());
        }
    }

}
