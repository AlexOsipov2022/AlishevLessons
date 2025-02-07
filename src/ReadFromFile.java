import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "\\Users\\alexandr.osipov\\Documents\\Tech Help\\Hot keys.txt";

        File file = new File(path);
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}
