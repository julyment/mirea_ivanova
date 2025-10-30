package task_10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "\n" + brand +
                "\nПроцессор: " + processor +
                "\nПамять: " + memory +
                "\nМонитор: " + monitor;
    }

}
