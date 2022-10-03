package Flying;

public  class Bird implements Flight {

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
        System.out.print(" I'm an bird who flaps wings to fly");
    }

    public String toString() {
        return "Bird [type=" + type + "]";
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
