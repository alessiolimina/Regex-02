package it.develhope.regex;

public class Start {
    public static void main(String[] args) {

        System.out.println("----------Starting---------------");

        String s1 = "tup tuup tuuup tuuuup";

        System.out.println(s1.replaceAll("[u]{2,3}", "X"));

        System.out.println("----------------------------------");
    }
}
