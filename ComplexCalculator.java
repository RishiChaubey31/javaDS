import java.util.Scanner;

class ComplexNumber {
    double real;
    double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    ComplexNumber multiply(ComplexNumber other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }
}

public class ComplexCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real and imaginary parts of the first complex number:");
        double real1 = scanner.nextDouble();
        double imaginary1 = scanner.nextDouble();

        System.out.println("Enter the real and imaginary parts of the second complex number:");
        double real2 = scanner.nextDouble();
        double imaginary2 = scanner.nextDouble();

        ComplexNumber complex1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber complex2 = new ComplexNumber(real2, imaginary2);

        ComplexNumber sum = complex1.add(complex2);
        ComplexNumber product = complex1.multiply(complex2);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        scanner.close();
    }

}
