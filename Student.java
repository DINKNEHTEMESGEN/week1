public class Student extends Person {
    Classroom classroom;

    public Student(int age, boolean parentPermission, String name, int classroom) {
        super(age, parentPermission, name);
        this.classroom = new Classroom (classroom);
    }
    public void setClassroom(Classroom classroom) {
        //this.classroom = classroom;
        this.classroom = classroom;
        classroom.addStudent(this);

    }

    public Classroom getClassroom() {
        return classroom;
    }

}
