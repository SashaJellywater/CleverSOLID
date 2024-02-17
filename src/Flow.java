import java.util.Iterator;
import java.util.List;

public class Flow implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroupList;

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        studentGroupList.add(studentGroup);
    }

    public Iterator<StudentGroup> iterator() {

        return studentGroupList.iterator();
    }
}
