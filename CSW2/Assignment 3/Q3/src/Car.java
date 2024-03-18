class Car implements Comparable<Car> {
    private String model;
    private String color;
    private int speed;
    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public int getSpeed()
    {
        return speed;
    }
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    @Override
    public int compareTo(Car otherCar)
    {
        return Integer.compare(this.speed, otherCar.speed);
    }
    public void printDetails()
    {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }
}
