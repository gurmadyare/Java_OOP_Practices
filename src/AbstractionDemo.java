//Abstraction -> Hiding something (we only show the relevant parts & we hide all the internal), cannot be instantiated.

public class AbstractionDemo {
    public static void main(String[] args) {
        GraphicObject circle = new Circle();
        circle.draw();
        circle.resize();
        circle.moveTo(2,4);
    }
}

abstract class GraphicObject{
    int x, y ;

    //Abstract class should have at least one abstract method
    //To use it / to give implementation you have to extend this extend class
    abstract void draw();
    abstract  void resize();

    //You can also have concrete methods (normal)
    void moveTo(int newX, int newY){
        System.out.println("Move to x: " + x + " and y: " + y);
    }
}


//Child classes
class Circle extends GraphicObject{
    //You must implement the parents abstract methods
    void draw(){
        System.out.println("Drawing a circle");
    }

    void resize(){
        System.out.println("Resizing a circle");
    }
}

