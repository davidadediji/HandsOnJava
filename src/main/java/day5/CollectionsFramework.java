package day5;

import java.util.LinkedList;

public class CollectionsFramework {
    public static void main(String[] args) {
        //a collection describes anything you can store data in
        //what are interfaces

        //Stack and Queues
        //stack - FILO first in last out

        //Queue - first in, first out, a linkedList can be used as a Queue with the .remove method

        //Linkedin list

        LinkedList<String> names = new LinkedList<>();
        names.add("David");
        names.add("Caleb");
        names.add("Sally");

        System.out.println(names.remove());
        System.out.println(names.remove());
        System.out.println(names.remove());
    }
}
