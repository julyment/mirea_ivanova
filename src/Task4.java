public class Task4 {
    public void harmonic_series() {
        int numb = 1;
        while (numb <= 10) {
            float a1 = 1f / numb;
            System.out.println(numb + "-е число гармонического ряда: " + String.format("%.2f", a1));
            numb += 1;
        }
    }
}
