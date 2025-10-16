public class ExampleObject implements Nameable{
    String nameObj;
    int length;
    int width;
    public ExampleObject() {
        this.nameObj = "Car";
        this.length = 275;
        this.width = 150;

    }

    public ExampleObject(String nameObj, int length, int width) {
        this.nameObj = nameObj;
        this.length = length;
        this.width = width;
    }

    public String getName() {
        return nameObj;
    }

    public void setNameObj(String nameObj) {
        this.nameObj = nameObj;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Машина, " +
                "название марки " + nameObj  +
                ", длина " + length +
                ", ширина " + width;
    }

    public static void main(String[] args) {
        ExampleObject car1 = new ExampleObject();
        ExampleObject car2 = new ExampleObject("Бэха", 350, 250);

        car1.setNameObj("Мерин");
        car1.setLength(123);
        car1.setWidth(123);

        System.out.println(car1);
        System.out.println(car2);


    }


}
