class SimpleInterest {
    double p = 10000;
    double r = 5;
    double t = 2;

    void display() {
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
    }
}

public class Main {
    public static void main(String[] args) {
        SimpleInterest s = new SimpleInterest();
        s.display();
    }
}
