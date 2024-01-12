//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 30){
            System.out.println("i = " + i);
            i++;
        }
        boolean stop = false;
        while (!stop){
            System.out.println(stop);
            stop = true;
        }
        System.out.println(stop);
        //do while loop, loop will execute at least once before checking the condition to repeat
        i = 0;
        do{
            System.out.println("say something");
            i++;
        }while( i > 3 );
    }
}