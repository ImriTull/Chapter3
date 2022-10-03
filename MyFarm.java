package FarmAnimals;
import java.util.Date;

public class MyFarm {

    public static void main(String[] args){
        FarmAnimal[] animals = new FarmAnimal[3];

        animals [0] = new Chicken("McCluck", "Male", 6, 4, true, true);
        animals [1] = new Cow("Betty", "Female", 1600, 7, true, true);
        animals [2] = new Duck("Mr.Bill", "Male", 5, 2, true, true);

        Date date = new Date(); // Date as well as time is executed.
        long time = date.getTime(); // total milliseconds from midnight overall since 1/1/1970
        time += 24*60*60*1000; // 24 hours from now

        for(FarmAnimal a: animals){
            feedLoadingSchedule(a, time);
            time += 30*60*1000; // add 30 mins to the time (30*60*60*1000 milliseconds)
        }
    }

    public static void feedLoadingSchedule(FarmAnimal animal, long time){

        Date date = new Date(time);
        System.out.println("Animal Name & Info: " + animal.getName() + " ," + animal.getGender() + " ," +  animal.getAge() +
                ", " + animal.getWeight() + " , " + animal);
        System.out.println("This animal needs to be fed at this time: " + date);
        System.out.println("Thank You." );

    }
}
