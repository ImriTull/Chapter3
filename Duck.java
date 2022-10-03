package FarmAnimals;

public class Duck extends FarmAnimal {
    private boolean longBeak;
    private boolean quack;

    public Duck(String name, String gender, int weight, int age, boolean longBeak, boolean quack){
        // default constructor
        super(name, gender, weight, age);

        this.longBeak = longBeak;
        this.quack = quack;
    }

    // getters and setters for smallBeak and crowing ( that's not shown)

    @Override
    public String toString(){
        return super.toString() + " Duck[LongBeak=" + longBeak+ ", Quack=" + quack + "]";
    }
}
