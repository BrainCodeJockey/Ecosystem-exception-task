import java.util.*;

public class StudentRepo {

    private final Map<String, Student> students = new HashMap<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student save(Student student) {
        students.put(student.id(), student);
        return student;
    }

    public Student findStudentById(String id) {
        return Optional.ofNullable(students.get(id))
                .orElseThrow(() -> new IllegalArgumentException("Student with id " + id + " not found"));
    }


}

