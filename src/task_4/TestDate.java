package task_4;

public class TestDate {
    public static void main(String[] args) {
        //создается массив из 10 значений null (ссылки на ячейки памяти есть, содержимое отсутствует):
        java.util.Date[] dates = new java.util.Date[10];
        //смотрим, куда ведет ссылка 1-го элемента массива:
        System.out.println(dates[0]);
        //так как в самой ячейке нет содержимого, то и посмотреть поля мы не можем
        System.out.println(dates[0].toString());
    }
}
