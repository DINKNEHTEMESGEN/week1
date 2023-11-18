import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private  String label;
    List<Student> students = new ArrayList<>();

    public Classroom(int label) {
        this.label = String.valueOf(label);
        this.students = students;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public void addStudent(Student student) {
        students.add(student);
        student.setClassroom(this);
    }
}
