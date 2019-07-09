import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation ptb2 = new QuadraticEquation();
        double a, b, c, x1, x2;
        Scanner input = new Scanner(System.in);
        System.out.println("Input a, b, c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        ptb2.setA(a);
        ptb2.setB(b);
        ptb2.setC(c);
        ptb2.getA();
        ptb2.getB();
        ptb2.getC();

        x1 = ptb2.getRoot1();
        x2 = ptb2.getRoot2();
        if (ptb2.getDiscriminant() < 0) {
            System.out.println("Phuong trinh vo nghiem!");
        } else if (ptb2.getDiscriminant() == 0) {
            System.out.println("phuong trinh co nghiem kep x1 = " + x1);
        } else {
            System.out.println("phuong trinh co nghiem x1 = " + x1 + "\nphuong trinh co nghiem x2 = " + x2);
        }

    }
}
