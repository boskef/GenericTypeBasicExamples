import java.util.ArrayList;
import java.util.List;

public class Main {

    public void ride(List<? extends Bicycle> bList){

        for(Bicycle bicycle : bList) {

            bicycle.work();
            System.out.println(bicycle.secretProperty());
        }

    }
    public static void main(String[] args){

        Main main = new Main();

        List<Bicycle> bicyclesList = new ArrayList<Bicycle>();
        List<MountainBicycle> mountainList = new ArrayList<MountainBicycle>();

        bicyclesList.add(new Bicycle(10,5,"Rocker BicycleList","Private1"));
        bicyclesList.add(new Bicycle(9,5,"Coder BicycleList","Private2"));

        mountainList.add(new MountainBicycle(15,6,"Mountain Rock Star Bicycle","Private3"));
        mountainList.add(new MountainBicycle(18,7,"Mountain Bear Bicycle","Private4"));


        /*
        // Following code does not work. Because ride method parameter List reference should be Bicycle type.
        List<String> list = new ArrayList<String>();
        main.ride(list);
        */
        main.ride(bicyclesList);
        main.ride(mountainList);


    }
}
