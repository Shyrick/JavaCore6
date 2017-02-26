package modul3_1.Task3_3;

public class Solution {


    public static void main(String[] args) {

        Course course1 = new Course("", "English");
        Course course2 = new Course("", "Java");
        Course course3 = new Course("", "Photo");
        Course course4 = new Course(51, "English for children", "Stogova E.");
        Course course5 = new Course(15, "Knitting", "Ivanova N");



        Student student2 = new Student("Denis", "Ivanov",  2);

        Course[] coursesTaken = {course1, course2};
        Student student3 = new Student("Volkov",  coursesTaken  );

        CollegeStudent collegeStudent2 = new CollegeStudent("Andrej", "Zubov", 1);
        CollegeStudent collegeStudent3 = new CollegeStudent("Pinchuk", coursesTaken);
        CollegeStudent collegeStudent4 = new CollegeStudent("FirstUkrainianCollege", 1, 1000001);

        SpecialStudent specialStudent1 = new SpecialStudent("Ivan", "Poroshenko", 1);
        SpecialStudent specialStudent2 = new SpecialStudent("Zibrov", coursesTaken);
        SpecialStudent specialStudent3 = new SpecialStudent(2, 12345678);


    }



}
