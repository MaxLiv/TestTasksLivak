import java.util.Scanner;

public class AddTest {


    public static void main(String arg[]) {
        new AddTest().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();
        System.out.println(a + " + " + b + " = " + Add(a, b));
    }

    private static int Add(int x, int y) {
        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }
}
