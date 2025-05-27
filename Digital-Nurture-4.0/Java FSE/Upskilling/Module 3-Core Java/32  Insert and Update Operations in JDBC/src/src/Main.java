import dao.StudentDAO;
import model.Student;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        Student newStudent = new Student(2, "Udhay Karthik", 20, "Computer Science");
        dao.insertStudent(newStudent);

        newStudent.setName("Alice Johnson");
        newStudent.setAge(21);
        dao.updateStudent(newStudent);
    }
}
