public class Toy {
    
    private int id;
    private int howMuch;
    private String name;

    

    public int getId() {
        return id;
    }



    public int getHowMuch() {
        return howMuch;
    }



    public String getName() {
        return name;
    }



    public Toy(int id, int howMuch, String name) {
        this.id = id;
        this.howMuch = howMuch;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id: " + id + ", игрушка: " + name + ", вес: " + howMuch;
    }
}
