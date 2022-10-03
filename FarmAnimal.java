package FarmAnimals;

public class FarmAnimal {

    private String name;
    private String gender;
    private int weight;
    private int age;

    // constructor for attributes
    public FarmAnimal(String name, String gender, int weight, int age) {

        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    // getters and setters for attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int name) {
        this.weight = weight;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int name) {
        this.age = age;
    }

    //to string method that returns a string including all attributes
    @Override
    public String toString(){
        return "Animal[name=" + name + ", gender=" + gender + ", weight=" + weight + ", age=" + age + "]";
     }

}
