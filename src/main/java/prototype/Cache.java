package prototype;

public class Cache {
    private Student student;

    public Student getStudent() {
        return student.clone();
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
