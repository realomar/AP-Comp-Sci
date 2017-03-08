// sub class
public class Cat extends Pet{
    
    //constructors
    public Cat(){
        super("tigger");
    }
    public Cat(String theName){
        super(theName);
    }
    
    //methods
    public String speak(){
        return "meow";
    }
}