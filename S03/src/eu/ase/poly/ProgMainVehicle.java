package eu.ase.poly;

public class ProgMainVehicle
{
    public static void main(String[]args)
    {
        Auto a = null;
        try
        {
        a = new Auto(1200,5);
        System.out.println(a.display());
        }catch (Exception e)
        {
            throw new RuntimeException(e);
        }
        Vehicle v = null;
        Plane p = new Plane(15000,12,2);
        p.startEngine();
        v = a; //auto este si un vehicle = upcasting (este implicit)
        System.out.println(v.display()); //dynamic binding
        v = p;
        System.out.println(v.display());

        Vehicle v0 = null;
        p = (Plane) v0; //downcast = nu orice vehicle este un Plane
        //p = a; NU SE POATEE !!!

        Movement m = null;
        try{
        m = new Auto(1900,4);

        }catch (Exception e){
            throw new RuntimeException(e);
        }
        m.startEngine();
        m.stopEngine();
    }
}
