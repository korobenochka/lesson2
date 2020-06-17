package org.example;

/**
 * Hello world!
 *
 */
public class IsNumberEven {

    public static Boolean a;

    public static void main(String[] args) {
        if(checkTheNumber(a) == true){

        System.out.println("number is even");
        }
        else {
            System.out.println("number is not even");
        }
    }

    public static Boolean checkTheNumber(Boolean a) {
        int b = 10;
        if (b % 2 == 0) {
            IsNumberEven.a = true;
        }
        else {
            IsNumberEven.a = false;
        }
        return IsNumberEven.a;
    }
}

