package com.oca8.unidad1;

import java.util.Random;
import java.util.*;//redundant import
import java.lang.System; //redundant import
import java.lang.*; //redundant import

/**
 * Created by ÊAnita on 10/2/2017.
 */
public class RedundantImports {

    Random r = new Random();

    System.out.println(" Random int " + r.nextInt(10));// print a number between 0 and 9
    System.out.println(" Random boolean " + r.nextBoolean());
    System.out.println(" Random double " + r.nextDouble());
    System.out.println(" Random long " + r.nextLong());
}
