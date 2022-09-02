package day6;

import java.util.LinkedList;

public class Stacks {
    //stacks : first in last out
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.push("David");
        names.push("Caleb");
        names.push("Sally");

        System.out.println(names.pop()); //same as the default remove first without an argument
        System.out.println(names.remove());
        System.out.println(names.removeFirst()); //remove first allows you pass an index first

    }

}
