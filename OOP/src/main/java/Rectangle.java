

public class Rectangle {
    public double width, height;

    public Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return this.height*this.width;
    }
    public double Perimeter(){
        return (this.height+this.width)*2;
    }

    public String display(){
        return "Rectangle{ " + "width" + this.width + " height " + this.height + "}";
    }
}
