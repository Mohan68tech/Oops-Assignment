import java.util.*;
class rectangleData{
    private int length;
    private int breadth;

    public rectangleData(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double CalculateareaRectangle(){
         return length * breadth;
    }
    int perimeterOfRectangle(){
        return 2 *(length + breadth);
    }
    void display(){
        System.out.println("length is: "+length);
        System.out.println("breadth is: "+breadth);
        System.out.println("area of rectangle is :" +CalculateareaRectangle());
        System.out.println("perimeter of rectangle is :" +perimeterOfRectangle());
    }
}
public class Rectangle {
    public static void main(String[] args){
        rectangleData Data = new rectangleData(5, 40);
        Data.display();
    }
}
