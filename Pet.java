// super class
public class Pet
{
    //fields
    private String name;

    //constructors
    public Pet()
    {
        name = "default pet";
    }

    
    public Pet(String n)
    {
        name = n;
    }
    //methods
    
    public String speak()
    {
        return "default pet sound";
    }
}
