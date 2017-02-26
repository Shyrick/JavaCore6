package modul3_1.Task3_3;

public class CollegeStudent extends Student {

    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent() {
    }

    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public CollegeStudent(String collegeName, int rating, long id) {
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }
}
