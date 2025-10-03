public class Task3 {
    public void command_line(String[] arg){
       if (arg.length == 0){
           System.out.println("Нет заданных аругментов");
       }
       else{
           System.out.println("Кол-во заданных аругментов: " + arg.length);
           for (int i = 0; i < arg.length; i++){
               System.out.println("Аргумент " + (i + 1) + ": " + arg[i]);
           }
       }
    }
}
