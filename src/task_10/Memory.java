package task_10;

public class Memory {
    int size;
    String type;
    String manufacturer;

    public Memory() {}

    public Memory(int size, String type, String manufacturer){
        this.size = size;
        this.type = type;
        this.manufacturer = manufacturer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "size=" + size +
                ", type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
