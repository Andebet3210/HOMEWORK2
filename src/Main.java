import java.util.Arrays;


//hi this is the homework that descirbes getter and setter
public class Main{


    public static void main(String[] args) {

        // Create objects
        Student s1 = new Student("Andebet", 001, new int[]{90, 85, 92,88,76});
        Student s2 = new Student("Estif", 002, new int[]{80, 75, 78,95,81});

        Teacher t1 = new Teacher("Bena", "OOP");
        Teacher t2 = new Teacher("Ayele", "OODB");

        College college = new College("CCI");

        // Add students and teachers
        college.addStudent(s1);
        college.addStudent(s2);
        college.addTeacher(t1);
        college.addTeacher(t2);

        // Print details
        System.out.println("College Name: " + college.getName());
        System.out.println("Students: ");
        for (Student s : college.getStudents()) {
            System.out.println(s.getName() + " - ID: " + s.getId() + ", Grades: " + Arrays.toString(s.getGrades()));
        }
        System.out.println("Teachers: ");
        for (Teacher t : college.getTeachers()) {
            System.out.println(t.getName() + " - Subject: " + t.getSubject());
        }
    }

}