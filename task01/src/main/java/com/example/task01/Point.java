package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * "Вращает" точку относительно начала координат на 180 градусов
     */
    public void flip() {
        int originalX = this.x;
        this.x = y * -1;
        this.y = originalX * -1;
    }

    /**
     * Считает расстояние от текущей точки до переданной
     *
     * @param point вторая точка
     * @return расстояние между точками
     */
    public double distance(Point point) {
        return Math.sqrt(Math.pow(this.x - point.x,2) + Math.pow(this.y - point.y,2));
    }

    @Override
    public String toString() {
        String x = Integer.toString(this.x);
        String y = Integer.toString(this.y);
        return "(" + x + "," + y + ")";
    }
}
