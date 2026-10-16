class MultiplicationTable {
    int number = 5;

    void display() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MultiplicationTable m = new MultiplicationTable();
        m.display();
    }
}
