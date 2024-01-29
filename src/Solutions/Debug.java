package Solutions;

public class Debug {
    public static void main(String[] args) {
        System.out.println("Hello");
        double num = 0.0;
        for(int i = 0; i<1000; i++) {
            num = Math.sqrt(i);
            num = Math.pow(i, 3);
            System.out.print("");
        }
    }
}
