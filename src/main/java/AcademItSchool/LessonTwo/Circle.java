package AcademItSchool.LessonTwo;

public class Circle {
    public static void main(String[] args) {
        double radius = 11;
        double circleArea = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.println("Площадь круга = " + circleArea);
        System.out.println("Длина окружности = " + circumference);

        double circleRadius = Math.sqrt(circleArea / Math.PI);

        System.out.println("Радиус круга = " + circleRadius);

        int angleDegrees = 180;
        double sectorArea = Math.PI * Math.pow(circleRadius, 2) * angleDegrees / 360;

        System.out.println("Площадь сектора круга = " + sectorArea);
    }
}