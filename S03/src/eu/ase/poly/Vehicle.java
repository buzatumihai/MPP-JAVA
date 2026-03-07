package eu.ase.poly;

public class Vehicle implements Movement, Cloneable{
    private int weight;

    public Vehicle()
    {

    }
    public Vehicle(int weight)
    {
        this.weight = weight;
    }

    public String display()
    {
        return new String("Vehicle weight: " + this.weight);
    }
    @Override
    public void startEngine() {
        System.out.println("Vehicle::startEngine() ");
    }
    @Override
    public void stopEngine() {
        System.out.println("Vehicle::stopEngine() ");
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return (Vehicle)super.clone();
    }
    public int getWeight()
    {
        return this.weight;
    }
}
