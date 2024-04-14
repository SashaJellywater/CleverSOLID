public class Teacher extends User implements ComparableUser {
    private Long teacherId;

    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public int compareTo(User o) {
        return this.teacherId.compareTo(((Teacher) o).getTeacherId());
    }
}

