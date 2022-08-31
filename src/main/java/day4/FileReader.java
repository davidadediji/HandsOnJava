package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("./src/main/java/day4/test.txt"));
        List<String> items = new ArrayList<>();
        while(in.hasNextLine()){
            items.add(in.nextLine());
        }
        System.out.println(items);
        in.close();
    }
}
