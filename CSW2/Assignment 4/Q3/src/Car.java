class Car implements Comparable<Car>
{
    private int modalNo;
    private String name;
    private int stock;
    public Car(int modalNo, String name, int stock)
    {
        this.modalNo = modalNo;
        this.name = name;
        this.stock = stock;
    }
    @Override
    public int compareTo(Car car)
    {
        return Integer.compare(this.stock, car.stock);
    }
    @Override
    public String toString()
    {
        return modalNo + " " + name + " " + stock;
    }
}
