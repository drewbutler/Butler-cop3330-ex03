/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the quote?");
        String inputQuote = myObj.nextLine();

        System.out.println("Who said it?");
        String inputPerson = myObj.nextLine();
        System.out.println(inputPerson + " says, " +"\"" + inputQuote + "." + "\"");

        myObj.close();
    }
}