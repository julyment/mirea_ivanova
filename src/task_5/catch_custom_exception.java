package task_5;

public class catch_custom_exception {
    public void getDetails(String key) {
        try {
            //Тут сгенерировали исключение...
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        }
       catch(NullPointerException e){
            //НО тут смогли перехватить, поэтому программа продолжает свою работу (тут в теле можно написать отчет по ошибке)
            System.out.println("Exception caught inside getDetails(): " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new catch_custom_exception().getDetails(null);
        System.out.println("Program continues...");
    }
}
