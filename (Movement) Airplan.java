package Flying;

public class Airplane implements Flight, Movement {

    private String model;
    private int yearBuilt;

    // constructors for attributes

    public Airplane(String model, int yearBuilt) {

        this.model = model;
        this.yearBuilt = yearBuilt;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    @Override
    public void fly() {
        System.out.print("I rely on my engine to fly.");
    }

    public String toString() {
        return "Airplane[model=" + model + "yearBuilt=" + yearBuilt + "]";

        }


    @Override
    public void walk() {
        System.out.println("I tax on my wheels.");

    }

    @Override
    public void jump() {
        System.out.println("I cannot jump.");

    }
}
