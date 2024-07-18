//4.	Write a function that takes in the radius as input and 
//returns the circumference of a circle.

import java.util.*;
public class fun4 {
    public static void calculation(int radius){
        double circumference = 2*3.14*radius;

        System.out.println("circumference is:" + circumference);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter radius");
        int radius = sc.nextInt();


        //function call
        calculation(radius);
    }
    
}
