import java.util.Set;

public class Student extends Accaount {

    protected String cls;
    protected Set<String> course;

    public Student(String name, String surname, int age, String cls, Set<String> course) {
        super(name, surname, age);
        this.cls = cls;
        this.course = course;
    }

    public Student(String string, String string2, int i, String string3, String string4, String string5,
            String string6) {
    }

    public String getCls() {
        return cls;
    }

    public Set<String> getCourse() {
        return course;
    }

    public void listCourse() {
        System.out.println(name + " " + surname + " " + age);
        for (String cour : course) {
            System.out.println(cour);
        }
    }
}
