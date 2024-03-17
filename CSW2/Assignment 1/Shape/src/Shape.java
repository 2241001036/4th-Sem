abstract class Shape
{
        private String color;
        public Shape(String color) {
            this.color = color;
        }
        public abstract double area();
        public void setColor(String color) {
            this.color = color;
        }
        public abstract void display();
    }

