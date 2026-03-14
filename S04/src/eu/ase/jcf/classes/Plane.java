package eu.ase.jcf.classes;

public class Plane implements Comparable<Plane> {
    private int idPlane;
    private String type;
    private float capacity;

    public Plane()
    {
        idPlane = 0;
        type = "Anonim";
        capacity = 0;
    }

    public Plane(int id, String type, float capacity)
    {
        idPlane = id;
        this.type = type;
        this.capacity = capacity;
    }
    public void print()
    {
        System.out.println("Plane id: " + idPlane + " type: " + type + " capacity: " + capacity);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Plane)){
            return false;
        }
        Plane p = (Plane) o;
        //if(p.idPlane == this.idPlane)
        return (this.idPlane == p.idPlane) && (this.type.equals(p.type)) && (this.capacity == p.capacity);
    }

    @Override
    public int hashCode() {
        return 31*31*this.idPlane + this.type.hashCode()+ (int)this.capacity;
    }

    @Override
    public int compareTo(Plane p)
    {
        if(this.idPlane == p.idPlane){
            return 0;
        }
        else if(this.idPlane < p.idPlane){
            return 1;
        }
        else{
            return -1;
        }
    }
}
