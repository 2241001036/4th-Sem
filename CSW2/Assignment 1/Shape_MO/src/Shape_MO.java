public class Shape_MO
{
    abstract class Shape
    {
        private String color;
        Shape(String color)
        {
            this.color = color;
        }
        abstract double area();
        void setColor(String color)
        {
            this.color = color;
        }
        void display()
        {
            System.out.println("Color of the shape: " + color);
        }
        void display(boolean showArea)
        {
            if (showArea) {
                System.out.println("Area of the shape: " + area());
            } else {
                display();
            }
        }
    }
    class Circle extends Shape
    {
        private double radius;
        Circle(String color, double radius)
        {
            super(color);
            this.radius = radius;
        }
        @Override
        double area()
        {
            return Math.PI * radius * radius;
        }
        void display(boolean showArea)
        {
            if (showArea)
            {
                System.out.println("Area of the circle: " + area());
            }
            display();
        }
    }
    class Rectangle extends Shape
    {
        private double length;
        private double width;
        Rectangle(String color, double length, double width)
        {
            super(color);
            this.length = length;
            this.width = width;
        }
        @Override
        public double area()
        {
            return length * width;
        }
        double area(double newWidth)
        {
            return length * newWidth;
        }
        void display(boolean showArea, double newWidth)
        {
            if (showArea)
            {
                System.out.println("Area of the rectangle with new width: " + area(newWidth));
            } else {
                System.out.println("Area of the rectangle: " + area());
            }
            display();
        }
    }
    class Square extends Shape {
        private double side;
        Square(String color, double side) {
            super(color);
            this.side = side;
        }
        @Override
        public double area() {
            return side * side;
        }
        void display(boolean showArea) {
            if (showArea) {
                System.out.println("Area of the square: " + area());
            }
            display();
        }
    }
}