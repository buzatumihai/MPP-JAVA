package eu.ase.oop;

public class Certificate {
    private int id;
    private  String name;

    public Certificate(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Certificate myClone(){
        Certificate newcert = new Certificate(this.id, this.name);
        return newcert;
    }
    @Override
    public boolean equals(Object obj)
    {
        Certificate c = (Certificate) obj;
        if(this.id == c.id && this.name.equals(c.name)){
            return true;
        }
        return false;
    }
}
