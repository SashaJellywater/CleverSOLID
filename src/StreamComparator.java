import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup> {
    @Override
    public int compare(StudentGroup group1, StudentGroup group2) {
        return Integer.compare(group1.getStudentList().size(), group2.getStudentList().size());
    }
}
