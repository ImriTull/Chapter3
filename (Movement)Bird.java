package Flying;

public class Bird implements Movement {

    private String type;

    public Bird(String type) {

        this.type = type;
    }

    // getters and setters for Bird
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public void fly() {
        System.out.print("I flap my wings to fly. ");
    }

    public String toString() {
        return "Bird [type=" + type + "]";
    }

    @Override
    public void walk(){
        System.out.println("I walk on my feet. ");
    }
    @Override
    public void jump(){
        System.out.println("I jump by leaping from my feet. ");
    }


    // @Override
    //  public void eat(){
    //   System.out.println(getName() + " eats seeds");
    //  }

    // @Override
    //  public void breathe(){
    //    System.out.println(getName() + " breathes by nose");
    //   }
    // @Override
    //  public void fly(){
    //     System.out.println(getName() + " soars through the air");
    //  }


}
