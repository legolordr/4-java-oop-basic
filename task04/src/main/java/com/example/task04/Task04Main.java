package com.example.task04;

public class Task04Main {

    public static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }

        public Point flip() {
            return new Point(-x, -y);
        }

        public double distance(Point point) {
            return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }

    public static class Line {

        private final Point p1;
        private final Point p2;

        public Line(Point p1, Point p2) {
            this.p1 = p1;
            this.p2 = p2;
        }

        public Point getP1() {
            return p1;
        }

        public Point getP2() {
            return p2;
        }

        public boolean isCollinearLine(Point p) {
            //проверка на одну линию
            int cross = (p2.getX() - p1.getX()) * (p.getY() - p1.getY())
                    - (p2.getY() - p1.getY()) * (p.getX() - p1.getX());

            if (cross != 0) {
                return false;
            }
            // проверка на содержание в текущем отрезке
            boolean withinX = p.getX() >= Math.min(p1.getX(), p2.getX())
                    && p.getX() <= Math.max(p1.getX(), p2.getX());
            boolean withinY = p.getY() >= Math.min(p1.getY(), p2.getY())
                    && p.getY() <= Math.max(p1.getY(), p2.getY());

            return withinX && withinY;
        }

        @Override
        public String toString() {
            return p1 + "-" + p2;
        }
    }

    public static void main(String[] args) {

    }
}
