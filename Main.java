import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.setColor("Blue");
        shape.setFilled(true);
        System.out.println("========= Shape ========");
        System.out.println("the color is: "+ shape.getColor());
        System.out.println("\n========= Circle ========");
        Circle circle = new Circle();
        circle.setColor("Yello");
        circle.setRadius(0.5);
        circle.setFilled(true);
        circle.setRadius(1.0);
        System.out.println("color: "+circle.getColor()+"\nRadius: "+circle.getRadius()+"\nArea: "+circle.getArea(10)+"\nFilled? "+circle.isFilled(true));

        System.out.println("\n========= Rectangle ========");
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Red");
        rectangle.setLength(15);
        rectangle.setWidth(10);
        rectangle.setFilled(true);
        System.out.println("color: "+rectangle.getColor()+"\nlength: "+rectangle.getLength()+"\nwidth: "+ rectangle.getWidth()+"\nArea: "+rectangle.getArea(15,10));

        System.out.println("\n========= Square ========");
        Square square = new Square();
        square.setColor("Orange");
        square.setFilled(true);
        square.setSide(10);
        square.setLength(5);
        square.setWidth(5);
        System.out.println("color: "+square.getColor()+"\nside: "+ square.getSide()+"\nlength: "+ square.getLength()+"\nwidth: "+ square.getWidth());

    }
}
