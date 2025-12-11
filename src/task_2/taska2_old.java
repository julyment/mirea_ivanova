package task_2;

import java.util.Scanner;

public class taska2_old {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2/i );
    }

    public static void main(String[] args) {
        new taska2_old().exceptionDemo();
    }

}
