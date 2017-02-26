package modul3_1.Task3_3;

public class Course {
    private String startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;



    public Course(String startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course(int hoursDuration, String name,  String teacherName) {
        this.hoursDuration = hoursDuration;
        this.name = name;
        this.teacherName = teacherName;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
