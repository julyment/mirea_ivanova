package part_1.task_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CompareDates {
    public static void main(String[] args){
        Date current = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите желаемую дату в формате yyyy-MM-dd HH:mm:ss (например: 25.12.2024 15:30)");

        while(true) {
            System.out.print("> ");
            String input = sc.nextLine();

            try{
                Date userDate = format.parse(input);
                if (userDate.after(current)){
                    System.out.println("Пользовательская дата ПОЗЖЕ текущей");
                }
                else if (userDate.before(current)){
                    System.out.println("Пользовательская дата РАНЬШЕ текущей");
                }
                else{
                    System.out.println("Текущая и пользовательская даты СОВПАДАЮТ");
                }
                break;
            }
            catch (Exception e){
                System.out.println("Некорректный ввод! Попробуйте еще раз:");
            }

        }

        sc.close();
    }
}
