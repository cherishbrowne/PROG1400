package Polymorphism.Shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Square s1 = new Square(5);
        Triangle t1 = new Triangle();
        Diamond d1 = new Diamond();

        Shape[] shapes = {s1, t1, d1};

//        for (int i = 0; i < shapes.length; i++) {
//            shapes[i].draw();
//        }

//        for (Shape shape: shapes) {
//            shape.draw();
//        }

        for (int i = 0; i < 7; i++) {
            for (Shape shape: shapes) {
                shape.drawLine(i);
            }
            System.out.println();
        }
        System.out.println();
    }

}