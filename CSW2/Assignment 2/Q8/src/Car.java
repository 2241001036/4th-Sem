class Car implements Vehicle
{
    @Override
    public void accelerate()
    {
        System.out.println("Car is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("Car is braking");
    }
    public void accelerate(int speed)
    {
        System.out.println("Car accelerating at speed: " + speed);
    }
    public void accelerate(int speed, int duration)
    {
        System.out.println("Car accelerating at speed: " + speed + " for duration: " + duration + " seconds");
    }
}
