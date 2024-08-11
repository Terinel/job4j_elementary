package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int x = x2 - x1;
        int y = y2 - y1;
        double first = Math.pow(x, 2);
        double second = Math.pow(y, 2);
        double third = first + second;
        double result = Math.sqrt(third);
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(1, 0, 0, 0);
        System.out.println("result (1, 5) to (4, 6) " + result2);
        double result3 = Point.distance(4, 4, 7, 8);
        System.out.println("result (4, 1) to (3, 4) " + result3);
    }
}