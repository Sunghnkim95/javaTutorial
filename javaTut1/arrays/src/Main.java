//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //this is a string array initialization
        String[] myString = {"gay", "gai", "geh"};
        System.out.println(myString[0] + " " + myString[1] + " " + myString[2]);
    //this is a string array declaration
        String[] myStringTwo = new String[3];
        myStringTwo[0] = "whyAreYouGeh";
        System.out.println(myStringTwo[0]);

    //this is an integer initialization
        int[] myInt = {1, 2, 3};
        System.out.println(myInt[0] + "," + myInt[1] + "," + myInt[2]);
    //this is an integer declaration
        int[] myInt2 = new int[2];
        myInt2[1] = 3;
        System.out.println(myInt2[1]);

    //this is a double initialization
        double[] myDouble = {3.14, 6.28};
        System.out.println(myDouble[1]);
    //this is a double declaration
        double[] myDouble2 = new double[2];
        myDouble2[1] = 6.29;
        System.out.println(myDouble2[1]);

    //this is a byte initialization
        byte[] myByte = {1, 2, 3};
        System.out.println(myByte[2]);
    //this is a byte declaration
        byte[] myByte2 = new byte[9];
        myByte2[4] = 10;
        System.out.println(myByte2[4]);

    //this is a short initialization
        short[] myShort = {3200, 4200, 5200};
        System.out.println(myShort[0]);
    //this is a short declaration
        short[] myShort2 = new short[3];
        myShort2[0] = 3200;
        System.out.println(myShort2[0]);

    //this is a long initialization
        long[] myLong = {5000, 50000, 500000};
        System.out.println(myLong[2]);
    //this is a long declaration
        long[] myLong2 = new long[9];
        myLong2[7] = 234720;
        System.out.println(myLong2[7]);

    //this is a float initialization
        float[] myFloat = {3.2f, 6.3f,9.4f};
        System.out.println(myFloat[1]);
    //this is a float declaration
        float[] myFloat2 = new float[7];
        myFloat2[4] = 6.3f;
        System.out.println(myFloat2[4]);

    //this is a char initialization
        char[] myChar = {'e'};
        System.out.println(myChar);
    //this is a char declaration
        char[] myChar2 = new char[4];
        myChar2[0] = 'f';
        System.out.println(myChar2[0]);

    //this is a boolean initialization
        boolean[] myBoolean = {true, false, true};
        System.out.println(myBoolean[2]);
    //this is a boolean declaration
        boolean[] myBoolean2 = new boolean[4];
        myBoolean2[2] = true;
        System.out.println(myBoolean2[2]);

    }
}