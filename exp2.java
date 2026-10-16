class Addition {
    int a = 10;
    int b = 20;

    void display() {
        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);
        System.out.println("Addition: " + (a + b));
    }
}

public class Main {
    public static void main(String[] args) {
        Addition a = new Addition();
        a.display();
    }
}
