package ex8_5;

public class StudentMain {
    public static void main(String[] args) {
        Student Umm = new Student(20140556,"엄");
        Student Jun = new Student(20783478,"준");
        Student Sik = new Student(20174753,"식");
        System.out.printf("Student 객체의 수: %d",Student.count);
    }
}
