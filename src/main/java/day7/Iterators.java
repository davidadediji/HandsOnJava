package day7;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterators {


    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.push("David");
        names.push("Caleb");
        names.push("Sally");

        Iterator<String> it = names.iterator();


//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        names.add(2, "Susan");
        for (String s: names){
            System.out.println(s);
        }
    }
}
