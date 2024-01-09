import java.io.*;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //this is a string
        String myString = new String("this is my string");
        System.out.println(myString);

        //this is an integer, size 32, range -2,147,483,648.. 2,147,483,647
        int myInt = 3;
        System.out.println(myInt);

        //this is a double, size 64, range 1.7e-308.. 1.7e+308
        double myDouble = 3.2123123;
        System.out.println(myDouble);

        //this is a byte, size 8bits, range -128..127
        byte myByte = 127;
        System.out.println(myByte);

        //this is a short, 2 bytes, size 16, range -32,768..32,767
        short myShort = 32000;
        System.out.println(myShort);

        //this is a long, size 32, range 2,147,483,648.. 2,147,483,647
        long myLong = 234720;
        System.out.println(myLong);

        //this is a float, size 32, range 2,147,483,648.. 2,147,483,647
        //needs an f at the end
        float myFloat = 2.12345f;
        System.out.println(myFloat);

        //this is a char, size 16, only one letter
        char myChar = 'w';
        System.out.println(myChar);

        //this is a boolean, size 1
        boolean myBoolean = true;
        System.out.println(myBoolean);

    }
}