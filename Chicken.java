package FarmAnimals;

public class Chicken extends FarmAnimal {

    private boolean smallBeak;
    private boolean crowing;

    public Chicken(String name, String gender, int weight, int age, boolean smallBeak, boolean crowing){

        super(name, gender, weight, age);
        this.smallBeak = smallBeak;
        this.crowing = crowing;
    }

    // getters and setters for smallBeak and crowing ( that's not shown)

    @Override
    public String toString(){
        return super.toString() + " Chicken[smallBeak=" + smallBeak + ", crowing=" + crowing + "]";
    }
}
