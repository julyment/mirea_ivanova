import java.util.Scanner;

public class task_16 {

    static Scanner in = new Scanner(System.in);

    // Класс для возврата двух значений: max и cnt
    static class Pair {
        int max;
        int cnt;
        Pair(int max, int cnt) {
            this.max = max;
            this.cnt = cnt;
        }
    }

    static Pair f() {
        int x = in.nextInt();

        if (x == 0) {
            return new Pair(0, 0); // конец последовательности
        }

        Pair p = f(); // получаем результат для хвоста последовательности

        if (x > p.max) {
            return new Pair(x, 1);     // новый максимум
        } else if (x == p.max) {
            return new Pair(p.max, p.cnt + 1); // ещё одно значение максимума
        } else {
            return new Pair(p.max, p.cnt);     // максимум остаётся прежним
        }
    }

    public static void main(String[] args) {
        System.out.println("Вводите члены последовательности по одному через enter: ");
        Pair res = f();
        System.out.println(res.max + " - максимум");
        System.out.println(res.cnt + " - число таких элементов");
    }
}
