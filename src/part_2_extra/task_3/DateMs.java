package part_2_extra.task_3;

import java.util.Date;

public class DateMs {
    public static void main(String[] args) {
        long[] times = {
                10_000L,
                100_000L,
                1_000_000L,
                10_000_000L,
                100_000_000L,
                1_000_000_000L,
                10_000_000_000L,
                100_000_000_000L
        };

        for (long t : times) {
            Date date = new Date();
            date.setTime(t);
            System.out.println("Прошло " + t + " мс → " + date.toString());
        }
    }
}
