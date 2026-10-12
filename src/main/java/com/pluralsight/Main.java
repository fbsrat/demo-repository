package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to programing!");
        System.out.println( "my name is fana");
        System.out.println(" i am 26 years old");
        movie myMovie= new movie();
        myMovie.title= "titanic";
        System.out.println(" my favorite movie is " + myMovie.title);


    }
}