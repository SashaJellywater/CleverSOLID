import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers = new ArrayList<>();

    public void createTeacher(String firstName, String lastName, String middleName) {
        Teacher teacher = new Teacher(firstName, lastName, middleName);
        teachers.add(teacher);
    }

    public void editTeacher(int index, String firstName, String lastName, String middleName) {
        if (index >= 0 && index < teachers.size()) {
            Teacher teacher = teachers.get(index);
            teacher = new Teacher(firstName, lastName, middleName);
            teachers.set(index, teacher);
        }
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }
}
