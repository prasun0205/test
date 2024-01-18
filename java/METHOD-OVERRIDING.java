class Shape {
    void calculateArea(int r) {
        System.out.println("Area of the shape is " + (3.14 * r * r));
    }
}

class Circle extends Shape {
    @Override
    void calculateArea(int r) {
        System.out.println("Area of the circle is " + (3.14 * r * r));
    }
}
class OverrideExample {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();

        shape.calculateArea(4);
        circle.calculateArea(3); 
    }
}
