public class Zoo{
    //fields
    private Pet[] theZoo;
    
    //constructors
    public Zoo(){
        theZoo = new Pet[10];
        for (int i = 0; i <= 4; i++){
            theZoo[i] = new Pet();
        }
        for (int i = 5; i <= 9; i++){
            theZoo[i] = new Cat();
        }
    }
    
    public Zoo(int length){
        theZoo = new Pet[length];
        for (int i = 0; i < length; i++)
    }
    
    //methods
    public void soundOff(){
        for (int i = 0; i <= theZoo.length; i++){
           System.out.println(theZoo[i].speak());
        }
    }
}