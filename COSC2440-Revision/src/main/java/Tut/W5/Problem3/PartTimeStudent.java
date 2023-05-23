package Tut.W5.Problem3;

public class PartTimeStudent extends Student {
    private int minHour;
    private int maxHour;
    private static int counter = 0;

    public PartTimeStudent(String studentId, String name, String major, double gpa, int minHour, int maxHour) {
        super(studentId, name, major, gpa);
        this.minHour = minHour;
        this.maxHour = maxHour;
        counter++;
    }

    @Override
    public String toString() {
        return String.format("Part-time Student: %s, Minimum Hours: %d, Maximum Hours: %d", super.toString(), minHour, maxHour);
    }

    public static int count() {
        return counter;
    }
}
