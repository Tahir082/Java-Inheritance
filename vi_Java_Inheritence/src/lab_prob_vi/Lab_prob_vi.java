
package lab_prob_vi;

class Shape{
    public void print(){
        System.out.println("This is a Shape");
    }
}

class Rectangle extends Shape{
    @Override
    public void print(){
        System.out.println("This is Rectangular Shape");
        super.print();
    }
}

class Circle extends Shape{
    public void print(){
        System.out.println("This is Circle Shape");
        super.print();
    }
}

class Square extends Rectangle{
    public void print(){
        System.out.println("Square is a Rectangle");
        super.print();
    }
}

public class Lab_prob_vi {

   
    public static void main(String[] args) {
        Square sq= new Square();
        sq.print(); 
    }
    
}
