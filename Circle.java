public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(double radius){
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }
    public double getPerimeter(){
        double result = 2 * Math.PI * radius;
        return result;
    }



    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
