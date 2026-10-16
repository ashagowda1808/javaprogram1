class Student {
    int rollNo = 101;
    String name = "Ravi";

    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
