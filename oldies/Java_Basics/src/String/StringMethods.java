package String;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String hello = "  hello sir what's up ?";
        System.out.println(hello.indexOf('u'));
        System.out.println(hello.toUpperCase());
        System.out.println(hello.toLowerCase());
        System.out.println(hello.toCharArray()[10]);
        System.out.println(hello.trim());
        System.out.println(hello.isEmpty());
        //compares the unicode in the form of integer byte by byte like the one in c
        System.out.println(hello.compareTo("  hello sir what's up ?"));
        System.out.println(hello.length());
        //returns  boolean true or false
        System.out.println(hello.equals("  hello sir what's up ?"));
        //converts both in a similar form lets say and compares sot the case the string is doesn't matter at all
//        returns integer value like that in compareTO
        System.out.println(hello.compareToIgnoreCase("  HEllo sir what's UP ?"));

        System.out.println("-----------------------------------------------------------------------------");
        //character manupulations
        char[] holder = new char[8];
        hello.getChars(10, 15, holder, 0);
        System.out.println("extracted items: " + Arrays.toString(holder));

    }
}
