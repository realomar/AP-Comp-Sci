// 1
import java.util.ArrayList;

public class TestFish {
    public static void main(String[] args){
        // 2
        ArrayList<Fish> school = new ArrayList<Fish>();
        
        // 3
        for (int i = 0; i < 20; i++)
            school.add(new Fish());
            
        // 4
        for (Fish f : school) {
            f.setColor("blue");
            f.swim();
        }
        
        
    }
}