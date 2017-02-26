package modul3_1.Task3_3;

public class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(int group, long secretKey) {
       this.secretKey = secretKey;
    }
}
