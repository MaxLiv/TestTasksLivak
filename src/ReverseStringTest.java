public class ReverseStringTest {


    public static void main(String[] args) {
        String testString = "Java test";

        String[] split = testString.split("");

        StringBuilder builder = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            builder.append(split[i]);
        }

        String resultString = builder.toString();
        System.out.println(resultString);
    }

}
