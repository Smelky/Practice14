package prototype;

public class Student implements Cloneable{
    public Student clone() {
        try {
            return (Student)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
