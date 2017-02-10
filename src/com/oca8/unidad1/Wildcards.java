//The first line in a class must be a package if the class is in a package.
package com.oca8.unidad1;

//If exist some classes used in the class that are in differents package, the imports must be after package declaration and before class declaration
import java.util.*; //import java.util.Random among other things

/**
 * Created by ÊAnita on 10/2/2017.
 */
public class Wildcards {

    public static void main(String[] args) {

        Random r = new Random();

        System.out.println(" Random int " + r.nextInt(10));// print a number between 0 and 9
        System.out.println(" Random boolean " + r.nextBoolean());
        System.out.println(" Random double " + r.nextDouble());
        System.out.println(" Random long " + r.nextLong());

    }


}
