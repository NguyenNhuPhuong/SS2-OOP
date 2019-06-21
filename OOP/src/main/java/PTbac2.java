import java.sql.SQLOutput;
import java.util.Scanner;

public class PTbac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ax2 + bx + c = 0");
        System.out.println("enter nhap a,b,c ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        QuadraticEquation pt = new QuadraticEquation(a,b,c);
        pt.Display();

    }
}
