package task_7;

import java.util.Scanner;

public class taska_7 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter key: ");
        String key = myScanner.next();

        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Exception caught in getKey(): " + e.getMessage());
        }
    }

    // Метод явно объявляет, что может бросать Exception
    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        new taska_7().getKey();
    }
}
