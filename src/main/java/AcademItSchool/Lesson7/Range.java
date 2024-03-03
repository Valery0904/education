package AcademItSchool.Lesson7;

public class Range {
    private static final double EPSILON = 1.0e-10;
    double from;
    double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double setFrom(double from) {
        from = from;
        return from;
    }

    public double getTo() {
        return to;
    }

    public double setTo(double to) {
        to = to;
        return to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double number) {
        return number - from > -EPSILON && number - to < EPSILON;
    }
}
