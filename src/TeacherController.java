import java.util.List;

public class TeacherController implements UserController<Teacher> {

    private TeacherService teacherService;
    private UserComparator<Teacher> userComparator;
    private TeacherView teacherView;

    public TeacherController(TeacherService teacherService, UserComparator<Teacher> userComparator, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.userComparator = userComparator;
        this.teacherView = teacherView;
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.createTeacher(firstName, lastName, middleName);
    }

    public void editTeacher(int index, String firstName, String lastName, String middleName) {
        teacherService.editTeacher(index, firstName, lastName, middleName);
    }

    public void displayAllTeachers() {
        List<Teacher> teachers = teacherService.getAllTeachers();
        teachers.sort(userComparator);
        teacherView.sendOnConsole(teachers);
    }
}