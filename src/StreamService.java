import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    private Flow flow;

    public List<StudentGroup> getSortedStudentGroupList() {
        List<StudentGroup> studentGroups = new ArrayList<>(flow.getStudentGroupList());
        Collections.sort(studentGroups, new StreamComparator());
        return studentGroups;
    }
}