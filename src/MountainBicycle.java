public class MountainBicycle<T extends Integer, E extends Integer, K extends String,V> extends Bicycle implements IVehicle{


    //If you want define at method T, E, K generic type, you can use following statement.
    public <T extends Integer, E extends Integer, K extends String,V> MountainBicycle(T t, E e,K k,V v){

        super(t,e,k,v);
        super.setV(v);
    }

    public void work(){
        System.out.println("MountainBicycle has " + getSpeed() + " speed and " + getGear() + " gear");
    }


}
