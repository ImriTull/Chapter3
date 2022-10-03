package Flying;

public class ThingsThatMove {

    public static void main(String [] args){

        Airplane airplane = new Airplane("Boeing 747", 2016);

        Bird bird1 = new Bird("Eagle");

        Bird bird2 = new Bird("HummingBird");

        Movement[] movements = {airplane, bird1, bird2};

        for (Movement movement : movements){
            System.out.println(movement);
            movement.fly();
            movement.walk();
            movement.jump();
        }
    }
}
