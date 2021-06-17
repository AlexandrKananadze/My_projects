import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reader {
        public static class Buffered {
        public static void main(String[] args)
                throws IOException {

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            String title = reader.readLine();
            String pagesStr = reader.readLine();

            int pages = Integer.parseInt(pagesStr);
            System.out.println(title);
            System.out.println(pages+1);
        }
    }
}
