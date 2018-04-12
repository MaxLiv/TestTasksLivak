import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StringBeforeCommaTest {

    public static void main(String... args) {

      new StringBeforeCommaTest().run();
    }

    private void run(){
        String fullPath = new File("").getAbsolutePath();

        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fullPath + "/test.txt"))) {
            int CurrentChar;
            while ((CurrentChar = br.read()) != -1) {
                char ch = (char) CurrentChar;
                if (ch == ',')
                    break;
                contentBuilder.append(ch);
            }

            System.out.println(contentBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
