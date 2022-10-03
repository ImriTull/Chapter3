package Flying;

public class ThingsThatFly {

    public static void main(String[] args) {

        Airplane airplane = new Airplane("Boeing 747", 2016);

        Bird bird1 = new Bird("Eagle");

        Bird bird2 = new Bird("HummingBird");

        Flight[] flights = {airplane, bird1, bird2};

        // how to loop the objects so they can print

        for (Flight flight : flights) {
            System.out.print(flight + ": ");
            flight.fly();
            System.out.println();
        }


    }
}
