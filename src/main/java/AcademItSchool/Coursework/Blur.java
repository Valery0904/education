package AcademItSchool.Coursework;

public class Blur {
    public static int sat(double x) {
        if (x < 0) {
            return 0;
        }

        if (x > 0) {
            return 255;
        }

        return (int) x;
    }

    /*public static void main(String[] args) {
        double[][] convolutionCore = new double[5][5];
        int convolutionCoreSize = convolutionCore.length();
    }*/
}
