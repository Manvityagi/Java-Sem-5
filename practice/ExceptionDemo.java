/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "My Exception [" + detail + "]";
    }
}

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    static void compute(int a) throws MyException {
        System.out.println("Called Compute " + a);

        if (a > 10) {
            System.out.println("Normal Exit");
            throw new MyException(a);
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Caught" + e);
        } finally {
            System.out.println("Run finally always");
        }
    }
}
