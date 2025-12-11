package task_3;

import task_2.taska2_new;

import java.util.Scanner;

public class taska_3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");

        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);

        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid integer");

        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");

        } catch (Exception e){
        System.out.println("General exception caught");

        }
    }

    public static void main(String[] args) {
        new taska2_new().exceptionDemo();
    }
}

/* КОММЕНТАРИИ ПО КОДУ:
При добавлении catch(Exception e) первым в списке отлова ошибок программа перестаёт компилироваться.
Это происходит потому, что Exception является родительским классом для NumberFormatException и ArithmeticException.
Следовательно, первый catch перехватывает любые исключения, делая последующие catch для NumberFormatException и ArithmeticException недостижимыми.
Java запрещает недостижимый код, поэтому возникает ошибка компиляции.
*/