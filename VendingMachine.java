import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    List<Toy> vending = new ArrayList<>();

    public void addToy(Toy toy){
        vending.add(toy);
    }

    public List<Toy> getToy(){
        return vending;
    }

    public int getSize(){
        return vending.size();
    }
}