public class Square extends Rectangle{
    private double side;

    //    private double side;
    public Square(){

    }
    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled){


    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea(double hieght, double width) {

        return super.getArea(hieght, width);
    }

    @Override
    public double getPerimeter(double length, double width) {
        return super.getPerimeter(length, width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
