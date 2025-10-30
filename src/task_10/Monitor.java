package task_10;

public class Monitor {
    double diagonal;
    String monitorbrand;
    String resolution;
    int refreshRate;

    public Monitor() {}

    public Monitor(double diagonal, String brand, String resolution, int refreshRate){
        this.diagonal = diagonal;
        this.monitorbrand = brand;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getBrand() {
        return monitorbrand;
    }

    public void setBrand(String brand) {
        this.monitorbrand = brand;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }
}
