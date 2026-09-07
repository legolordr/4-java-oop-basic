package com.example.task03;

public class Task03Main {
    public static class ComplexNumber {
        private final double real;
        private final double imaginary;

        public ComplexNumber(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public ComplexNumber add(ComplexNumber other) {
            double newReal = this.real + other.real;
            double newImaginary = this.imaginary + other.imaginary;
            return new ComplexNumber(newReal, newImaginary);
        }

        public ComplexNumber multiply(ComplexNumber other) {
            double newReal = this.real * other.real - this.imaginary * other.imaginary;
            double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
            return new ComplexNumber(newReal, newImaginary);
        }
        @Override
        public String toString() {
            if (imaginary >= 0) {
                return real + " + " + imaginary + "i";
            } else {
                return real + " - " + Math.abs(imaginary) + "i";
            }
        }
    }
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(3, 5);
        ComplexNumber b = new ComplexNumber(2, -4);

        ComplexNumber sum = a.add(b);
        ComplexNumber product = a.multiply(b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
    }
}
