package day2;

import java.util.Scanner;

public class Main {

    //control flow - branching and looping
    public static void main(String[] args) {
        System.out.print("Enter your name: ");

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        if (s.equals("Caleb")){
            System.out.println("Hey Caleb");
        }else if(s.equals("Sally")){
            System.out.println("Hey Sally");
        }else{
            System.out.println("You are not welcome here");
        }

//        int i = 0; //initialise
//        while(i<10){  //condition
//            System.out.println("i is: "+ i);
//            i++; //update
//        }

        for(int i = 0; i<10; i++){
            System.out.println(i);
        }

        in.close();
    }
}
