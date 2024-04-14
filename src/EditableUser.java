public interface EditableUser<T extends User> {
    void edit(int index, String firstName, String lastName, String middleName);
}
