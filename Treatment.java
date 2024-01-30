
public class Treatment{
    //Private variables
    private String name;
    private float amount;

    //Constructors
    public Treatment(String name, float amount){
        this.name = name;
        this.amount = amount;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public float getAmount(){
        return this.amount;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAmount(float amount){
        this.amount = amount;
    }

}