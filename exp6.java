class Largest {
    int a = 25;
    int b = 15;

    void display() {
        if (a > b) {
            System.out.println(a + " is the Largest Number");
        } else if (b > a) {
            System.out.println(b + " is the Largest Number");
        } else {
            System.out.println("Both Numbers are Equal");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Largest l = new Largest();
        l.display();
    }
}
