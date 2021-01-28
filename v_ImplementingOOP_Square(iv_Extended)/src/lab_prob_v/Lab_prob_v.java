/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_prob_v;

import java.util.Scanner;

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
public class Lab_prob_v {

    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle(6.5,4.5);
        System.out.println("Rectangle Initiated (length= 6.5 Units, breadth=4.5 Units)");
        System.out.println("Area: "+ rectangle.Area()+" Square Units");
        System.out.println("Perimeter: "+rectangle.Perimeter()+" Units");
        System.out.println("");
        System.out.println("");
        System.out.println("How many square you want to input? ");
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        Square[] square= new Square[n];
        for(int i=0; i<n; i++){
            System.out.println("Type size of one side of square "+ (i+1));
            int side= in.nextInt();
            square[i]=new Square(side);
        }
        
        for(int i=0; i<n; i++){
            System.out.println("For Square "+ (i+1));
            System.out.println("Area: "+ square[i].Area()+" Square Units");
            System.out.println("Perimeter: "+square[i].Perimeter()+" Units");
            System.out.println("");
            System.out.println("");
        }
        
    }
    
}
