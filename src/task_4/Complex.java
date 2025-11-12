package task_4;


public class Complex {
    private double real;
    private double imag;

    public Complex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public Complex pow(double n){
        double r = Math.sqrt(real*real + imag*imag);
        double o = Math.atan2(real, imag);

        double realPart = Math.pow(r,n) * Math.cos(n * o);
        double imagPart =  Math.pow(r,n) * Math.sin(n * o);

        this.setReal(realPart);
        this.setImag(imagPart);
        return this;
    }

    public double abs(){
        return Math.sqrt(real*real + imag*imag);
    }

    @Override
    public String toString() {
        if (imag < 0){
            return real + " " + imag + "i";
        }

        else{
            return real +  " + " + imag + "i";
        }
    }

}
