package com.francis;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    printOut("Enter the string to check\n");
	    printOut(String.valueOf(uniquechars(scanner.next())));
    }

    static boolean uniquechars(String string){

        for(int i = 0; i < string.length(); i++)
            for(int j = 0; j < string.length(); j++)
                if(string.charAt(i) == string.charAt(j))
                    if(i != j)
                        return false;






        return true;
    }

    static void printOut(String string){
        System.out.print(string);
    }
}
