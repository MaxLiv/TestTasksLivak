import java.util.Scanner;

public class ReverseStringTest {


    public static void main(String[] args) {
        new ReverseStringTest().run();
    }

    private void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string, that you want to reverse: ");
        String testString = scanner.next();

        String[] split = testString.split("");

        StringBuilder builder = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            builder.append(split[i]);
        }

        String resultString = builder.toString();
        System.out.println(resultString);
    }


}
