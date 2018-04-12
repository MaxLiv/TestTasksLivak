import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringBeforeCommaTest {

    public static void main(String[] args) {


        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/max/IdeaProjects/untitled/src/testTasks/test.txt"))) {
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
