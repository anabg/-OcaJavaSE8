package com.oca8.unidad1;

/**
 * Created by ÊAnita on 10/2/2017.
 */
public class WrittingAMainMethod {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("The argument list is empty");
        } else {
            for (String arg : args) {

                System.out.println(arg);
            }

        }

        System.out.println("Hello");
    }
}
