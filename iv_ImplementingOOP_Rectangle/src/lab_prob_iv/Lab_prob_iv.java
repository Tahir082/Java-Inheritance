
package lab_prob_iv;

class Rectangle{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle() {
    }
    
    public double Area(){
        double area= this.length*this.breadth;
        return area;
    }
    
    public double Perimeter(){
        double perimeter= 2*(this.length+this.breadth);
        return perimeter;
    }
    
}

class Square extends Rectangle{
    Square(double s){
        super(s,s);
    }
}


public class Lab_prob_iv {

    
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle(6.5,4.5);
        System.out.println("Rectangle Initiated (length= 6.5 Units, breadth=4.5 Units)");
        System.out.println("Area: "+ rectangle.Area()+" Square Units");
        System.out.println("Perimeter: "+rectangle.Perimeter()+" Units");
        System.out.println("");
        System.out.println("");
        Square square= new Square(5);
        System.out.println("Square Initiated (One side= 5 Units)");
        System.out.println("Area: "+square.Area()+" Square Units");
        System.out.println("Perimeter: "+square.Perimeter()+" Units");
        
    }
    
}
