package lesson36;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\file.txt");

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
