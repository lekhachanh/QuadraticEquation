import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public QuadraticEquation () {

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(this.b, 2) - 4 * this.c * this.a;
        return delta;
    }

    public double getRoot1() {
        if (this.getDiscriminant() < 0) {
            return -1;
        } else {
            double r1 = -this.b + Math.sqrt(getDiscriminant()) / (2 * this.a);
            return r1;
        }
    }

    public double getRoot2() {
        if (this.getDiscriminant() < 0) {
            return -1;
        } else {
            double r2 = -this.b - Math.sqrt(getDiscriminant()) / (2 * this.a);
            return r2;
        }
    }

}
