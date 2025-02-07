import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "\\Users\\alexandr.osipov\\Documents\\Tech Help\\Hot keys.txt";

        File file = new File(path);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        //ввод данных в массив
//        String line = scanner.nextLine();
//        String[] array = line.split(" ");  //разделитель точка ("\\.")
//        System.out.println(Arrays.toString(array));

        //ввод чисел в массив
//        String line = scanner.nextLine();
//        String[] numbersString = line.split(" ");  //разделитель точка ("\\.")
//        int[] numbers = new int[3];
//        int counter = 0;
//        for (String number : numbersString) {
//            numbers[counter++] = Integer.parseInt(number);
//          }
//            System.out.println(Arrays.toString(numbers));

            scanner.close();
        }
    }

