public interface Goable {

    public static final double pi = 3.1415926;

    double go(); //абстрактный метод

    default void defaultGo(double speed){
        System.out.println("Object's speed is " + speed + " km/h!");
    }
}
