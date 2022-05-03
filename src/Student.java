import java.util.Objects;

public class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return this.name == student.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
}
