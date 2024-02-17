public class Student extends User implements Comparable<Student>{
    private Long stodentId;
    private String firstName;
    private String lastName;
    private  String middleName;

    public Student(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public Long getStodentId() {
        return stodentId;
    }

    public void setStodentId(Long stodentId) {
        this.stodentId = stodentId;
    }

    @Override
    public int compareTo(Student o) {
        return this.stodentId.compareTo(o.stodentId);
    }
}
