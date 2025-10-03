import java.util.Scanner;

public class Task5 {
    public static String factorial_n() {
        Scanner sc = new Scanner(System.in);
        String result = "";

        while (true) {
            System.out.print("Введите число: ");
            String numb = sc.nextLine();

            try {
                int number = Integer.parseInt(numb);

                if (number < 0) {
                    System.out.println("Факториал отрицательного числа не определён, попробуйте снова.");
                }
                else if (number == 0){
                    result = "Факториал введенного числа 1";
                    break;
                }
                else {
                    long multiply = 1;
                    for (int i = 1; i <= number; i++) {
                        multiply *= i;
                    }
                    result = "Факториал введённого числа: " + multiply;
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число!");
            }
        }
        return result;
    }
}