import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter width");
        double width = sc.nextDouble();
        System.out.println("Enter height");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Retangle \n " + rectangle.display());
        System.out.println("Area \n " + rectangle.getArea());
        System.out.println("Perimeter \n " + rectangle.Perimeter());
    }
}
