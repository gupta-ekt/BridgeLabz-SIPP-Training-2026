class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}

class Student extends Person {

    private final int studentId;
    private double gpa;

    public Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String toString() {
        return super.toString() +
                "\nStudent ID: " + studentId +
                "\nGPA: " + gpa;
    }
}

class GradStudent extends Student {

    private String thesis;

    public GradStudent(String name, int age, int studentId,
                       double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    public String toString() {
        return super.toString() +
                "\nThesis: " + thesis;
    }
}

public class UniversitySystem {

    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Rahul", 23, 101, 9.1,
                "Artificial Intelligence");

        System.out.println(gs);

        System.out.println();

        System.out.println("GradStudent IS-A Student : "
                + (gs instanceof Student));

        System.out.println("GradStudent IS-A Person : "
                + (gs instanceof Person));
    }
}