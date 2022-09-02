package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        //Array list is a dynamic collection
        //what is the difference btw list and arraylist  list:interface    ArrayList: class implementation
        File file = new File("./src/main/java/day4/test.txt");
        Scanner in = new Scanner(file);

        List<String> items = new ArrayList<>();
        while(in.hasNextLine()){
            items.add(in.nextLine());
        }
        System.out.println(items);
       for (int i = 0; i < items.size(); i++){
           System.out.println(items.get(i));
       }
        in.close();
    }
}
