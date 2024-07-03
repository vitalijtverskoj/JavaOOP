package Lesson4;

public class Main {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        controller.create("1", "5", "9");
        controller.create("2", "6", "10");
        controller.create("3", "7", "11");
        controller.create("4", "8", "12");
        controller.printStudentList();
    }
}
