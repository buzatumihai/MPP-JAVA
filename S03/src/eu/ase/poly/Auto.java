package eu.ase.poly;

public class Auto extends Vehicle{
    private int doorsNo;

    public Auto(){

    }
    public Auto(int weight, int doorsNo) throws Exception{

        super(weight); //apeleaza constructorul cu param din Vehicle
        if(doorsNo < 0)
        {
            throw new Exception("The doorsNo must not be less than 0.");
        }
        this.doorsNo = doorsNo;
    }

    public int getDoorsNo()
    {
        return this.doorsNo;
    }
    public void setDoorsNo(int doorsNo) throws Exception
    {
        if(doorsNo < 0)
        {
            throw new Exception("The doorsNo must not be less than 0.");
        }
        this.doorsNo = doorsNo;
    }

    @Override
    public String display()
    {
        return new String("Auto = weight: " + this.getWeight() + ", doorsNo " +this.doorsNo);
    }
}
