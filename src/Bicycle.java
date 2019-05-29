import java.util.List;

public class Bicycle<V> implements IVehicle {

    private int speed;
    private int gear;
    private String name;
    private V v;


    public Bicycle(int speed, int gear, String name,V v){
        this.speed = speed;
        this.gear = gear;
        this.name = name;
        this.v = v;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setV(V v) {
        this.v = v;
    }


    public void work(){
        System.out.println("Bicycle has " + getSpeed() + " speed and " + getGear() + " gear");
    }

    //get bicycle secretProperty.
    public <V> V secretProperty(){

        return (V)v;
    }


}
