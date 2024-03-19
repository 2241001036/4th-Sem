class Bicycle implements Vehicle
{
    @Override
    public void accelerate()
    {
        System.out.println("Bicycle is going faster");
    }
    @Override
    public void brake()
    {
        System.out.println("Bicycle is applying brakes");
    }
    public void accelerate(int speed)
    {
        System.out.println("Bicycle is going fast at speed: " + speed);
    }
    public void accelerate(int speed, int duration)
    {
        System.out.println("Bicycle is going fast at speed: " + speed + " for duration: " + duration + " seconds");
    }
}