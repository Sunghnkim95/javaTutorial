//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.*;

public class Main {
    public static void main(String[] args) {
    //this for loop prints 1 - 5, so long as the number is less than or equal to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    //string array (technically a For Each Loop)
        String[] strArray = {"geh", "gay", "supageh"};
        for (String typeOfGeh : strArray){
            System.out.println(typeOfGeh);
        }
        //example of nested loop(this prints from 0 - 59)
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(i); //prints the first digit (not new line)
                System.out.println(j); //prints second digit with new line
            }
        }
    }
}