public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.c = c;
        this.b = b;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (Math.pow(b,2)) - (4 * a * c);
    }

    private double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / 2 * a;
    }

    private double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / 2 * a;
    }
    public void Display(){
        if(getDiscriminant() < 0){
            System.out.println(" pt vo nghiem" );
        }else{
            if(getDiscriminant() == 0){
                System.out.println(" pt co 1 nghiem kep: " + getRoot1());
            }else{
                System.out.println(" pt co 2 nghiem phan biet: x1 " + getRoot1() );
                System.out.println(" x2 : " + getRoot2());
            }
        }
    }
}
