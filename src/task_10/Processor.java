package task_10;

public class Processor {
    String brand;
    double frequency;
    int cores;

    public Processor() {}

    public Processor(String brand, double frequency, int cores){
        this.brand = brand;
        this.cores = cores;
        this.frequency = frequency;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", frequency=" + frequency +
                ", cores=" + cores +
                '}';
    }
}
